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
public class Transaction implements Serializable {

     private static final long serialVersionUID = 1L;

     private static String transactionId;
     private static String transactionType;
     private static Date transactionDate;
     private static String memberId;
     private static String Particular;
     private static String refId;
     private static float totalAmount;
     private static String userId;
     private static String memoId;

     public static void setTransactionId(String transactionId) {
          Transaction.transactionId = transactionId;
     }

     public static void setTransactionType(String transactionType) {
          Transaction.transactionType = transactionType;
     }

     public static void setTransactionDate(Date transactionDate) {
          Transaction.transactionDate = transactionDate;
     }

     public static void setMemberId(String memberId) {
          Transaction.memberId = memberId;
     }

     public static void setParticular(String Particular) {
          Transaction.Particular = Particular;
     }

     public static void setRefId(String refId) {
          Transaction.refId = refId;
     }

     public static void setTotalAmount(float totalAmount) {
          Transaction.totalAmount = totalAmount;
     }

     public static void setUserId(String userId) {
          Transaction.userId = userId;
     }

     public static void setMemoId(String memoId) {
          Transaction.memoId = memoId;
     }

     public static long getSerialVersionUID() {
          return serialVersionUID;
     }

     public static String getTransactionId() {
          return transactionId;
     }

     public static String getTransactionType() {
          return transactionType;
     }

     public static Date getTransactionDate() {
          return transactionDate;
     }

     public static String getMemberId() {
          return memberId;
     }

     public static String getParticular() {
          return Particular;
     }

     public static String getRefId() {
          return refId;
     }

     public static float getTotalAmount() {
          return totalAmount;
     }

     public static String getUserId() {
          return userId;
     }

     public static String getMemoId() {
          return memoId;
     }

}
