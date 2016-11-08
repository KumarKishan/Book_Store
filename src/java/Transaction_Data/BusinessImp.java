/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction_Data;

import Exceptions.TransactionFail;
import java.util.Map;

/**
 *
 * @author Freeware Sys
 */
public class BusinessImp implements BusinessInf {

     @Override
     public Map<Long, String[]> Transaction(String Type, String[] Data) throws TransactionFail {
          switch (Type) {
               case "Cash_Memo":

                    break;//Later It Will Return Data
               case "Transaction":
                    break;
          }
          return null;
     }
}
