package com.kainos.ea;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        try{
            UI terminal = new UI();
            terminal.authUser();
            String choice = terminal.createMenuScreen();
            if(choice.equals("1"))
                terminal.addEmployeeScreen();
            else if(choice.equals("2"))
                terminal.addSalesEmployeeScreen();
            else if(choice.equals("3"))
                terminal.generateReport();

        }catch(IOException IOe){
            System.out.println("Cannot get the line");
        }catch(InterruptedException Ie){

        }
    }
}