package main;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter initial string :");
        String str = s.nextLine();
        System.out.println("enter string to be replaced :");
        String substr = s.nextLine();
        System.out.println("enter replacement string :");
        String rep = s.nextLine();
        System.out.println(str.replaceAll(substr, rep));
    }
}
