package java8.methodreferences;

public class Retangulo {

    public void desenhaRetangulo(Double largura, Double altura){
        System.out.println("Desenha retângulo de largura: " + largura + " e altura: " + altura);
    }

    public Retangulo(){}

    public Retangulo(Double largura, Double altura){
        System.out.println("Desenha retângulo de largura: " + largura + " e altura: " + altura);
    }
}
