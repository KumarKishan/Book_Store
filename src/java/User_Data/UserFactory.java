package User_Data;

import Exceptions.DeletionFailed;
import Exceptions.ServerError;
import Exceptions.UpdationFailed;
import Exceptions.UserNotFound;
import Exceptions.WrongInput;
import java.sql.SQLException;

/**
 *
 * @author Freeware Sys
 */
public class UserFactory {

     private static final UserFunc User = new UserFunctionImpl();

     public static UserFunc Authentication() throws UserNotFound {
          return User;
     }

     public static UserFunc registration() throws ServerError, WrongInput {
          return User;
     }

     public static UserFunc search() throws UserNotFound {
          return User;
     }

     public static UserFunc getall() throws SQLException {
          return User;
     }

     public static UserFunc delete() throws UpdationFailed {
          return User;
     }

     public static UserFunc bulkUpload() throws ServerError {
          return User;
     }

     public static UserFunc bulkDelete() throws DeletionFailed {
          return User;
     }

     public static UserFunc updation() throws UpdationFailed {
          return User;
     }
}
