package com.kainos.ea;

import java.sql.*;

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
            // Bad practice alert!
            user = "empsuser"; password = "empPwd!"; host = "localhost";

            conn = DriverManager.getConnection("jdbc:mysql://"
                    + host + "/employees?useSSL=false", user, password);
            return conn;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

        try {
            Connection c = getConnection();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(
                    "SELECT emp_no AS `number`, "
                            + "CONCAT_WS (' ', first_name, last_name) AS `name`, "
                            + "salary * 100 AS `salary` "
                            + "FROM employees JOIN salaries USING(emp_no) "
                            + "WHERE to_date > NOW() AND salary = 100000");

            while (rs.next()) {
                Employee dbEmp = new Employee(rs.getInt("number"),
                        rs.getString("name"), rs.getInt("salary"));
                System.out.println(dbEmp);
            }
        }
        catch (SQLException e) {
            e.printStackTrace(); // Bad practice alert!
        }
    }
}
