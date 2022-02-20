package java8.stream;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<Produto>();

        lista.add(new Produto(1,"TV 42", 2000.0));
        lista.add(new Produto(2,"Geladeira 470l", 3200.0));
        lista.add(new Produto(3,"Fogão 4 bocas", 900.0));
        lista.add(new Produto(4,"VideoGame", 1999.00));
        lista.add(new Produto(2,"Geladeira 400l", 2900.0));
        lista.add(new Produto(5,"Microondas", 500.0));
        lista.add(new Produto(2,"Geladeira 570l", 4200.0));

        //lista de geladeiras
        List<Produto> listaGeladeiras = new ArrayList<>();
        for (Produto p : lista){
            if(p.getNome().contains("Geladeira")){
                listaGeladeiras.add(p);
            }
        }

        //Ordena a lista de geladeira
        Collections.sort(listaGeladeiras, new OrdenaProdutoPorPreco());

        //Lista dos nomes das geladeiras
        List<String> listaNomeGeladeiras = new ArrayList<>();
        for (Produto p : listaGeladeiras){
            if(p.getNome().contains("Geladeira")){
                listaNomeGeladeiras.add(p.getNome().toUpperCase());
            }
        }

        //Exibe os nomes das geladeiras
        for(String nome: listaNomeGeladeiras){
            System.out.println(nome);
        }

        lista.stream().filter(p -> p.getNome()
                .contains("Geladeira"))
                .sorted((p1,p2) -> p1.getPrice().compareTo(p2.getPrice()))
                .map(p -> p.getNome().toUpperCase())
                .forEach(System.out::println);

    }
}
