import java.util.HashMap;

public class EmployeeManager {
    public static void main(String[] args) {
        // 1. Tạo HashMap<Integer, String> (ID và Tên)
        HashMap<Integer, String> employees = new HashMap<>();

        // 2. Thêm 3 nhân viên
        employees.put(101, "Thai Ha");
        employees.put(102, "Duong");
        employees.put(103, "Gia Bao");

        // 3. Lấy tên nhân viên có ID 102
        System.out.println("Nhan vien ID 102: " + employees.get(102));

        // 4. Kiểm tra ID 105, nếu không có thì thêm mới
        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
        }

        System.out.println("Danh sach nhan vien: " + employees);
    }
}