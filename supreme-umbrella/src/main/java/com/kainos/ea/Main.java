package com.kainos.ea;

import java.sql.*;
import com.kainos.ea.Database;

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
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
