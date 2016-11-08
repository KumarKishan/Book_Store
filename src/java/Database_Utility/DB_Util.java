package Database_Utility;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/*
 @Created By /*Rumours Group*/
public class DB_Util {

     private static final String DB_URL = "dbc:oracle:thin:@localhost:1521:orcl";
     private static final String dname = "oracle.jdbc.driver.OracleDriver";
     private static final String duser = "system";
     private static final String dpass = "kishan1213";

     static {
          try {
               Class.forName(dname);
          } catch (ClassNotFoundException cnfe) {
               System.out.println(cnfe);
          }
     }

     public static Connection getConnection() throws SQLException {
          return DriverManager.getConnection(DB_URL, duser, dpass);
     }

     public static void close(Connection conn, PreparedStatement pst) {
          try {

               if (pst != null) {
                    pst.close();
               }
               if (conn != null) {
                    conn.close();
               }
          } catch (SQLException se) {
               System.out.println(se);
          }
     }
}
