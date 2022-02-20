package java8.lambda;

public class ApplicationExemploThread {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 em execução");
            }
        });

        t1.start();

        Thread t2 = new Thread(() ->System.out.println("Thread 2 em execuçção"));

        t2.start();
    }
}
