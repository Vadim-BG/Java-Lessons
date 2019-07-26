package com.javalesson.controlstatement;

public class SwitchCase {
    public static void main(String[] args) {

        String dayOfTheWeek = args[0];
        switch (dayOfTheWeek.toLowerCase()) {
            case "monday":
                System.out.println("This is the first working day");
                break;
            case "tuesday":
                System.out.println("This is the second working day");
                break;
            case "wednesday":
                System.out.println("This is the third working day");
                break;
            case "thursday":
                System.out.println("This is the fourth working day");
                break;
            case "friday":
                System.out.println("This is the fifth working day");
                break;
            case "saturday": case "sunday":
                System.out.println("Finally weekend");
                break;
            default:
                System.out.println("Not a day of the week");

        }
        System.out.println("Final string");




        /*int chois = 4;
        switch (chois) {
            case 1:
                System.out.println("You chose one");
                break;
            case 2:
                System.out.println("You chose two");
                break;
            case 3:
                System.out.println("You chose three");
                break;
            case 4:
                System.out.println("You chose four");
                break;
            default:
                System.out.println("Unsupported option");

        }
        System.out.println("Final string");
*/

    }
}
