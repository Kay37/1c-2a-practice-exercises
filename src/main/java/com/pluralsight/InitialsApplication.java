package com.pluralsight;

// ! importing Scanner for user input

import java.util.Scanner;

public class InitialsApplication {

    // ! public static Scanner that any method can call without need for passing around a Scanner
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // TODO - Ask the user for their first and last name
        System.out.print("Hello! Please provide your first and last name (e.g. James Smith) : ");
        String fullName = sc.nextLine();

        // TODO - Trim the user's response
        String formattedName = fullName.trim();
        String nameForLength = formattedName.replace(" ", "");
        // TODO - Display to the user their initials, a username, and the total # of letters in their names.
        String[] nameParts = formattedName.split(" ");
        // * variables for different displays & switch statement
        // declaring two variables so we can store first and last names. Haven't assigned their values b/c need to check
        // how many names the user entered first, with our switch statement.
        String firstName;
        String lastName;

        switch (nameParts.length) {
            case 1:
                System.out.println("Please enter your first and last name.");
                // the user entered one name - so case 1 is when nameParts.length = 1 (starts at 0 but only one part)
                return;

            case 2:
                firstName = nameParts[0];
                lastName = nameParts[1];
                // the user entered two names
                break;

            default:
                firstName = nameParts[0];
                lastName = nameParts[nameParts.length -1];
                // the user entered three names
                break;
        }
        String firstInitial = nameParts[0].substring(0, 1).toUpperCase();
        String lastInitial = lastName.substring(0, 1).toUpperCase();
        String username = firstInitial.toLowerCase() + lastName.toLowerCase();
        int namesLength = nameForLength.length();

        System.out.println("Your initials are: " + firstInitial + "." + lastInitial + ".");
        System.out.println("Your username is: " + username);
        System.out.println("Your name has " + namesLength + " letters");

        sc.close();
    } // ! main method cBracket
} // ! main class cBracket
