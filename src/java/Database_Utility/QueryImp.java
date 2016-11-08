package Database_Utility;

import User_Data.Registration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import static oracle.net.aso.C00.h;

/**
 *
 * @author Freeware Sys
 */
public class QueryImp implements QueryInt {

     Connection conn = null;
     PreparedStatement pst = null;
     PreparedStatement pst1 = null;

     @Override
     public boolean userRegistration(User_Data.Registration Re) throws SQLException {
          conn = DB_Util.getConnection();
          if (conn != null) {
               pst = conn.prepareStatement("Insert into User_Data values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
               pst.setString(1, Re.getUser_Id());
               pst.setString(2, Re.getPassword());
               pst.setString(3, Re.getName());
               pst.setString(4, Re.getAddress());
               pst.setLong(5, Re.getContact());
               pst.setString(6, Re.getEmail());
               pst.setString(7, Re.getSec_id());
               pst.setString(8, Re.getSec_Id_Num());
               pst.setShort(9, Re.getRole());
               String sex = "" + Re.getSex();
               pst.setString(10, sex);

               pst.setDate(11, null);
               pst.setFloat(12, Re.getAmount());

               pst.setDate(13, null);
               pst.executeQuery();
               return true;
          }
          return false;
     }

     @Override
     public boolean bookRegistration(Book_Data.Registration Bre) throws SQLException {
          conn = DB_Util.getConnection();
          if (conn != null) {
               pst = conn.prepareStatement("Insert into Title values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
               pst1 = conn.prepareStatement("Insert into Book values (?,?,?)");
               pst.setString(1, Bre.getISBN());
               pst.setString(2, Bre.getTitle());
               pst.setString(3, Bre.getAbstract());
               pst.setInt(4, Bre.getEdition());
               pst.setDate(5, (java.sql.Date) Bre.getPublishing());
               pst.setString(6, Bre.getCategory());
               pst.setString(7, Bre.getPic_Location());
               pst.setInt(8, Bre.getQuantity());
               pst.setString(9, Bre.getLanguage());
               pst.setString(10, Bre.getPublisher());
               pst.setInt(11, Bre.getFine());
               pst.setInt(12, Bre.getRental());
               pst.setInt(13, Bre.getCost());
               pst.setDate(14, (java.sql.Date) Bre.getPurchase());
               pst.setString(15, Bre.getSeller_Name());
               pst.setString(16, Bre.getSeller_Address());
               pst.setLong(17, Bre.getSeller_Contact());
               pst.setInt(18, Bre.getFrequency_ID());
               pst1.setString(1, Bre.getBOOK_ID());
               pst1.setString(2, Bre.getCALL_NUMBER());
               pst1.setString(3, Bre.getISBN());
               pst.executeQuery();
               pst.executeQuery();
               conn.commit();
               DB_Util.close(conn, pst);
               return true;
          }
          return false;
     }

     @Override
     public boolean userUpdation(ArrayList<String> al) throws SQLException {
          conn = DB_Util.getConnection();
          return false;
     }

     @Override
     public boolean bookUpdation(ArrayList<String> al) throws SQLException {

          return false;
     }

     @Override
     public HashMap<Long, String[]> userReport(String Users, ArrayList<String> SerachData) throws SQLException {

          long counter = 0;
          HashMap<Long, String[]> h = new HashMap<>();
          conn = DB_Util.getConnection();
          String[] data = {SerachData.get(0), SerachData.get(1)};

          String Statement = userReportData(data, "User_Data", "User_Id", Users);
          System.out.println(Statement);
          pst = conn.prepareStatement(Statement);
          ResultSet rs = pst.executeQuery();

          while (rs.next()) {
               String[] a = {rs.getString(1), rs.getString(2)};
               h.put(counter, a);
               counter += 1;
          }
          return h;
     }

     @Override
     public HashMap<Long, ArrayList> bookReport(String BookDetail, String[] SearchData) throws SQLException {

          conn = DB_Util.getConnection();
          long l = 0;
          switch (BookDetail) {
               case "All":
                    pst = conn.prepareStatement("Select * From Title,Book ");
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                         ArrayList a = new ArrayList();

                    }
                    return null;
               case "Specific":
                    return null;
               default:
                    return null;

          }
     }

     @Override
     public boolean Authentication(String UserName, String Password) throws SQLException {

          conn = DB_Util.getConnection();
          pst = conn.prepareStatement("Select Password From User_Data where USER_ID = (?)");
          pst.setString(1, UserName);

          ResultSet rs = pst.executeQuery();

          if (rs.next()) {
               return rs.getString(1).equals(Password);
          }

          return false;
     }

     @Override
     public boolean userDeletion(String UserName) throws SQLException {

          conn = DB_Util.getConnection();
          String Statement = QueryImp.deleteCommand(UserName, "User_Id", "User_Data");
          Statement stm = null;
          stm = conn.createStatement();
          boolean result = stm.execute(Statement);
          if (result == false) {
               conn.rollback();
               conn.commit();
               return false;
          }
          conn.commit();
          return true;
     }

     @Override
     public boolean bookDeletion(String BookISBN) throws SQLException {
          conn = DB_Util.getConnection();
          String Statement1 = QueryImp.deleteCommand(BookISBN, "ISBN", "Title");
          String Statement2 = QueryImp.deleteCommand(BookISBN, "ISBN", "Book");
          Statement stm = null;
          boolean execute = stm.execute(Statement1);
          boolean execute2 = stm.execute(Statement2);
          if (execute == false || execute2 == false) {
               conn.rollback();
               conn.commit();
               return false;
          }
          conn.commit();
          return true;
     }

     @Override
     public boolean userBulkUpload(Map<Long, Registration> data) throws SQLException {

          return false;
     }

     @Override
     public boolean bookBulkUpload(Map<Long, Book_Data.Registration> data) throws SQLException {

          return false;
     }

     @Override
     public Map<Long, String[]> userSearch(String Type, String[] Advance) throws SQLException {

          return null;
     }

     @Override
     public Map<Long, ArrayList<String>> bookSearch(String Type, String[] Advance) throws SQLException {

          return null;
     }

     public static String deleteCommand(String Data, String Key, String Table) {
          String sql = "Delete from " + Table + " Where ";
          String column = Key;
          String[] keyWords = Data.split(" ");
          for (String keyWord : keyWords) {
               if (!isExtraWord(keyWord)) {
                    sql += column + " = " + keyWord + " or ";
               }
          }
          sql = sql.substring(0, sql.length() - 4);
          return sql;
     }

     public static boolean isExtraWord(String word) {
          return (word.equalsIgnoreCase("and") || word.equalsIgnoreCase("&") || word.equalsIgnoreCase("or"));
     }

     public static String userReportData(String[] Advance, String Table, String Key, String Ids) {
          String fianalData = "";
          for (int i = 0; i < Advance.length; i++) {
               fianalData += Advance[i] + " ";
               if (i < Advance.length - 1) {
                    fianalData += ",";
               }
          }

          String sql = "Select " + fianalData + " From " + Table + " Where ";
          String column = Key;
          String[] keyWords = Ids.split(" ");
          for (String keyWord : keyWords) {
               if (!isExtraWord(keyWord)) {
                    sql += column + " = '" + keyWord + "' or ";
               }
          }
          sql = sql.substring(0, sql.length() - 4);
          return sql;
     }

     public static void main(String[] args) throws SQLException {

          QueryImp q = new QueryImp();

     }

     public String bookReportData(String[] Data) {
          return null;
     }
}
