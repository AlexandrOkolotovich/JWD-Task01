package by.dwj.task01.t01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x;
        int res;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input number: ");
        System.out.print("x >> ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("x >> ");
        }
        x = sc.nextInt();

        res = lastDigitSquare(x);

        System.out.println("last digit of square is " + res);

    }

    public static int lastDigitSquare(int x){
        int res;

        x = Math.abs(x % 10);

        switch (x) {
            case 0:
            case 1:
            case 5:
            case 6: {
                res = x;
                break;
            }
            case 2:
            case 8: {
                res = 4;
                break;
            }
            case 3:
            case 7: {
                res = 9;
                break;
            }
            case 4: {
                res = 6;
                break;
            }
            case 9: {
                res = 1;
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + x);
        }

        return res;
    }

}
