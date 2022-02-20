package java8.methodreferences;

public class Impressora {

    public static void imprime(Produto p){
        System.out.println(p.getNome() + " = " + p.getPrice());
    }

}
