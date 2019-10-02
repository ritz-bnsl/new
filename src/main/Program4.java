package main;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next().trim();
        name = name.toUpperCase();
        System.out.println(name);
    }
}
