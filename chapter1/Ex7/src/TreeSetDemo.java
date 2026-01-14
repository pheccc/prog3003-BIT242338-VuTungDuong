import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // 1. Tạo một TreeSet và thêm các tên
        TreeSet<String> names = new TreeSet<>();
        names.add("Bien");
        names.add("Thai Ha");
        names.add("Tung Duong");
        names.add("Gia Bao");

        // 2. In danh sách (sẽ thấy Bien, Gia Bao, Tung Duong, Thai Ha
        System.out.println("Danh sach sap xep: " + names);

        // 3. Lấy phần tử đầu tiên và cuối cùng
        System.out.println("Phan tu dau tien (nho nhat): " + names.first());
        System.out.println("Phan tu cuoi cung (lon nhat): " + names.last());
    }
}