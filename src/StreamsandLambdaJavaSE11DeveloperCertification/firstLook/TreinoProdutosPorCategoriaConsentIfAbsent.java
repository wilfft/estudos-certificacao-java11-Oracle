package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreinoProdutosPorCategoriaConsentIfAbsent {

    public static void main(String[] args) {

        List<Produto> produtoList = DataExemplo.getProdutos();
        Map<Categoria, List<Produto>> produtosPorCategoria = new HashMap<>();

        for (Produto produto : produtoList) {
            Categoria cat = produto.getCategoria();
            produtosPorCategoria.computeIfAbsent(cat, e -> new ArrayList<>()).add(produto);
        }
        produtosPorCategoria.forEach((cat, itens) -> {
                    System.out.printf("%n%s%n",cat);
                    itens.forEach(e -> System.out.println(e.getNome()));
                }
        );
    }
}
