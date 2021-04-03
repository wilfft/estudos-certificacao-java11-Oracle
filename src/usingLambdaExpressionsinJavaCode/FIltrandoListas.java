package usingLambdaExpressionsinJavaCode;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

class Usuario {
    private String nome;


    public String getNome() {
        return nome;
    }

    public Usuario(String nome) {
        this.nome = nome;
    }
    static void metodo (){

    }
}

public class FIltrandoListas {
    public static void main(String[] args) {
        List<Usuario> usuarios = List.of(
                new Usuario("William"),
                new Usuario("Marcos"),
                new Usuario("Pamela"));
        List<String> soNomes = new ArrayList<>();


        Function<Usuario, String> nomeParaLista = user -> user.getNome();

        String teste = nomeParaLista.apply(usuarios.get(1));
        System.out.println(teste);

        for (var user : usuarios) {
            soNomes.add(nomeParaLista.apply(user));
        }


        Consumer<String> mostraNome = s -> System.out.println(s);
        soNomes.forEach(mostraNome);
        soNomes.forEach(e -> System.out.println(e));
        usuarios.forEach(e -> System.out.println(e));
    }


}
