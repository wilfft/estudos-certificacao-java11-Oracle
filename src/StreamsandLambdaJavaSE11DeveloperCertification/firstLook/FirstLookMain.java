package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;


public class FirstLookMain {

    interface FiltraProduto {
        boolean accept(Produto produto);
    }


    static void printaProdutos(List<Produto> produtos, FiltraProduto filtro) {
        for (Produto produto : produtos) {
            if (filtro.accept(produto)) {
                System.out.println(produto.getNome());
            }
        }

    }

    public static void main(String[] args) {
        List<Produto> produtos = DataExemplo.getProdutos();

        produtos.sort(new Comparator<Produto>() {
            @Override
            public int compare(Produto o1, Produto o2) {
                return o1.getPreco().compareTo(o2.getPreco());
            }
        });

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        produtos.sort((o1, o2) -> o2.getPreco().compareTo(o1.getPreco()));
        System.out.println();
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        final BigDecimal PRECO_LIMITE = new BigDecimal(2.00);
        FiltraProduto filtro = produto -> produto.getPreco().compareTo(PRECO_LIMITE) > 0;


        System.out.println("\nProdutos mais caros que: " + PRECO_LIMITE);
        printaProdutos(produtos, filtro);


    }


}
