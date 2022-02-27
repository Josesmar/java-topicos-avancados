package java8.inferenciatype;


import java.util.ArrayList;
import java.util.List;

public class TypeInference {
    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("TV 42", 2000.0));
        lista.add(new Produto("Geladeira", 3200.0));
        lista.add(new Produto("Fogão 4 bocas", 900.0));
        lista.add(new Produto("VideoGame", 1999.00));
        lista.add(new Produto("Microondas", 500.0));

        //Capacidade do compilador identificar o tipo adqueado
        ImprimeProdutos.imprime(new ArrayList<>());
    }

}
