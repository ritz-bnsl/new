package main;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next().trim();
        int n = s.nextInt();
        System.out.println(name.substring(n));
    }
}