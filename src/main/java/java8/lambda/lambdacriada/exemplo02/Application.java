package java8.lambda.lambdacriada.exemplo02;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<Produto>();

        lista.add(new Produto("TV 42", 2000.0));
        lista.add(new Produto("Geladeira", 3200.0));
        lista.add(new Produto("Fogão 4 bocas", 900.0));
        lista.add(new Produto("VideoGame", 1999.00));
        lista.add(new Produto("Microondas", 500.0));

        //Lambda expression com argumento
        lista.forEach((p)-> System.out.println(p.getNome() + " =  " + p.getPrice()));
        System.out.println();

        // Lambda com dois argumentos do tipo explicito
        lista.sort((nome1, nome2) -> nome1.getPrice().compareTo(nome2.getPrice()));
        lista.forEach((p)-> System.out.println(p.getNome() + " = " + p.getPrice()));

        // Multiplos métodos
        lista.forEach((p)-> {
            System.out.println(p.getNome());
            System.out.println(p.getPrice());
        });

    }
}
