package Book_Data;

import Exceptions.BookNotFound;
import Exceptions.DeletionFailed;
import Exceptions.FileNotFound;
import Exceptions.ServerError;
import Exceptions.UpdationFailed;
import Exceptions.WrongInput;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Freeware Sys
 */
public class BookParticipationImpl implements BookParticipationIntf {

     @Override
     public boolean Register(Registration re) throws ServerError, WrongInput {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public Map<Long, Registration> search(String Title, String[] Advance) throws BookNotFound {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public Map<Long, Registration> getall(String Title, String[] Advance) throws SQLException {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public boolean delete(String bookISBN) throws UpdationFailed {
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
     public ArrayList<String> report(String Type, String[] SearchData) throws ServerError {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

}
