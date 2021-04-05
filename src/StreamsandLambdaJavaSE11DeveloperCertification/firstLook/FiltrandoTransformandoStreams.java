package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Pattern;

public class FiltrandoTransformandoStreams {

    public static void main(String[] args) {

        List<Produto> lista = DataExemplo.getProdutos();

        lista
                .stream()
                .filter(s -> s.getCategoria().equals(Categoria.COMIDA))
                .map(Produto::getNome)
                .forEach(System.out::println);

        Pattern pattern = Pattern.compile("\\s+");

        lista
                .stream()
                .filter(p -> p.getPreco().compareTo(BigDecimal.valueOf(2)) > 0)
                .sorted((a, b) ->
                        a.getNome().compareToIgnoreCase(b.getNome())
                )
                .forEach(System.out::println);


        lista.stream()
                .flatMap(e -> pattern.splitAsStream(e.getNome()))
                .forEach(System.out::println)      ;

    }


}
