package com.kainos.ea;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        try{
            UI terminal = new UI();
            terminal.createLoginScreen();
        }catch(IOException IOe){
            System.out.println("Cannot get the line");
        }catch(InterruptedException Ie){

        }
    }
}