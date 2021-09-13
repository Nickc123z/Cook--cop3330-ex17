/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Nick Cook
 */



import java.util.Scanner;


public class E17 {
    public static void main(String[] args) {

        int total;
        int gender;
        int hours;
        int LB;
        float ratio;
        double BAC;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a 1 if you are male or a 2 if yoy are female:");
        gender = scan.nextInt();

        System.out.print("How many ounces of alcohol did you have?");
        total = scan.nextInt();

        System.out.print("What is your weight, in pounds?");
        LB = scan.nextInt();

        System.out.print("How many hours has it been since yours last drink?");
        hours = scan.nextInt();

        if (gender == 1) {
            ratio = (float) 0.73;
        }
        else{
            ratio = (float) 0.66;
        }

        BAC = (total * 5.14 / LB * ratio) - (0.015 * hours);

        System.out.println("Your BAC is " + BAC);
        if (BAC < 0.08) {
            System.out.println("It is legal for you to drive.");
        }
        else{
            System.out.println("It is illegal for you to drive.");
        }
    }

    }

