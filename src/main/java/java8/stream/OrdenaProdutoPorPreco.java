package java8.stream;

import java.util.Comparator;

public class OrdenaProdutoPorPreco implements Comparator<Produto> {

    @Override
    public int compare (Produto p1, Produto p2){
        return p1.getPrice().compareTo(p2.getPrice());
    }
}
