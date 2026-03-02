import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex1 {

    public static void main(String[] args) {

        // ✅ ĐÚNG database của bạn
        String url = "jdbc:mysql://localhost:3306/javafx_demo?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "huylun12";   // để rỗng nếu MySQL không có mật khẩu

        try {
            // 1. Kết nối database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Kết nối thành công!");

            // 2. Tạo Statement
            Statement stmt = conn.createStatement();

            // 3. Thực thi câu lệnh SELECT
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // 4. In dữ liệu (đúng theo cấu trúc bảng của bạn: id + name)
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println(id + " - " + name);
            }

            // 5. Đóng kết nối
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}