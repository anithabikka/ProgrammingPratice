package javapratice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class CallableStatement{
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/practise_jdbc";
        String user = "root";
        String password = "Bikka@24";

        try {
            Connection con = DriverManager.getConnection(url,user,password);
            CallableStatement cstm = (CallableStatement) con.prepareCall("execute selectallstudents");
            System.out.println(cstm);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
