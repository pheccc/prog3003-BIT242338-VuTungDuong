import java.sql.*;

public class Ex2 {

    public static void main(String[] args) {

        int idToDelete = 5; // nhập id cần xóa

        String url = "jdbc:mysql://localhost:3306/javafx_demo?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "huylun12";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "DELETE FROM users WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, idToDelete);

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Xoa thanh cong!");
            } else {
                System.out.println("Khong tim thay user de xoa");
            }

            pstmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}