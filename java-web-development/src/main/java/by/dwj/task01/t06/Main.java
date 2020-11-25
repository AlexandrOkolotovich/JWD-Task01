package by.dwj.task01.t06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int s;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input number seconds: ");
        System.out.print("n >> ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("n >> ");
        }
        s = sc.nextInt();

        System.out.println(calculateTime(s));
    }

    public static int countHours(int s){
        return s / 3600;
    }

    public static int countMinutes(int s, int h){
        return (s - h * 3600) / 60;
    }

    public static int countSeconds(int s, int h, int m){
        return s - 3600 * h - 60 * m;
    }

    public static String calculateTime(int s){
        int m;
        int h;

        if(s<0){
            return "ERROR";
        }
        else {
            h = countHours(s);
            m = countMinutes(s, h);
            s = countSeconds(s, h, m);

            return h + " hours " + m + " minutes " + s + " seconds have passed";
        }
    }
}