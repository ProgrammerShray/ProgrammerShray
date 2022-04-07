package com.Apps_and_Games;

import java.util.*;

public class Pygame {
    public static void main(String[] args) {
        Random ra= new Random();
        Scanner sc= new Scanner(System.in);

        System.out.print("Number: ");
        Double random_num= ra.nextDouble();
        System.out.println(random_num);
        System.out.print("Enter the number which computer entered: ");
        double user_inp= sc.nextDouble();

        while (user_inp==random_num){
            System.out.print("Congrats! here's the another number: " );
            random_num= ra.nextDouble();
            System.out.println(random_num);
            System.out.print("Enter the number which computer entered: ");
            user_inp= sc.nextDouble();
            if (user_inp!=random_num){
                System.out.println("You Lose boy!");
                break;
            }
        }
    }
}
