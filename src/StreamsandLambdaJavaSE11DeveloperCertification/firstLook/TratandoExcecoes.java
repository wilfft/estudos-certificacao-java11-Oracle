package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TratandoExcecoes {

    public static void main(String[] args) throws IOException {
        List<Produto> produtos = DataExemplo.getProdutos();
        try {
            FileWriter arquivo = new FileWriter("listaProdutos.txt");
            produtos.forEach(produto -> {
                System.out.println(produto);
                try {
                    arquivo.write(produto.toString());
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            });
        } catch (IOException | RuntimeException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }


    }


}
