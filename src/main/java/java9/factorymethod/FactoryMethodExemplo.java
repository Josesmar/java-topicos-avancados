package java9.factorymethod;

import java.util.List;

public class FactoryMethodExemplo {
    public static void main(String[] args) {

        //Set e Map não permitem dados duplicados na lista

        List<String> lista =  List.of("Banana", "Maça", "Pera", "Pera");

        for(String s : lista) {
            System.out.println(s);
        }
    }
}
