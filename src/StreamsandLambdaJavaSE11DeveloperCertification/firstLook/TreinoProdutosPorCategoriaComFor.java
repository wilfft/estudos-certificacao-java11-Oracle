package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreinoProdutosPorCategoriaComFor {

    public static void main(String[] args) {

        List<Produto> produtos = DataExemplo.getProdutos();
        Map<Categoria, List<Produto>> produtosPorCategoria = new HashMap<>();


        for (Produto p : produtos) {
            Categoria cat = p.getCategoria();
            if (!produtosPorCategoria.containsKey(cat)) {
                produtosPorCategoria.put(cat, new ArrayList<>());
            }
            produtosPorCategoria.get(cat).add(p);
        }
        produtosPorCategoria.forEach((cat, itens) -> {
            System.out.println(cat);
            itens.forEach(e -> System.out.println("- " + e.getNome()));
        });
    }
}
