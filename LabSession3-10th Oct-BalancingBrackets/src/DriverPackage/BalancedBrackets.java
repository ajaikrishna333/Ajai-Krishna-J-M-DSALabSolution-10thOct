package DriverPackage;

import java.util.Scanner;

import ServicePackage.ServiceClass;

public class BalancedBrackets {
    public static void main(String[] args) {

        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        input = sc.nextLine();
        ServiceClass s = new ServiceClass(input);
        if (s.process()) {
            System.out.println("The entered String has balanced brackets");
        } else {
            System.out.println("The entered String DO NOT contain balanced brackets");
        }
        sc.close();

    }
}
