package Database_Utility;

import User_Data.Registration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Rumours Group
 */
public class QueyCollection implements QueryInt {

     public QueyCollection() {

     }

     //Different Query Are Being Stored and As Per Requirement they are called and 
     //The Different Arguments Diffines Thier Query
     static Connection conn = null;
     static PreparedStatement pst = null;

     @Override
     public boolean registration() throws SQLException {
          conn = DB_Util.getConnection();
          if (conn != null) {
               pst = conn.prepareStatement("insert into User_Data values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
               return true;
          }

          return false;
     }

     @Override
     public boolean bookregistration() throws SQLException {
          conn = DB_Util.getConnection();
          return false;
     }

     @Override
     public boolean updation() throws SQLException {
          conn = DB_Util.getConnection();
          if (conn != null) {

          }
          return false;
     }

     @Override
     public Collection<String> report() throws SQLException {
          conn = DB_Util.getConnection();
          if (conn != null) {

          }
          ArrayList<String> ab = null;
          return ab;
     }

     @Override
     public boolean Authentication(Registration Re) throws SQLException {
          conn = DB_Util.getConnection();
          if (conn != null) {

          }
          return false;
     }

     @Override
     public boolean deletion(String id, String tablename) throws SQLException {
          conn = DB_Util.getConnection();
          if (conn != null) {

          }
          return false;
     }

     @Override
     public boolean bulkupload() throws SQLException {
          conn = DB_Util.getConnection();
          if (conn != null) {

          }
          return false;
     }

     @Override
     public boolean bulkupdate() throws SQLException {
          conn = DB_Util.getConnection();
          if (conn != null) {

          }
          return false;

     }

     @Override
     public boolean bulkdelete() throws SQLException {
          conn = DB_Util.getConnection();
          if (conn != null) {

          }
          return false;

     }

     @Override
     public Collection<String> Search(String Content, String Type) throws SQLException {
          return null;

     }
}
