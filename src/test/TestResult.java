package test;

import domain.*;
import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        System.out.print("\nBusLuckyTicketCalculator-3000 is ready!\n" + 
        "It calculates number of lucky tickets up till given ticket number! \nEnter your ticket number(0-999999):");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(Exercise.Calculate(inputString));
    }
}
