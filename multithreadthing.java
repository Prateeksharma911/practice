
public class multithreadthing implements Runnable {
    private int threadNumber;
    public multithreadthing (int threadNumber) {
        this.threadNumber = threadNumber;
    }
    public void run(){
        System.out.println("Thread running->"+this.threadNumber);
        for (int i = 0; i < 5; i++) {
            System.out.println(i+" from thread running->"+this.threadNumber);
            if (threadNumber == 3) {
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}