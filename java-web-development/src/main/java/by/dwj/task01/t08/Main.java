package by.dwj.task01.t08;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x;

        Scanner sc=new Scanner(System.in);

        System.out.print("x >> ");
        while(!sc.hasNextDouble()){
            sc.next();
            System.out.print("x >> ");

        }
        x=sc.nextDouble();

        System.out.println("Значение функции при x = " + x + " равно " + functionValue(x));
    }

    public static double functionValue(double x){
        double f;

        if(x>=3) {
            f=-Math.pow(x, 2)+3*x+9;
        }
        else {
            f=1/(Math.pow(x, 3)-6);
        }
        return f;
    }
}