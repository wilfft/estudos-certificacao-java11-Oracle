package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class EncontraProduto {
    static Optional<Produto> findProducts(List<Produto> produtos, Predicate<Produto> function) {
        for (Produto p : produtos) {
            if (function.test(p)) {
               System.out.println(Optional.of(p));
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        List<Produto> produtos = DataExemplo.getProdutos();

        String nome = "blusa de frio";
        Optional<Produto> resultado = findProducts(produtos, p -> p.getNome().equals(nome));


        findProducts(produtos, produto -> produto.getNome().equals(nome))
                .map(e -> e.getPreco()).ifPresentOrElse(
                p -> System.out.printf("produto %s encontrado por: R$ %.2f %n  ", nome, p),
                () -> System.out.printf("Produto nao encontrado %n!", nome)
        );
    }


}
