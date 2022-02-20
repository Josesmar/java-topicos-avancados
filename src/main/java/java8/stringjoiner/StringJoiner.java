package java8.stringjoiner;

public class StringJoiner {
    public StringJoiner(String s) {
    }

    public static void main(String[] args) {

        /*String nomes = " Josesmar, Pamela, Maiara, Joice ";

        StringTokenizer st = new StringTokenizer(nomes, ",");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }*/
        java.util.StringJoiner sj = new java.util.StringJoiner(",");
        sj.add(" Josesmar");
        sj.add(" Pamela");
        sj.add(" Maiara");
        sj.add(" Joice");

        System.out.println(sj);

    }
}

