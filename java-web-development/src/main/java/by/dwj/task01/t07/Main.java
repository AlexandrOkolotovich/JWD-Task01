package by.dwj.task01.t07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x1;
        double y1;

        double x2;
        double y2;

        System.out.println("Input x1:");
        x1=input();
        System.out.println("Input y1:");
        y1=input();
        System.out.println("Input x2:");
        x2=input();
        System.out.println("Input y2:");
        y2=input();

        System.out.println(searchCloser(x1, y1, x2, y2));
    }

    public static String searchCloser(double x1, double y1, double x2, double y2){

        double l1;
        double l2;

        l1 = Math.sqrt((x1*x1) + (y1*y1));
        l2 = Math.sqrt((x2*x2) + (y2*y2));

        if(l1>l2){
            return "Point B is closer";
        }
        if(l1 == l2){
            return "Equal distance";
        }
        else return "Point A is closer";
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
