import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnUtils {
    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/mysql";
            String id = "root";
            String password = "1q2w3e4r";
            Class.forName("com.mysql.jdbc.Driver");

            DriverManager.getConnection("jdbc:mysql://localhost:/?serverTimezone=UTC&useSSL=false", id, password);
            System.out.println("성공");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
