import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDB {
    public static void main(String[] args) {
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection conn = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/smartrail",
    "smartuser",
    "smartpass"
);

            System.out.println("✅ Connected!");
            conn.close();
        } catch (Exception e) {
            System.out.println("❌ Connection failed.");
            e.printStackTrace();
        }
    }
}
