// Main.java
public class main {
    public static void main(String[] args) {

        WorkerThread t1 = new WorkerThread();
        t1.start(); // chạy thread kế thừa Thread

        WorkerRunnable worker = new WorkerRunnable();
        Thread t2 = new Thread(worker);
        t2.start(); // chạy thread từ Runnable
    }
}


