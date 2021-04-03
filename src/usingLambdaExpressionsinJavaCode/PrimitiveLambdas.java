package usingLambdaExpressionsinJavaCode;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;
import java.util.function.Predicate;

public class PrimitiveLambdas {
    public static void main(String[] args) {
        IntSupplier sup = () -> 10;


        int i = sup.getAsInt();
        System.out.println(i);

        DoubleToIntFunction doubToInt = (double d) -> (int) Math.floor(d);
        int pi = doubToInt.applyAsInt(20);
        System.out.println(pi);


        Consumer consumer = string -> System.out.println(string);
        Consumer consumer2 = string -> System.out.println(string);

        consumer.accept("hello");
        consumer2.accept("world");

        Consumer c3 = string -> {
            consumer.accept(string);
            consumer2.accept(string);
        };
        c3.accept("vim do c3");
        Consumer c4 = s -> consumer.andThen(consumer2);

        List<String> lista = List.of("Wiliam", "teste", "cavalo", "joao");
        Predicate<String> filtro = s -> s.startsWith("t");
        lista.removeIf(filtro);
        lista.removeIf(elemento -> elemento.length() > 5);
        Consumer<String> funcao = string -> System.out.println(string);
        lista.forEach(funcao);
        lista.forEach(String -> System.out.println(String.concat("OLA")));


    }
}



