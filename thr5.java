 class ByRunnable implements Runnable {
     public void run() {
         System.out.println("Thread using runnable interface");


     }
 }
public class thr5 {
    public static void main(String[] args) {
        ByRunnable as=new ByRunnable();
        Thread t3=new Thread(as);
        t3.start();
        try{
            t3.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        for (int y=1; y<=5; y++){
            System.out.println(y);
        }
        System.out.println("main thread is running ");
    }
}