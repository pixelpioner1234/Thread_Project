public class Threadclass extends Thread{

    /*@Override
    public void run() {
        System.out.println("Thread is going.");

    }*/


    private int threadNumber;
    public Threadclass(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        //System.out.println("Thread " + threadNumber + " is started.");

        /*try {
            Threadclass.sleep(threadNumber*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        if (Counter.count < 3){
            Counter.increment();
            System.out.println("Thread " + threadNumber + "increment current state: " + Counter.count);
        }else{
            Counter.decrement();
            System.out.println("Thread " + threadNumber + " decrement");
        }
        //System.out.println("Thread " + threadNumber + " is finished.");
    }


}
