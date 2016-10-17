/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database_Utility;

import java.sql.SQLException;
import java.util.Collection;
import User_Data.Registration;

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
     public boolean registration() throws SQLException;

     public boolean bookregistration() throws SQLException;

     public boolean updation() throws SQLException;

     public Collection<String> report() throws SQLException;

     public boolean Authentication(Registration re) throws SQLException;

     public boolean deletion(String id, String tablename) throws SQLException;

     public boolean bulkupload() throws SQLException;

     public boolean bulkupdate() throws SQLException;

     public boolean bulkdelete() throws SQLException;

     public Collection<String> Search(String Content, String Type) throws SQLException;
}
