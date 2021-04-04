package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeparandoProdutosPorCategoria {


    public static void main(String[] args) {

        List<Produto> produtos = DataExemplo.getProdutos();
        Map<Categoria, List<Produto>> produtosPorCategoria = new HashMap<>();

        for (Produto p : produtos) {
            Categoria categoria = p.getCategoria();
            if (!produtosPorCategoria.containsKey(categoria)) {
                produtosPorCategoria.put(categoria, new ArrayList<>());
            }
        }

    }


}
