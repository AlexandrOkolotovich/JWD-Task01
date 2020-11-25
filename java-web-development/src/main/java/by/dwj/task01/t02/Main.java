package by.dwj.task01.t02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int day;
        int month;
        int year;

        System.out.println("Input year:");
        year = input();
        System.out.println("Input month:");
        month = input();

        day = amountDays(year, month);

        if(day == 0){
            System.out.println("Incorrect input");
        }
        else {
            System.out.println("Amount of days " + day);
        }

    }

    public static int amountDays(int year, int month){
        int day = 0;

        if(year<0 || month<1 || month>12){
            day = 0;
        }
        else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: {
                    day = 31;
                    break;
                }
                case 2: {
                    if (year % 4 != 0) {
                        day = 28;
                    } else if (year % 100 != 0) {
                        day = 29;
                    } else if (year % 400 != 0) {
                        day = 28;
                    } else {
                        day = 29;
                    }
                    break;
                }
                case 4:
                case 6:
                case 9:
                case 11: {
                    day = 30;
                    break;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + month);
            }
        }

        return day;
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