package com.kainos.ea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UI {

    public UI() {
    }

    public final BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    ;

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public String getInput() throws IOException {
        String input = reader.readLine();
        return input;
    }

    public void createLoginScreen() throws IOException, InterruptedException {
        System.out.println("Welcome to LabourDays\n");
        Thread.sleep(500);
        clearScreen();
        System.out.println("Please provide your credentials\n");
        System.out.println("Username: ");
        String user = this.getInput();
        System.out.println("\nPassword: ");
        String pass = this.getInput();
        clearScreen();
    }

}
