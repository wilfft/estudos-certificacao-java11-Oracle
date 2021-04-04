package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ifAbsentProdutoPorCategoria {
    public static void main(String[] args) {
        List<Produto> produtos = DataExemplo.getProdutos();
        HashMap<Categoria, List<Produto>> produtosPorCategoria = new HashMap<>();

        for (Produto produto : produtos) {
            Categoria categoria = produto.getCategoria();

            produtosPorCategoria.computeIfAbsent(categoria, c -> new ArrayList<>()).add(produto);
        }

    }


}
