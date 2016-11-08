CREATE TABLE User_Data
(
  User_Id Varchar2(21) NOT NULL,
  Password Varchar2(16) NOT NULL,
  Name varchar2(15) NOT NULL,
  Address Varchar2(101) ,
  Contact_No Number(11) ,
  Email varchar2(21) NOT NULL,
  Sec_Id_Type Varchar2(21) NOT NULL,
  Sec_Id_Number Varchar2(21) NOT NULL,
  Role INT NOT NULL,
  Sex Varchar2(2) ,
  Age Date,
  Deposition_Amt Number(12,2) NOT NULL,
  Last_Transaction_Time Date,
  PRIMARY KEY (User_Id)
);

CREATE TABLE Frequency
(
  Frequency_id Number(2) NOT NULL,
  Frequency_Category Varchar2(21) NOT NULL,
  Time_Period Number(3) NOT NULL,
  PRIMARY KEY (Frequency_id)
);

CREATE TABLE Cash_Memo_Transaction
(
  Memo_id Varchar2(21) NOT NULL,
  Amount Number(12,2) ,
  Collected_By Varchar2(21) NOT NULL,
  Transaction_Type Number(2) NOT NULL,
  Trans_Date Date NOT NULL,
  Debit_Credit Varchar2(3) NOT NULL,
  User_Id Varchar2(21) NOT NULL,
  PRIMARY KEY (Memo_id)
);

CREATE TABLE Trans_Detail
(
  Tra_Detail_Id Varchar2(3) NOT NULL,
  Detail Varchar2(51),
  TransDetailType Varchar2(10),
  PRIMARY KEY (Tra_Detail_Id)
);

CREATE TABLE Title
(
  ISBN Varchar2(21) NOT NULL,
  Title Varchar2(21) NOT NULL,
  Abstract Varchar2(51),
  Edition Number(3),
  Date_Publish Date,
  Category_Genre Varchar2(12),
  Title_Cover_Pic Varchar2(21),
  Quantity Number(3),
  Language Varchar2(10),
  Publisher_Name Varchar2(21),
  Fine_Day Number(12,2),
  Rental_Price Number(12,2),
  Cost Number(12,2),
  Purchase_date Date,
  Seller_Name Varchar2(21),
  Seller_Address Varchar2(21),
  Seller_contact Number(11),
  Frequency_id Number(2),
  PRIMARY KEY (ISBN)
);

CREATE TABLE Author
(
  Author_Name Varchar2(10),
  ISBN Varchar2(21),
  UNIQUE (Author_Name),
  UNIQUE (ISBN)
);

CREATE TABLE Marc_View
(
  ISBN Varchar2(21)
  
);

CREATE TABLE Cart
(
  Session_id Varchar2(21),
  Quantity Number(3),
  User_Id Varchar2(21),
  ISBN Varchar2(21),
  PRIMARY KEY (Session_id)
);

CREATE TABLE Transaction
(
  Transaction_Id Varchar2(21) NOT NULL,
  Trans_Type varchar2(21) NOT NULL,
  Trans_Date Date,
  Member_Id Varchar2(21),
  Ref_Id Varchar2(21),
  Total_Amount Number(12,2),
  User_Id Varchar2(21),
  Memo_id Varchar2(21),
  Tra_Detail_Id Varchar2(21),
  PRIMARY KEY (Transaction_Id)
);

CREATE TABLE Account
(
  Sr_No Varchar2(5) Not Null,
  Member_id Varchar2(21),
  Pay_Date Date,
  CR_Debit Varchar2(3),
  Amount Number(12,2),
  Narration Varchar2(40),
  Transaction_Type Varchar2(10),
  Transaction_Id Varchar2(21),
  Memo_id Varchar2(21),
  PRIMARY KEY (Sr_No)
);

CREATE TABLE Book
(
  Book_id Varchar2(11),
  Call_Number Number(12,2),
  ISBN Varchar2(21),
  PRIMARY KEY (Book_id)
);

CREATE TABLE Disposal
(
  Disposal_Id Number(10),
  Date_of_Registration Date,
  ISBN Varchar2(21),
  Book_id Varchar2(11),
  User_id Varchar2(21),
  PRIMARY KEY (Disposal_Id)
);
