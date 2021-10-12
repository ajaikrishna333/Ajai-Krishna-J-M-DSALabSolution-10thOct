package DriverPackage;

import java.util.Scanner;
import ServicePackage.ServiceClass;
import java.util.ArrayList;

public class LongestPathInBinaryTree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ServiceClass s = new ServiceClass();
        ArrayList<Integer> output = s.create();
        int size = output.size();
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(output.get(i) + " ");
        }

        sc.close();

    }
}
