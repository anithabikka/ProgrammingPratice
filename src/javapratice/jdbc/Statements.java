package javapratice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Statements {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost3306/practise_jdbc";
        String user ="root";
        String password = "Bikka@24";
        try {
            Connection conn = DriverManager.getConnection(url,user,password);
            Statement stm = conn.createStatement();
            int result = stm.executeUpdate("delete from students where personid=4");
            System.out.println(result+"record affected");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
