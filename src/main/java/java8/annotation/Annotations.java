package java8.annotation;

public class Annotations {
    public static void main(String[] args) {

        Voltagem[] voltagens = Produto.class.getAnnotationsByType(Voltagem.class);

        for (Voltagem voltagen : voltagens) {
            System.out.println(voltagen.tensao());

        }
    }
}
