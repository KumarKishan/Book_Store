/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book_Data;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Rumours Group
 */
public class Registration implements Serializable {

     private static String ISBN;
     private static String Title;
     private static String Abstract;
     private static int Edition;
     private static Date Publishing;
     private static String Category;
     private static String Pic_Location;
     private static int Quantity;
     private static String Language;
     private static String Publisher;
     private static int Fine;
     private static int Rental;
     private static int Cost;
     private static Date Purchase;
     private static String Seller_Name;
     private static String Seller_Address;
     private static long Seller_Contact;
     private static int Frequency_ID;
     private static String BOOK_ID;
     private static String CALL_NUMBER;

     public static void setSeller_Contact(long Seller_Contact) {
          Registration.Seller_Contact = Seller_Contact;
     }

     public static void setBOOK_ID(String BOOK_ID) {
          Registration.BOOK_ID = BOOK_ID;
     }

     public static void setCALL_NUMBER(String CALL_NUMBER) {
          Registration.CALL_NUMBER = CALL_NUMBER;
     }

     public static long getSeller_Contact() {
          return Seller_Contact;
     }

     public static String getBOOK_ID() {
          return BOOK_ID;
     }

     public static String getCALL_NUMBER() {
          return CALL_NUMBER;
     }

     public static void setISBN(String ISBN) {
          Registration.ISBN = ISBN;
     }

     public static void setTitle(String Title) {
          Registration.Title = Title;
     }

     public static void setAbstract(String Abstract) {
          Registration.Abstract = Abstract;
     }

     public static void setEdition(int Edition) {
          Registration.Edition = Edition;
     }

     public static void setPublishing(Date Publishing) {
          Registration.Publishing = Publishing;
     }

     public static void setCategory(String Category) {
          Registration.Category = Category;
     }

     public static void setPic_Location(String Pic_Location) {
          Registration.Pic_Location = Pic_Location;
     }

     public static void setQuantity(int Quantity) {
          Registration.Quantity = Quantity;
     }

     public static void setLanguage(String Language) {
          Registration.Language = Language;
     }

     public static void setPublisher(String Publisher) {
          Registration.Publisher = Publisher;
     }

     public static void setFine(int Fine) {
          Registration.Fine = Fine;
     }

     public static void setRental(int Rental) {
          Registration.Rental = Rental;
     }

     public static void setCost(int Cost) {
          Registration.Cost = Cost;
     }

     public static void setPurchase(Date Purchase) {
          Registration.Purchase = Purchase;
     }

     public static void setSeller_Name(String Seller_Name) {
          Registration.Seller_Name = Seller_Name;
     }

     public static void setSeller_Address(String Seller_Address) {
          Registration.Seller_Address = Seller_Address;
     }

     public static void setContact(long Contact) {
          Registration.Seller_Contact = Contact;
     }

     public static void setFrequency_ID(int Frequency_ID) {
          Registration.Frequency_ID = Frequency_ID;
     }

     public static String getISBN() {
          return ISBN;
     }

     public static String getTitle() {
          return Title;
     }

     public static String getAbstract() {
          return Abstract;
     }

     public static int getEdition() {
          return Edition;
     }

     public static Date getPublishing() {
          return Publishing;
     }

     public static String getCategory() {
          return Category;
     }

     public static String getPic_Location() {
          return Pic_Location;
     }

     public static int getQuantity() {
          return Quantity;
     }

     public static String getLanguage() {
          return Language;
     }

     public static String getPublisher() {
          return Publisher;
     }

     public static int getFine() {
          return Fine;
     }

     public static int getRental() {
          return Rental;
     }

     public static int getCost() {
          return Cost;
     }

     public static Date getPurchase() {
          return Purchase;
     }

     public static String getSeller_Name() {
          return Seller_Name;
     }

     public static String getSeller_Address() {
          return Seller_Address;
     }

     public static long getContact() {
          return Seller_Contact;
     }

     public static int getFrequency_ID() {
          return Frequency_ID;
     }

}
