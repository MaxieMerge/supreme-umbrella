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
            if(choice.equals("1"))
               terminal.addEmployeeScreen(db);
//            else if(choice.equals("2"))
////                terminal.addSalesEmployeeScreen();
//            else if(choice.equals("3"))
//                terminal.generateReport();


        }catch(IOException IOe){
            System.out.println("Cannot get the line");
        }catch(InterruptedException Ie){

        }
    }
}
