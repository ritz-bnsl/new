package main;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        char ch;
        int sum = 0;
        int l = name.length();
        for (int i = 0; i < l; i++) {
            ch = name.charAt(i);
            if (ch >= 65 && ch <= 91) {
                sum += (int) ch;
            }
        }
        System.out.println(sum);

    }
}

