/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction_Data;

import Exceptions.UserNotFound;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Freeware Sys
 */
public class CashMemo implements Serializable {

     private static final long serialVersionUID = 1L;

     private static String memoId;
     private static String collectedBy;
     private static float amount;
     private static String paymentBasis;
     private static String transactionType;
     private static Date transactionDate;
     private static String userId;

     public static void setMemoId(String memoId) {
          CashMemo.memoId = memoId;
     }

     public static void setCollectedBy(String collectedBy) {
          CashMemo.collectedBy = collectedBy;
     }

     public static void setAmount(float amount) {
          CashMemo.amount = amount;
     }

     public static void setPaymentBasis(String paymentBasis) {
          CashMemo.paymentBasis = paymentBasis;
     }

     public static void setTransactionType(String transactionType) {
          CashMemo.transactionType = transactionType;
     }

     public static void setTransactionDate(Date transactionDate) {
          CashMemo.transactionDate = transactionDate;
     }

     public static void setUserId(String userId) {
          CashMemo.userId = userId;
     }

     public static long getSerialVersionUID() {
          return serialVersionUID;
     }

     public static String getMemoId() {
          return memoId;
     }

     public static String getCollectedBy() {
          return collectedBy;
     }

     public static float getAmount() {
          return amount;
     }

     public static String getPaymentBasis() {
          return paymentBasis;
     }

     public static String getTransactionType() {
          return transactionType;
     }

     public static Date getTransactionDate() {
          return transactionDate;
     }

     public static String getUserId() {
          return userId;
     }

}
