package dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnUtils {
    public static Connection getConnection() {

        Connection connection = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspfinalproject?serverTimezone=UTC", "root", "1q2w3e4r");

            System.out.println("성공");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
