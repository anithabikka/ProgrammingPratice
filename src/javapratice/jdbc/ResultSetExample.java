package javapratice.jdbc;

import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.*;

public class ResultSetExample {
  //  private static Object user;

    public static void main(String[] args)  {
        String url= "jdbc:mysql://localhost:3306/practise_jdbc";
        String user ="root";
        String password ="Bikka@24";
      //  Properties prop= new Properties();
//        prop.put("root",user);
//        prop.put("Bikka@24",password);
//        prop.put("autoconnet","true");
       // Connection con= null;
        try {
          Connection  con = DriverManager.getConnection(url,user,password);
           PreparedStatement prstm = con.prepareStatement("Update students set marks=? where personid=?");
           prstm.setInt(1,45);
           prstm.setInt(2,3);

           prstm.setInt(1,94);
           prstm.setInt(2,6);
            int result = prstm.executeUpdate();
            //while(result.next()){
                System.out.println(result    +  "number of rows effected");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    }

