package by.dwj.task01.t05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x;

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("Input number: ");
            System.out.print("x >> ");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.print("x >> ");
            }
            x = sc.nextInt();

            System.out.println(sum(x));
        }

    }

    public static String sum(int x){
        int a = 0;

        if(x>0) {
            for (int i = 1; i < x; i++) {
                if (x % i == 0) {
                    a += i;
                }
            }
        }
        else {
            a = 1; //для проверки что это число <=0
        }

        if (x == a) {
            return "TRUE";
        } else return "FALSE";
    }
}
