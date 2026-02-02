import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        CompletableFuture<Void> checkProduct =
            CompletableFuture.runAsync(() -> {
                try {
                    Thread.sleep(2000);
                    System.out.println("Kiem tra san pham hoan tat");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

        CompletableFuture<Void> payment =
            CompletableFuture.runAsync(() -> {
                try {
                    Thread.sleep(3000);
                    System.out.println("Thanh toan hoan tat");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

        CompletableFuture<Void> shipping =
            CompletableFuture.runAsync(() -> {
                try {
                    Thread.sleep(2500);
                    System.out.println("Van chuyen hoan tat");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

        // Ket hop tat ca cac tac vu
        CompletableFuture<Void> allTasks =
            CompletableFuture.allOf(checkProduct, payment, shipping);

        // Khi tat ca hoan thanh
        allTasks.thenRun(() ->
            System.out.println("Don hang da duoc xu ly hoan tat")
        );

        // Cho chuong trinh ket thuc
        allTasks.join();
    }
}
