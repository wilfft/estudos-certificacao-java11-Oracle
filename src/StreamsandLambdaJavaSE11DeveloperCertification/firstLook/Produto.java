package StreamsandLambdaJavaSE11DeveloperCertification.firstLook;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto {

    private Categoria categoria;
    private String nome;
    private BigDecimal preco;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Lambda{" +
                "categoria=" + categoria +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto lambda = (Produto) o;
        return categoria == lambda.categoria && Objects.equals(nome, lambda.nome) && Objects.equals(preco, lambda.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoria, nome, preco);
    }
}
