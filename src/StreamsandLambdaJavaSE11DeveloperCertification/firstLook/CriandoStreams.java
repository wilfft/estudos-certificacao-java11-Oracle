package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        String[] array = new String[]{"wil", "foo"};
        Stream<String> streamDeArray = Arrays.stream(array);
        Stream<String> streamA = Stream.of("x", "x", "ds");
        Stream<String> streamNulable = Stream.ofNullable("TESTE");
        Stream<?> sreamEmpty = Stream.empty();

        IntStream inteiros = new Random().ints(1, 7);
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("listaProdutos.txt"));
            leitor.lines().forEach(System.out::println);

        } catch (Exception e) {
            System.out.println(e);
        }
    }}
