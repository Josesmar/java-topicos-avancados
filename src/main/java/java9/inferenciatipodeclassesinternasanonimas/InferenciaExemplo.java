package java9.inferenciatipodeclassesinternasanonimas;

public class InferenciaExemplo {
    public static void main(String[] args) {

        //Classe interna anonima <> não precisa passar o tipo
        SomaTudo<String> somaString = new SomaTudo<>() {
            @Override
            public String soma(String a, String b) {
                return a + b;
            }
        };
        System.out.println(somaString.soma("Olá", " mundo"));
    }
}
