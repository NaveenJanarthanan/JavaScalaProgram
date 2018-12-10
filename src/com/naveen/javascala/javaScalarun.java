package com.naveen.javascala;

import java.util.Scanner;

public class javaScalarun {

    public static void main(String[] args){

        DoStuff s = new DoStuff();
        String input;


            System.out.println("Hello this program does various things");
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("A. Find the square root of a number?");
            System.out.println("B. Find the area of a rectangle?");
            System.out.println("C. Find the area of a circle?");
            System.out.println("D. Find the volume of a sphere?");
            System.out.println("Enter letter choice:");
            Scanner user_input = new Scanner(System.in);
            input = user_input.next();

            if (input.equals("A")) {
                System.out.println("What number would you like to square?");
                int nums = user_input.nextInt();
                System.out.println(s.square(nums));
                System.out.println("Would you like to choose again? Y/N");
                String choice = user_input.next();
                if (choice.equals("Y")){
                    continue;
                }else{
                    System.out.println("Goodbye!");
                    break;
                }
            } else if (input.equals("B")) {
                System.out.println("What is one side of the rectangle?");
                int r1 = user_input.nextInt();
                System.out.println("What is the other side of the rectangle?");
                int r2 = user_input.nextInt();
                System.out.println(s.areaRectangle(r1, r2));
                System.out.println("Would you like to choose again? Y/N");
                String choice = user_input.next();
                if (choice.equals("Y")){
                    continue;
                }else{
                    System.out.println("Goodbye!");
                    break;
                }
            } else if (input.equals("C")) {
                System.out.println("What is the radius?");
                double r = user_input.nextDouble();
                System.out.println(s.areaCircle(r));
                System.out.println("Would you like to choose again? Y/N");
                String choice = user_input.next();
                if (choice.equals("Y")){
                    continue;
                }else{
                    System.out.println("Goodbye!");
                    break;
                }
            } else if (input.equals("D")) {
                System.out.println("What is the radius?");
                double rs = user_input.nextDouble();
                System.out.println(s.volumeSphere(rs));
                System.out.println("Would you like to choose again? Y/N");
                String choice = user_input.next();
                if (choice.equals("Y")){
                    continue;
                }else{
                    System.out.println("Goodbye!");
                    break;
                }
            } else {
                System.out.println("Invalid entry");
                System.out.println("Would you like to choose again? Y/N");
                String choice = user_input.next();
                if (choice.equals("Y")){
                    continue;
                }else{
                    System.out.println("Goodbye!");
                    break;
                }

            }
        }
    }
}
