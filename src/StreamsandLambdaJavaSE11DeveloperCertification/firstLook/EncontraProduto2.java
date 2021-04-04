package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class EncontraProduto2 {

    static Optional<Produto> findProducts(List<Produto> produtos, Predicate<Produto> predicate) {
        for (Produto p : produtos) {
            if (predicate.test(p)) {

                System.out.printf("Produto encontrado: %s%n", p);
                return Optional.of(p);
            }
        }
        return Optional.empty();

    }

    public static void main(String[] args) {

        List<Produto> produtos = DataExemplo.getProdutos();
        String nome = "blusa de frio";

        Predicate<Produto> predicate = p -> p.getNome().equals(nome);

        findProducts(produtos, predicate);
        findProducts(produtos, predicate)
                .map(Produto::getPreco)
                .ifPresentOrElse(
                        e -> System.out.printf("preço encontrado: RS%.2f", e),
                        () -> System.out.println("preço nao encontrado")
                );


    }
}
