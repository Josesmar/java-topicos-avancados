package java8.methodreferences;

import java.util.ArrayList;
import java.util.List;

/*
  O method references utiliza o simboulo ::
  Classe ou objeto :: metodo referenciado
 */
public class Application {
    public static void main(String[] args) {

        //Lambda expression
        Figura2D fig1 = (l, a) -> System.out.println("Desenha figura de largura: " + l +  " e altura : " + a);
        fig1.desenha(8.0,1.5);

        //Instancia especifica
        Retangulo ret = new Retangulo();
        //Method reference
        Figura2D fig2 = ret::desenhaRetangulo;

        fig2.desenha(10.0,7.0);


        List<Produto> lista = new ArrayList<Produto>();

        lista.add(new Produto("TV 42", 2000.0));
        lista.add(new Produto("Geladeira", 3200.0));
        lista.add(new Produto("Fogão 4 bocas", 900.0));
        lista.add(new Produto("VideoGame", 1999.00));
        lista.add(new Produto("Microondas", 500.0));

        //Lambda expression com argumento
        lista.forEach((p)-> System.out.println(p.getNome() + " = " + p.getPrice()));
        System.out.println();

        //Method reference static
        lista.forEach(Impressora::imprime);

        //Method reference de uma instancia de um objeto arbitrário
        lista.forEach(Produto::imprime);

        //Method reference por constructor
        Figura2D fig3 = Retangulo::new;
        fig2.desenha(6.0, 3.0);
    }
}
