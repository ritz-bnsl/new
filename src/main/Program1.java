package main;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next().trim();
        System.out.print("index: ");
        int l = name.length();
        for (int i = 0; i < l; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.print("chars: ");
        for (int j = 0; j < l; j++) {
            System.out.print(name.charAt(j) + "\t");
        }

    }

}

