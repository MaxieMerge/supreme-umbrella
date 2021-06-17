package com.kainos.ea;

import java.sql.*;
import com.kainos.ea.Database;
import java.io.IOException;

public class Main {

    private static Connection conn;
    private static Connection getConnection() {
        String user;
        String password;
        String host;

        if (conn != null) {
            return conn;
        }

        try {
            user = "HR"; password = "HRisthebest"; host = "academy2020.cpc8rvmbbd9k.eu-west-2.rds.amazonaws.com";

            conn = DriverManager.getConnection("jdbc:mysql://"
                    + host + "/project2_Max?useSSL=false", user, password);
            return conn;

        } catch (Exception e) {
            e.printStackTrace(); }
        return null;
    }

    public static void main(String[] args) {
        Database db = new Database();
        try{
            UI terminal = new UI();
            terminal.authUser();
            String choice = terminal.createMenuScreen();
            if(choice.equals("1")){
                Employee newEmp = new Employee();
                newEmp = terminal.addEmployeeScreen(db);
                String SQL = String.format("INSERT INTO Employee (Fname, Lname, City, Postcode, StreetAddress, SortCode, BAN, Salary, NIN, Department) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', %d, '%s', '%s')", newEmp.getfName(), newEmp.getlName(), newEmp.getCity(), newEmp.getPostcode(), newEmp.getStreetAddr(), newEmp.getSortCode(), newEmp.getBan(), newEmp.getSalary(), newEmp.getNIN(), newEmp.getDepartment());
                db.insertSQL(SQL);
            }
            else if(choice.equals("2")){
                SalesEmployee newEmp = new SalesEmployee();
                newEmp = terminal.addSalesEmployeeScreen(db);
                String SQL = String.format("INSERT INTO Employee (Fname, Lname, City, Postcode, StreetAddress, SortCode, BAN, Salary, NIN, Department) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', %d, '%s', '%s')", newEmp.getfName(), newEmp.getlName(), newEmp.getCity(), newEmp.getPostcode(), newEmp.getStreetAddr(), newEmp.getSortCode(), newEmp.getBan(), newEmp.getSalary(), newEmp.getNIN(), newEmp.getDepartment());
                db.insertSQL(SQL);
                SQL = String.format("INSERT INTO SalesEmployee (EmployeeID, CommissionRate, TotalSales) values (LAST_INSERT_ID(), %d, %d)", newEmp.getCommissionRate(), newEmp.getTotalSales());
                db.insertSQL(SQL);
            }
            else if(choice.equals("3")){
                terminal.generateReport();

            }


        }catch(IOException IOe){
            System.out.println("Cannot get the line");
        }catch(InterruptedException Ie){

        }
    }
}
