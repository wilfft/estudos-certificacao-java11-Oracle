package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class TreinaComposeEAndThen {

    static Optional<Produto> achaProdutoInformado(List<Produto> produtos, Predicate predicate) {
        for (Produto produto : produtos) {
            if (predicate.test(produto)) {
                return Optional.of(produto);
            }

        }
        return Optional.empty();
    }


    public static void main(String[] args) {
        List<Produto> produtos = DataExemplo.getProdutos();
        String produtoInformado = "feijao";
        BigDecimal valorLimite = BigDecimal.valueOf(2.00);

        Predicate<Produto> contemNome = e -> e.getNome().equals(produtoInformado);

        Optional<Produto> produtoEncontrado = achaProdutoInformado(produtos, contemNome);

        Function<Produto, BigDecimal> retornaPrecoEmValor = Produto::getPreco;
        Function<BigDecimal, String> retornaPrecoEmTexto = e -> String.format("Produto %s encontrado, valor R$ %.2f", produtoInformado, e);

        //  Function<Produto, String> combinaFunction = retornaPrecoEmValor.andThen(retornaPrecoEmTexto);
        Function<Produto, String> combinaFunction = retornaPrecoEmTexto.compose(retornaPrecoEmValor);
        // o compose inverte a ordem


        produtoEncontrado.ifPresent(System.out::println);
        achaProdutoInformado(produtos, contemNome)
                .map(e -> e.getPreco())
                .map(e -> String.format("Preço do %s é R$ %.2f", produtoInformado, e))
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Produto não encontrado")
                );
        achaProdutoInformado(produtos, contemNome).map(combinaFunction)
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("Produto nao ecnontrado"));


        Predicate<Produto> produtoEspecifico = e -> Categoria.COMIDA == e.getCategoria();


        Predicate<Produto> barato = e -> e.getPreco().compareTo(valorLimite) < 0;

        achaProdutoInformado(produtos, produtoEspecifico.and(barato)).ifPresentOrElse(System.out::println,
                () -> System.out.println("nao encontrado"));

    }


}
