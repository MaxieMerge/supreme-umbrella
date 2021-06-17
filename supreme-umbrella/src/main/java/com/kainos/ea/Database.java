package com.kainos.ea;

import java.sql.*;

public class Database {
    private static Connection conn;
    private static Connection getConnection() {
        String user;
        String password;
        String host;

        if (conn != null) {
            return conn;
        }

        try {
            user = "Max"; password = "ThanksPatrick247"; host = "academy2020.cpc8rvmbbd9k.eu-west-2.rds.amazonaws.com";

            conn = DriverManager.getConnection("jdbc:mysql://"
                    + host + "/project2_Max?useSSL=false", user, password);
            return conn;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet selectSQL(String SQL){
        ResultSet rs = null;
        try {
            Connection c = getConnection();
            Statement st = c.createStatement();
            rs = st.executeQuery(SQL);
            c.close();
        }
        catch (SQLException e) {
            e.printStackTrace(); // Bad practice alert!
        }
        
        return rs;
    }

    public void insertSQL(String SQL){
        try {
            Connection c = getConnection();
            Statement st = c.createStatement();
            st.executeUpdate(SQL);
            c.close();
            System.out.println("Entry Inserted Successfully");
        }
        catch (SQLException e) {
            e.printStackTrace(); // Bad practice alert!
        }
    }
}
