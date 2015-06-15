package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputOutput {
    private BufferedReader br;

    public ConsoleInputOutput() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String takeUserInputForMainMenu() {
        try {
            String input = br.readLine();
            return input;

        } catch (IOException e) {
            return null;
        }
    }

}
