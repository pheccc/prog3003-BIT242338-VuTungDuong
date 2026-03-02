import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    // Thông tin kết nối MySQL
    static final String DB_URL = "jdbc:mysql://localhost:3306/simple_jdbc";
    static final String USER = "root";
    static final String PASS = "huylun12"; // nếu có mật khẩu thì điền vào

    public static void main(String[] args) {

        System.out.println("=== BAT DAU CHUONG TRINH JDBC ===");

        try {
            // 1. Kết nối CSDL
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Ket noi MySQL thanh cong!");

            // 2. Insert dữ liệu
            String insertSQL = "INSERT INTO users(name, email) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(insertSQL);
            ps.setString(1, "Vu Tung Duong");
            ps.setString(2, "duong@gmail.com");
            ps.executeUpdate();
            System.out.println("Insert thanh cong!");

            // 3. Select dữ liệu
            String selectSQL = "SELECT * FROM users";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(selectSQL);

            System.out.println("Danh sach users:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("email")
                );
            }

            // 4. Đóng kết nối
            rs.close();
            stmt.close();
            ps.close();
            conn.close();

            System.out.println("=== KET THUC CHUONG TRINH ===");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
