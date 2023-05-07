public class multithread {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            multithreadthing ob = new multithreadthing(i);
            Thread newthread = new Thread(ob);
            newthread.start();
        }

    }
}