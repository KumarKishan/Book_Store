/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction_Data;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Freeware Sys
 */
public class Account implements Serializable {

     private static final long serialVersionUID = 1L;

     private static String srid;
     private static String userId;
     private static Date paymentDate;
     private static String typeofPayment;
     private static String narration;
     private static String transactionType;
     private static String Transaction_id;
     private static String memoId;

     public static String getMemoId() {
          return memoId;
     }

     public static void setMemoId(String memoId) {
          Account.memoId = memoId;
     }

     public static void setSrid(String srid) {
          Account.srid = srid;
     }

     public static void setUserId(String userId) {
          Account.userId = userId;
     }

     public static void setPaymentDate(Date paymentDate) {
          Account.paymentDate = paymentDate;
     }

     public static void setTypeofPayment(String typeofPayment) {
          Account.typeofPayment = typeofPayment;
     }

     public static void setNarration(String narration) {
          Account.narration = narration;
     }

     public static void setTransactionType(String transactionType) {
          Account.transactionType = transactionType;
     }

     public static void setTransaction_id(String Transaction_id) {
          Account.Transaction_id = Transaction_id;
     }

     public static long getSerialVersionUID() {
          return serialVersionUID;
     }

     public static String getSrid() {
          return srid;
     }

     public static String getUserId() {
          return userId;
     }

     public static Date getPaymentDate() {
          return paymentDate;
     }

     public static String getTypeofPayment() {
          return typeofPayment;
     }

     public static String getNarration() {
          return narration;
     }

     public static String getTransactionType() {
          return transactionType;
     }

     public static String getTransaction_id() {
          return Transaction_id;
     }

}
