package Transaction_Data;

import Exceptions.TransactionFail;

/**
 *
 * @author Freeware Sys
 */
public class BusinessFactory {

     private static final BusinessInf Business = new BusinessImp();

     public static BusinessInf Transaction(String Type, String[] Data) throws TransactionFail {
          return Business;
     }

}
