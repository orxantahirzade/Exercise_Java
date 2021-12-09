package com.company.exercise1;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter a String: ");

        String exit = scan.nextLine();

        System.out.println("The Middle character of the String: " + MiddleCharacter(exit));





    }

    public static String MiddleCharacter (String a){


        int strLenght = a.length();
        int middlIndex;

        if(strLenght%2==0){

        middlIndex = a.length()/2-1;

            return a.substring(middlIndex,middlIndex+2);

        }
        else {
            middlIndex = a.length() / 2;
            return a.substring(middlIndex, middlIndex + 1);
        }
    }



}
