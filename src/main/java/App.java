/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */

import java.util.*;


public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Scanner method called

        //Variables used
        int num_people;
        int num_pizzas;
        int num_slices;

        System.out.print("How many people? ");
        num_people = in.nextInt();

        System.out.print("How many pizzas do you have? ");
        num_pizzas = in.nextInt();

        System.out.print("How many slices per pizza? ");
        num_slices = in.nextInt();

        int total_slices = num_pizzas * num_slices; //Here we are finding the total slices of pizzas.
        int leftover;
        int perPerson;

        System.out.println(num_people + " people with  " + num_pizzas + " pizzas (" + total_slices + " slices)");

        perPerson = total_slices / num_people; //Here we are finding how many slices evenly can get each person
        System.out.println("Each person gets " + perPerson + " pieces of pizza");

        leftover = total_slices % num_people; //Here we are finding the leftovers of the pizza

        System.out.println("There are " + leftover + " leftovers");

    }
}
