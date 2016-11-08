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
public interface BusinessInf {

     //By Defining The Type We Manage Our Transaction In Switch Cases Which Make Our Code More Manageable Because
     //In Implementation Class We Will Make Different Methods And Only We Use Switch Case To Access.
     public Map<Long, String[]> Transaction(String Type, String[] Data) throws TransactionFail;
}
