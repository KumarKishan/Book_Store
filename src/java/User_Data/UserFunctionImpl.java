/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Data;

import Exceptions.DeletionFailed;
import Exceptions.FileNotFound;
import Exceptions.ServerError;
import Exceptions.UpdationFailed;
import Exceptions.UserNotFound;
import Exceptions.WrongInput;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Freeware Sys
 */
public class UserFunctionImpl implements UserFunc {

     @Override
     public boolean Authentication(String UserName, String Password) throws UserNotFound {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public boolean registration(Registration Re) throws ServerError, WrongInput {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public Map<Long, Registration> search(String userName, String[] Advance) throws UserNotFound {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public Map<Long, Registration> getall(String userName, String[] Advance) throws SQLException {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public boolean delete(String UserName) throws UpdationFailed {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public boolean deleteList(String[] userNames) throws UpdationFailed {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public boolean bulkUpload(String Path) throws ServerError, FileNotFound {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public boolean bulkDelete(String Path) throws DeletionFailed, FileNotFound {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public boolean update(ArrayList<String> al) throws UpdationFailed {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public Map<Long, Registration> report(String Type, String[] SerachData) throws ServerError, WrongInput {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     public static void main(String[] args) throws SQLException {

     }

}
