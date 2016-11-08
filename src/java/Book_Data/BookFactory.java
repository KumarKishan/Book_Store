package Book_Data;

import Exceptions.BookNotFound;
import Exceptions.DeletionFailed;
import Exceptions.ServerError;
import Exceptions.UpdationFailed;
import Exceptions.WrongInput;
import java.sql.SQLException;

/**
 *
 * @author Freeware Sys
 */
public class BookFactory {

     private static final BookParticipationIntf Book = new BookParticipationImpl();

     public static BookParticipationIntf insert() throws ServerError, WrongInput {
          return Book;
     }

     public static final BookParticipationIntf search() throws BookNotFound {
          return Book;
     }

     public static final BookParticipationIntf getall() throws SQLException {
          return Book;
     }

     public static final BookParticipationIntf delete() throws UpdationFailed {
          return Book;
     }

     public static final BookParticipationIntf bulkUpload() throws ServerError {
          return Book;
     }

     public static final BookParticipationIntf bulkDelete(String Path) throws DeletionFailed {
          return Book;
     }

     public static final BookParticipationIntf Update() throws UpdationFailed {
          return Book;
     }
}
