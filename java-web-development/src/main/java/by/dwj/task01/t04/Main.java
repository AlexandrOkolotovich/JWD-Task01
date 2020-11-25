package by.dwj.task01.t04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;

        System.out.println("Input A:");
        a = input();
        System.out.println("Input B:");
        b = input();
        System.out.println("Input C:");
        c = input();
        System.out.println("Input D:");
        d = input();

        System.out.println(checkTwoEven(a, b, c, d));

    }


    public static int evenNum(int x){
        if(x%2 == 0 && x > 0){
            return 1;
        }
        return 0;
    }

    public static String checkTwoEven(int a, int b, int c, int d){
        if (evenNum(a) + evenNum(b) + evenNum(c) + evenNum(d) >= 2) {
            return "TRUE";
        } else return "FALSE";
    }

    public static int input(){
        Scanner sc = new Scanner(System.in);

        System.out.print(">> ");
        while(!sc.hasNextInt()) {
            sc.next();
            System.out.print(">> ");
        }

        return sc.nextInt();
    }
}
