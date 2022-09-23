package Stepik_Steps;

// На вход подаются целых три числа - день, месяц и год (по григорианскому календарю).
// Выведите true, если эти числа составляют валидную дату, и false - в противном случае.

import java.util.Scanner;

class Stepik_3_2_step12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if ((x>0 & x<=31)&&(y>0 & y <=12) && (z>=0)) {
            if ((y==1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12)  && (x >=1 && x <=31))
            {System.out.println("true");}
            else if ((y == 4 || y == 6 || y == 9 || y == 11) && x >=1 && x <=30)
            {System.out.println("true");}
            else if ((y == 2 && x == 28) || ( y == 2 && x ==29 && (z%4==0 && z%100!=0 || z%400==0)))
            {System.out.println ("true");}
            else {System.out.println("false");}
        }
        else {System.out.println ("false");}
    }
}
