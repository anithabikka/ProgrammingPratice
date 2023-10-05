package javapratice.jdbc;


import java.sql.*;
import java.sql.ResultSet;

public class jdbcexample {
    public static  void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/practise_jdbc";
        String user = "root";
        String password = "Bikka@24";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select * from students");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
