package main;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next().trim();
        int l = name.length();
        name = name.toLowerCase();
        char ch;
        for (int i = 0; i < l; i++) {
            ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                name = name.replace(ch, '*');
            }
        }
        System.out.println(name);
    }
}
