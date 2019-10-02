package main;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next().trim();
        int l = name.length();
        int sum = 0;
        char ch;
        for (int i = 0; i < l; i++) {
            ch = name.charAt(i);
            sum += (int) ch;
        }
        System.out.println(sum);
    }

}
