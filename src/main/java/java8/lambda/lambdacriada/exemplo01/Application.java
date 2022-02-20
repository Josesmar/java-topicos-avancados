package java8.lambda.lambdacriada.exemplo01;

public class Application {
    public static void main(String[] args) {

        Figura figura1 = new Figura() {
            @Override
            public void desenha() {
                System.out.println("Desenha figura 1");

            }
        };

        figura1.desenha();

        Figura figura2 = () -> System.out.println("Desenha figura 2");
        figura2.desenha();
    }
}
