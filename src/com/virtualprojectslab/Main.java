package com.virtualprojectslab;

public class Main {

    public static void main(String[] args) {
/*
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }
*/
/*
        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:
            System.out.println("was 3 ro 4 ro 5");
            System.out.println("Astualy it was " + switchValue);
            break;

            default:
                System.out.println("Was not 1 or 2");
                break;
*/
        char myCharacter = 'C';

        switch (myCharacter) {
            case 'A':
                System.out.println("My character was A");
                break;
            case 'B':
                System.out.println("My character was B");
                break;
            case 'C':
                System.out.println("My character was C");
                break;
            case 'D':
            case 'E':
                System.out.println(myCharacter + " was found");
                break;
            default:
                System.out.println("My character was not A, B, C, D or E");
                break;

        }

        String month = "JaNUary";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not sure");
                break;

        }

    }
}
