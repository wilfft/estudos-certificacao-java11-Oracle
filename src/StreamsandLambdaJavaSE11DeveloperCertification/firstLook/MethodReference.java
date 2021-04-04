package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.math.BigDecimal;
import java.util.List;

public class MethodReference {

    interface FactoryMethod {
        Produto criarProduto(Categoria categoria, String nome, BigDecimal preco);

    }

    static boolean metodoEstatico(Produto produto) {
        return produto.getPreco().compareTo( BigDecimal.valueOf( 2.99 )) >= 0;
    }

    public static void main(String[] args) {
        List<Produto> produtosLista = DataExemplo.getProdutos();
        produtosLista.removeIf(MethodReference::metodoEstatico);
        produtosLista.forEach(System.out::println);
        System.out.println("STREAM");

        produtosLista.stream().map(Produto::getNome).forEach(System.out::println);

        FactoryMethod fabricaDeProduto = Produto::new;

        fabricaDeProduto.criarProduto(Categoria.ROUPA, "Boné", new BigDecimal(2.00));

    }

}
