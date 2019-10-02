package main;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        char ch1;
        int l = 0, u = 0;
        int abs = 0;
        int ll = name.length();
        for (int i = 0; i < ll; i++) {

            ch1 = name.charAt(i);
            if (ch1 >= 65 && ch1 <= 91) {
                u += (int) ch1;
            } else if (ch1 >= 97 && ch1 <= 122) {
                l += (int) ch1;
            }
        }
        abs = u - l;
        System.out.println(Math.abs(abs));

    }
}
