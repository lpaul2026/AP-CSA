/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomnumberprogramming;

//imported the random class
import java.util.Random;
//imported the Scanner class to get user input
import java.util.Scanner;
/**
 *
 * @author LPaul2026
 */
public class RandomNumberProgramming {

    public static void main(String[] args) {
        //define the new generator 
        Random generator = new Random();
        Scanner scanner = new Scanner(System.in);
    //PART ONE: PHONE NUMBER GENERATOR
        //define the first digits of the phone number as integers
        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int fourthDigit;
        //define the number for the fifth and sixth digits of the phone number as an int
        int fifthSixthDigits;
        ////define the seventh digit of the phone number as an int
        int seventhDigit;
        ////define the number for the last three digits of the phone number as an int
        int lastThreeDigits;
        //define a string called numberInput with the value "p" that will be used in the while loop
        String numberInput = "p";
        //this statments makes it so that name must contain p in order for the user to continue with the program 
        while(numberInput.contentEquals("p")) {
            //the first three digits are random numbers from 0-7
            firstDigit = generator.nextInt(8);
            secondDigit = generator.nextInt(8);
            thirdDigit = generator.nextInt(8);
            //the first digit of the second set is from 0-5, so that the hundreds place of the second set cannot be larger than 600
            fourthDigit = generator.nextInt(6);
            //the final digts of the second set is from 10-55, so that the second set is 3 digits but smaller than 656
            fifthSixthDigits = generator.nextInt(46) + 10;
            //the first digit of the third set is from 0-9, which accounts for the possibility of 0 starting the third set
            seventhDigit = generator.nextInt(10);
            //the final digits of the third sets are from 100-999, so that the third set is 4 digits
            lastThreeDigits = generator.nextInt(900) + 100;
            //printing out the randomized phone number
            System.out.println("A random phone number: " + firstDigit + secondDigit + thirdDigit + "-" + fourthDigit + fifthSixthDigits + "-" + seventhDigit + lastThreeDigits);
            //prompt for user to input a string
            System.out.println("Enter p to generate another random phone number: ");
            //allows user input
            numberInput = scanner.nextLine();
        }
    //PART TWO: 6 SIDED DIE GENERATOR
        //define the variable for the die
        int dieNumber;
        //define a string called dieInput with the value "r" that will be used in the while loop
        String dieInput = "r";
        //set the die as equal to the a random number from 1-6
        while(dieInput.contentEquals("r")) {
            dieNumber = generator.nextInt(6) + 1;
            //print the randomly generated number for the die value
            System.out.println("Randomly generated die value is: " + dieNumber);
            //prompt for user to input a string
            System.out.println("Enter r to generate another random die value: ");
            //allows user input
            dieInput = scanner.nextLine();
        }
    }
}
