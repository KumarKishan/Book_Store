package User_Data;

import Exceptions.DeletionFailed;
import Exceptions.ServerError;
import Exceptions.UpdationFailed;
import Exceptions.UserNotFound;
import Exceptions.WrongInput;
import java.sql.SQLException;
import java.util.Map;

/**
 *
 * @author Freeware Sys
 */
public interface UserFunc {

     public boolean Authentication(Registration re) throws UserNotFound;

     public boolean registration() throws ServerError, WrongInput;

     public Map<Long, Registration> search(String Type, String Table) throws UserNotFound;

     public Map<Long, Registration> getall(String Type, String Table) throws SQLException;

     public boolean delete(String Type, String Table) throws UpdationFailed;

     public boolean bulkUpload(String Path) throws ServerError;

     public boolean bulkDelete(String Path) throws DeletionFailed;

     public boolean update(String Type, String Table) throws UpdationFailed;
}
