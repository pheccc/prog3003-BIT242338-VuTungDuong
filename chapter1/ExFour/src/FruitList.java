import java.util.ArrayList; // Nhớ dòng import này

public class FruitList {
    public static void main(String[] args) {
        // 1. Tạo ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Tao");
        fruits.add("Chuoi");
        fruits.add("Cam");

        // 2. Thêm "Mango" vào index 1
        fruits.add(1, "Xoai");

        // 3. Thay thế "Banana" bằng "Grapes"
        int index = fruits.indexOf("Chuoi");
        if (index != -1) {
            fruits.set(index, "Grapes");
        }

        // 4. Kiểm tra "Apple" và in kết quả
        System.out.println("Danh sach qua: " + fruits);
        System.out.println("Co T khong? " + fruits.contains("Apple"));
    }
}