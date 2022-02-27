package java8.inferenciatype;

import java.util.List;

public class ImprimeProdutos {

    public static void imprime(List<Produto> list){
        if(!list.isEmpty()){
            list.forEach(p-> System.out.println(p.getNome()));
        } else{
            System.out.println("Lista vazia");
        }
    }
}
