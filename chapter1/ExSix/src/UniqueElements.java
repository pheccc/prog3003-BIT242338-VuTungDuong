import java.util.HashSet;
import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        // 1. Cho một mảng số nguyên có nhiều phần tử trùng nhau
        Integer[] numbers = {5, 2, 9, 2, 5, 8, 1};

        // 2. Đưa các phần tử này vào một HashSet
        // HashSet sẽ tự động loại bỏ các số trùng như 5 và 2
        HashSet<Integer> set = new HashSet<>(Arrays.asList(numbers));

        // 3. In danh sách các phần tử duy nhất
        System.out.println("Cac phan tu duy nhat: " + set);

        // 4. Giải thích tại sao thứ tự in ra có thể khác mảng đầu:
        /* Giai thich: HashSet su dung co che Bam (Hashing) de luu tru phan tu
           nham toi uu toc do tim kiem. Do do, no khong duy tri thu tu sap xep
           nhu khi chung ta them vao (khac voi ArrayList hay LinkedList).
        */
    }
}
