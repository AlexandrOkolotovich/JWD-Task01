package by.dwj.task01.t03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double s1;   //the area of the described square
        double areaRatio;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the area of described square: ");
        System.out.print("S >> ");
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.print("S >> ");
        }
        s1 = sc.nextDouble();

        areaRatio = calculateAttitude(s1);

        if (areaRatio == 0){
            System.out.println("Incorrect input");
        }
        else System.out.println("s1 / s2 = " + areaRatio);

    }

    public static double calculateAttitude(double s1){

        double areaRatio = 0;
        double s2;  //the area of the inscribed square
        double r;   //radius

        if(s1>0) {
            r = Math.sqrt(s1) / 2;
            s2 = 2 * r * r;

            areaRatio = s1 / s2;
        }
        else areaRatio = 0;

        return areaRatio;
    }
}