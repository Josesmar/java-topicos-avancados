package java8.parallelarray;

import java.util.Arrays;

public class ParallelArraySortingExemplo {

    public static void main(String[] args) {

        int[] numeros = {-3, 123,21,3,4,5};

        for(int i : numeros){
            System.out.print(i + " ");
        }

        System.out.println();

        /* ParallelSort da classe array (Passando os valores no final escolhando a partir de qual posição e até qual
        quero ordendar
        */

            Arrays.parallelSort(numeros, 0, 4);
        for(int i : numeros){
            System.out.print(i + " ");
        }
    }

}
