/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Skyynemo
 * Created: May 29, 2023
 */

CREATE DATABASE if not exists Punura_Super;
USE Punura_Super;

CREATE TABLE if not exists Cashier_Details (
    CashierID int NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    CashierName varchar(255),
    CashierContact int,
    CashierEmail varchar(255),   
    Username varchar(255),
    Password int
   );

CREATE TABLE if not exists Customer_Details (
    CustomerID int AUTO_INCREMENT PRIMARY KEY ,
    CustomerName varchar(255),
    CustomerContact int,
    CustomerEmail varchar(255)   
    );

CREATE TABLE if not exists Product_Details (
    ProductID int NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    ProductName varchar(255),
    ProductPrice int
   );

CREATE TABLE if not exists Order_Details (
    OrderID int NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    NumberofProducts int,
    BillID int,
    ProductID int, 
    FOREIGN KEY (BillID)  REFERENCES Bills(BillID),
    FOREIGN KEY (ProductID) REFERENCES Product_Details(ProductID)
    );

CREATE TABLE if not exists Bills (
    BillID int NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    CustomerID int,
    CashierID int,
    Amount int,
    FOREIGN KEY (CustomerID)  REFERENCES Customer_Details(CustomerID),
    FOREIGN KEY (CashierID) REFERENCES Cashier_Details(CashierID)  
   );

CREATE TABLE if not exists Payment (
    PaymentID int NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    CustomerID int,
    BillID int,
    Amount int,
    FOREIGN KEY (CustomerID)  REFERENCES Customer_Details(CustomerID),
    FOREIGN KEY (BillID)  REFERENCES Bills(BillID),
    FOREIGN KEY (Amount)  REFERENCES Bills(Amount)
   );