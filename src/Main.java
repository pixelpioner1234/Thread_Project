import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){

        /*Threadclass threadclass = new Threadclass();               // создаётся 1 поток
        threadclass.start();*/




        /*for (int i = 1; i <= 5; i++) {
            Threadclass threadclass = new Threadclass(i);
            threadclass.start();
            try {
                threadclass.join();                                   // потоки идут последовательно
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

        System.out.println(Counter.count);
        ExecutorService executor = Executors.newFixedThreadPool(5);   // пулы потоков
        for (int i = 1; i <= 5; i++) {
            Threadclass threadclass = new Threadclass(i);
            executor.execute(threadclass);
        }
        executor.shutdown();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Counter.count);


    }
}
