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
public interface UserFunc {

     //Login Check Is Managed Here
     public boolean Authentication(String UserName, String Password) throws UserNotFound;

     //Registration Managedment 
     public boolean registration(Registration Re) throws ServerError, WrongInput;

     //Search Management Same As Book Convert Data In Form Of Map So it Get Easy To Access Data In Presentation Layer.
     public Map<Long, Registration> search(String userName, String[] Advance) throws UserNotFound;

     public Map<Long, Registration> getall(String userName, String[] Advance) throws SQLException;

     //We Will Provide User Option To Make A List of Deletion Option as Our JNU attence Provide while Inputing The Attendence Of Student If A Single Book is Thier Then Simply We Delete Or Else Lower One Will Be Used As List. 
     public boolean delete(String UserName) throws UpdationFailed;

     public boolean deleteList(String[] userNames) throws UpdationFailed;

     //We Will Check First The File Path and File Type If Path Not Found or File is Not in CSV Format Exception Will Be Forwarded.
     public boolean bulkUpload(String Path) throws ServerError, FileNotFound;  //Convert Given File To Map And Pass To Query

     public boolean bulkDelete(String Path) throws DeletionFailed, FileNotFound;

     //We Used ArrayList Because We Know Only Few Data Going To Be Updated Not Whole.
     public boolean update(ArrayList<String> al) throws UpdationFailed;

     // We Are Taking Type Of Report Which Decide The Table Which Needed To Be Accessed 
     public Map<Long, Registration> report(String Type, String[] SerachData) throws ServerError, WrongInput;
}
