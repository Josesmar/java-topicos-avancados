package java9.melhoriatrycatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchExemplo {

    public static void main(String[] args) {

        try {
            lerArquivoBlocoTryComRecurso("src/file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Antes do java 7 -  "modo tradicional"
    public static void lerArquivoComBlocoTryCatchFinally(String path) throws IOException {
        String linha = "";

        BufferedReader br = new BufferedReader(new FileReader(path));

        try{
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        }
        catch (IOException e){
            throw e;
        }
        finally {
            if(br !=null){
                br.close();
            }
        }

    }

    //A partir do java 7
    public static void lerArquivoBlocoTryComRecurso(String path) throws IOException{
        String linha = "";
        BufferedReader br = new BufferedReader(new FileReader(path));

        try (br){
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        }
    }

}
