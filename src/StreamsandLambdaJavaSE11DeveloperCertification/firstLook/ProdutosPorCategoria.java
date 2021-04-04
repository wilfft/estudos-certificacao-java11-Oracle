package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProdutosPorCategoria {


    public static void main(String[] args) {

        List<Produto> produtoList = DataExemplo.getProdutos();
        HashMap<Categoria, List<Produto>> produtoPorCategoria = new HashMap<>();


        for (Produto p : produtoList) {
            Categoria categoria = p.getCategoria();

            if (!produtoPorCategoria.containsKey(categoria)) {
                produtoPorCategoria.put(categoria, new ArrayList<>());
            }
            produtoPorCategoria.get(categoria).add(p);

        }
        // produtoList.stream().forEach(System.out::println);
        produtoPorCategoria.forEach((c, p) -> System.out.printf("%s%n", p));

    }

}
