package com.kainos.ea;

import java.io.IOException;


public class EntryFile {

    public static void main(String[] args) {
        UI terminal = new UI();
        try{
            terminal.clearScreen();
            String input = terminal.getInput();
            terminal.clearScreen();
            System.out.println(input);
        }catch(IOException e){
            System.out.println("Cannot get the line");
        }
    }
}