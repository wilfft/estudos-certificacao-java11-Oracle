package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ifAbsentProdutoPorCategoria {
    public static void main(String[] args) {
        List<Produto> produtos = DataExemplo.getProdutos();
        Map<Categoria, List<Produto>> produtosPorCategoria = new HashMap<>();

        for (Produto produto : produtos) {
            //Categoria categoria = produto.getCategoria();
            produtosPorCategoria.computeIfAbsent(produto.getCategoria(), c -> new ArrayList<>()).add(produto);
        }

        produtosPorCategoria.forEach((categoria, itens) -> {
            System.out.println(categoria);
            itens.forEach(e -> System.out.println("- " + e.getNome()));
        });
    }

}
