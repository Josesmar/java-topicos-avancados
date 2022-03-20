package java8.annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Voltagens.class)
@interface Voltagem{
    String tensao();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Voltagens{
    Voltagem[] value();
}

@Voltagem(tensao = "110")
@Voltagem(tensao = "220")
public class Produto {

    private String nome;
    private Double price;

    public Produto() {
    }

    public Produto(String nome, Double price) {
        this.nome = nome;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void imprime(){
        System.out.println(nome + " = " + price);
    }
}

