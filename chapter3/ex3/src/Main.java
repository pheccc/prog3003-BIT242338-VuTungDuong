import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        CompletableFuture<String> future =
            CompletableFuture
                // B1: Cung cấp array bất đồng bộ
                .supplyAsync(() -> {
                    return Arrays.asList(1, 2, 5, 3, 100);
                })

                // B2: Lọc số lẻ và sắp xếp
                .thenApply(list ->
                    list.stream()
                        .filter(n -> n % 2 != 0)
                        .sorted()
                        .collect(Collectors.toList())
                )

                // B3: Chuyển thành chuỗi
                .thenApply(result ->
                    "Ket qua la: " + result
                );

        // B4: In ra màn hình
        future.thenAccept(System.out::println);

        // Chờ CompletableFuture hoàn thành
        future.join();
    }
}
