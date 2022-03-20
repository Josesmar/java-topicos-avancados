package java8.reflectmetodoseparametros;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflexaoExemplo {

    public static void main(String[] args) {

        //Instância da classe produto
        Produto produto = new Produto("Geladeira", 3000.0);

        //Instância da classe Class
        Class classe = produto.getClass();

        //Todos os métodos declarados na classe Produto
        Method [] method =  classe.getDeclaredMethods();

        for(Method m : method){
            System.out.println(m.getName());

            Parameter[] parameter = m.getParameters();

            for(Parameter pr : parameter){
                System.out.println(pr);
            }
        }
    }
}
