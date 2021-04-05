package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.util.List;
import java.util.Optional;

public class localizandoItensArray {
    public static void main(String[] args) {

        List<Produto> produtoList = DataExemplo.getProdutos();
        Optional<Produto> produtoEncontrado = produtoList.stream()
                .filter(e -> e.getCategoria() == Categoria.COMIDA)
                .findAny();
        //findFirst();

        System.out.println(produtoEncontrado);


        boolean temBlusaDeFrio = produtoList.

                stream().anyMatch(e -> e.getNome().equals("blusa de frio"));
//noneMatch
// allMatch

        System.out.println(temBlusaDeFrio);
    }


}
