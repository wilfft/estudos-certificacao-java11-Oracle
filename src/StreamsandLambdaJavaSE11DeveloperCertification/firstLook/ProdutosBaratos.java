package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProdutosBaratos {

    interface FiltroProduto {
        boolean accept(Produto produto);
    }

    static void printaProdutos(List<Produto> produtos, FiltroProduto filtro) {
        for (Produto p : produtos) {
            if (filtro.accept(p)) {

            }
        }
    }

    public static void main(String[] args) {
        List<Produto> produtos = DataExemplo.getProdutos();
        List<Produto> produtosBaratos = new ArrayList<>();
        BigDecimal precoLimite = new BigDecimal(2.00);
        produtos.forEach(produto -> {
            if (produto.getPreco().compareTo(precoLimite) > 0) {
                produtosBaratos.add(produto);
            }
        });

        produtosBaratos.forEach(System.out::println);

    }
}