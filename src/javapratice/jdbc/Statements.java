package javapratice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Statements {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/practise_jdbc";
        String user ="root";
        String password = "Bikka@24";
        String result = "delete from students where personid=8";
        try {
            Connection con = DriverManager.getConnection(url,user,password);
            Statement stm = con.createStatement();

            int rowsEffected = stm.executeUpdate(result);
            System.out.println("the num of rows effected" +rowsEffected);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
