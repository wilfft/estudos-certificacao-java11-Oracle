package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static StreamsandLambdaJavaSE11DeveloperCertification.firstLook.Categoria.*;

public class DataExemplo {

    private static final List<Produto> PRODUTOS_LIST = Arrays.asList(
            new Produto(COMIDA, "feijao", new BigDecimal(1.99)),
            new Produto(BRINQUEDO, "hominho do star wars", new BigDecimal(2.99)),
            new Produto(ROUPA, "blusa de frio", new BigDecimal(4.99)),
            new Produto(COMIDA, "Bolacha Passatempo", new BigDecimal(5.99)),
            new Produto(ROUPA, "Tenix Nike shox", new BigDecimal(2.99)),
            new Produto(BRINQUEDO, "Hot wells", new BigDecimal(3.99)),
               new Produto(COMIDA, "Arroz", new BigDecimal(5.99)),
            new Produto(ROUPA, "Calça Jean", new BigDecimal(2.99)),
            new Produto(BRINQUEDO, "Lego", new BigDecimal(3.99))


    );

    public static List<Produto> getProdutos() {
        return PRODUTOS_LIST;
    }

}
