package by.dwj.task01.t10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double a;
        double b;
        double h;

        System.out.println("Input a:");
        a = input();
        System.out.println("Input b");
        b = input();
        System.out.println("Input h");
        h = input();

        System.out.println(calculateFunction(a, b, h));

    }

    public static String calculateFunction(double a, double b, double h){

        double f;
        String answer = "";

        if(a < b && b-a > h){
            System.out.println(" x   | f(x)");

            for(double i=a; i<=b; i+=h){
                f = Math.tan(i);
                answer += " " + i + " | " + f + "\n";
            }
            return answer;
        }
        else return  "ERROR";
    }

    public static double input(){
        Scanner sc = new Scanner(System.in);

        System.out.print(">> ");
        while(!sc.hasNextDouble()) {
            sc.next();
            System.out.print(">> ");
        }

        return sc.nextDouble();
    }
}
