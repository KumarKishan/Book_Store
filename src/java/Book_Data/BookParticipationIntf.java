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
public interface BookParticipationIntf {

     //For Registration We Only Pass The Serialized Class Object WHich Can Be Easily Access Freely
     public boolean Register(Registration re) throws ServerError, WrongInput;

     //We Retrieve Data From Database And Store in Form of Map Because If We Use Collection Or Arraylist Its 
     //Makes Clumsy So We Use Map Which Makes Our Data More Better To Represent 
     //We Are Passing The Book Searched Data And Any Anvance Search Which User Selected.
     public Map<Long, Book_Data.Registration> search(String Title, String[] Advance) throws BookNotFound;

     public Map<Long, Book_Data.Registration> getall(String Title, String[] Advance) throws SQLException;

     //We Will Provide User Option To Make A List of Deletion Option as Our JNU attence Provide while Inputing The Attendence Of Student If A Single Book is Thier Then Simply We Delete Or Else Lower One Will Be Used As List. 
     public boolean delete(String bookISBN) throws UpdationFailed;

     public boolean deleteList(String[] userNames) throws UpdationFailed;

     //We Will Check First The File Path and File Type If Path Not Found or File is Not in CSV Format Exception Will Be Forwarded.
     public boolean bulkUpload(String Path) throws ServerError, FileNotFound;   //Convert Given File To Map And Pass To Query

     public boolean bulkDelete(String Path) throws DeletionFailed, FileNotFound;

     public boolean update(ArrayList<String> al) throws UpdationFailed;

     // We Are Taking Type Of Report Which Decide The Table Which Needed To Be Accessed 
     public ArrayList<String> report(String Type, String[] SearchData) throws ServerError;
}
