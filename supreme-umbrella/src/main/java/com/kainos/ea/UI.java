package com.kainos.ea;

import com.kainos.ea.Employee;
import com.kainos.ea.SalesEmployee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UI {
    public final BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public String getInput() throws IOException {
        String input = reader.readLine();
        return input;
    }

    private boolean authenticate(String user, String pass){
        return true;
    }

    public boolean authUser() throws IOException, InterruptedException {
        clearScreen();
        System.out.println("Welcome to LabourDays\n");
        Thread.sleep(500);
        clearScreen();
        System.out.println("Please provide your credentials\n");
        System.out.println("Username: ");
        String user = this.getInput();
        System.out.println("\nPassword: ");
        String pass = this.getInput();
        clearScreen();
        if(authenticate(user, pass)){
            System.out.println("User authenticated");
            return true;
        }else{
            System.out.println("Wrong credentials");
            return false;
        }
    }

    public String createMenuScreen() throws IOException{
            clearScreen();
            System.out.println("Please choose of these options: \n");
            System.out.println("1. Add new EMPLOYEE");
            System.out.println("2. Add new SALES EMPLOYEE");
            System.out.println("3. Generate REPORT");
            String choice = this.getInput();
            return choice;
    }

    public Employee addEmployeeScreen() throws IOException{
        Employee emp = new Employee();

        clearScreen();
        System.out.print("First Name: ");
        emp.setfName(this.getInput());
        clearScreen();

        System.out.print("Last Name: ");
        emp.setlName(this.getInput());
        clearScreen();

        System.out.print("City: ");
        emp.setCity(this.getInput());
        clearScreen();

        System.out.print("Post Code: ");
        emp.setPostcode(this.getInput());
        clearScreen();

        System.out.print("Street Address: ");
        emp.setStreetAddr(this.getInput());
        clearScreen();

        System.out.print("SortCode: ");
        emp.setSortCode(this.getInput());
        clearScreen();

        System.out.print("BAN: ");
        emp.setBan(this.getInput());
        clearScreen();

        System.out.print("Salary: ");
        emp.setSalary(Integer.parseInt(this.getInput()));
        clearScreen();

        System.out.print("NIN: ");
        emp.setNIN(this.getInput());
        clearScreen();

        System.out.print("Departament: ");
        emp.setDepartment(this.getInput());
        clearScreen();

        return emp;

    }

    public Employee addSalesEmployeeScreen() throws IOException{
        SalesEmployee emp = (SalesEmployee) addEmployeeScreen();

        System.out.print("Commision Rate: ");
        emp.setCommissionRate(Double.parseDouble(this.getInput()));
        clearScreen();

        System.out.print("Total Sales: ");
        emp.setTotalSales(Integer.parseInt(this.getInput()));
        clearScreen();

        return emp;

    }

    public void generateReport(){


    }

    public void runTerminal(){

    }



}
