package by.dwj.task01.t09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double r;

        final double p=3.14;

        Scanner sc=new Scanner(System.in);

        System.out.println("Input radius:");
        System.out.print("r >> ");
        while(!sc.hasNextDouble()){
            sc.next();
            System.out.print("r >> ");
        }
        r=sc.nextDouble();

        if(r>0) {
            System.out.println("Length is " + countLength(r, p) + "; area is " + countSquare(r, p));
        }
        else System.out.println("ERROR");
    }

    public static double countLength(double r, double p){
        return 2 * p * r;
    }

    public static double countSquare(double r, double p){
        return p * r * r;
    }
}
