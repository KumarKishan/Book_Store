package Database_Utility;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Freeware Sys
 */
public interface QueryInt {

     /**
      *
      * @param re
      * @return
      * @throws SQLException
      */
     public boolean userRegistration(User_Data.Registration Re) throws SQLException;

     public boolean bookRegistration(Book_Data.Registration Bre) throws SQLException;

     public boolean userUpdation(ArrayList<String> al) throws SQLException;

     public boolean bookUpdation(ArrayList<String> al) throws SQLException;

     public HashMap<Long, String[]> userReport(String Users, ArrayList<String> SerachData) throws SQLException;

     public HashMap<Long, ArrayList> bookReport(String Type, String[] SearchData) throws SQLException;

     public boolean Authentication(String UserName, String Password) throws SQLException;

     public boolean userDeletion(String UserName) throws SQLException;

     public boolean bookDeletion(String BookISBN) throws SQLException;

     public boolean userBulkUpload(Map<Long, User_Data.Registration> data) throws SQLException;

     public boolean bookBulkUpload(Map<Long, Book_Data.Registration> data) throws SQLException;

     public Map<Long, String[]> userSearch(String UserName, String[] Advance) throws SQLException;

     public Map<Long, ArrayList<String>> bookSearch(String Title, String[] Advance) throws SQLException;

}
