package Stepik_Steps;

// На вход подаются три слова на одной строке, разделённые пробелом.
// Выведите их в алфавитном порядке.Гарантируется, что слова начинаются с разных букв.

import java.util.Scanner;
class Stepik_3_2_step13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String one = sc.next();
        String two = sc.next();
        String three = sc.next();
        String a = one.toUpperCase();
        String b = two.toUpperCase();
        String c = three.toUpperCase();

        char o = a.charAt(0);
        char t = b.charAt(0);
        char th = c.charAt(0);

        if((o<t) && (o<th) && (t<th)) {
            System.out.print(three + "\n" + two + "\n" + one);}
        else if ((o<t) && (o<th) && (t>th)) {
            System.out.print(two + "\n" + three + "\n" + one);}
        else if ((o>t) && (o>th) && (t<th)) {
            System.out.print(one + "\n" + three + "\n" + two);}
        else if ((o>t) && (o>th) && (t>th)) {
            System.out.print(three + "\n" + two + "\n" + one);}
        else if ((o<t) && (o>th) && (t>th)) {
            System.out.print(two + "\n" + one + "\n" + three);}
        else {System.out.print(three + "\n" + one + "\n" + two);}
    }
}

