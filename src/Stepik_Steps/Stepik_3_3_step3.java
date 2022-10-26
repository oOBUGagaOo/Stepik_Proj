package Stepik_Steps;

// На вход подаётся три целых числа. Выведите среднее из них (т.е. не минимальное и не максимальное)

import java.util.Scanner;

public class Stepik_3_3_step3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();
        if ((a>=b&&a<=c)||(a<=b&&a>=c));
        System.out.println(a);
        if ((b>=a&&b<=c)||(b<=a&&b>=c));
        System.out.println(b);
        if ((c>=a&&c<=b)||(c<=a&&c>=b));
        System.out.println(c);
    }
}


