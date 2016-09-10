package com.mbowen12.week_2;

/*
	Exercise 2
	Name: Michael Bowen
	Date: 09/10/2016
	File Name: Main.java
	Description: compares temperatures and precipitation for chances of snow
*/


public class Main {

    public static void main(String[] args){

        // declarations
        String[] days = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
        int[] temps = {45, 29, 10, 22, 41, 28, 33};
        int[] precip = {95, 60, 25, 5, 0, 75, 90};

        System.out.println("Days of the week with a high chance of snow: ");

        // Loop to measure temp and precipitation
        for(int i=0; i < days.length; i++){
            if (((temps[i]) <= 32) && (precip[i] > 50)) {
                System.out.println(days[i]);
            }
        }
    }
}