package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsList {

    public static void main(String[] args) {
        List<Produto> produtoList = DataExemplo.getProdutos();

        List<String> nomesDosProdutos = new ArrayList<>();


        nomesDosProdutos = produtoList.stream()
                .map(Produto::getNome)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(nomesDosProdutos);

        String
                nomeDasCategoriasDistintas =
                produtoList.stream()
                        .map(Produto::getCategoria)
                        .distinct()
                        .map(Categoria::name)
                        .collect(Collectors.joining("; "));
        System.out.println(nomeDasCategoriasDistintas);

    }


}
