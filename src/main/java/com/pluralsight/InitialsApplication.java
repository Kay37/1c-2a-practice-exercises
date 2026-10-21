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
        String nameForLength = fullName.replace(" ", "");
        // TODO - Display to the user their initials, a username, and the total # of letters in their names.
        String[] nameParts =  fullName.split(" ");
        // * variables for different displays
        String firstInitial =  nameParts[0].substring(0, 1).toUpperCase();
        String lastInitial = nameParts[1].substring(0, 1).toUpperCase();
        String username = firstInitial.toLowerCase() + nameParts[1].toLowerCase();
        int namesLength = nameForLength.length();

        System.out.println("Your initials are: " + firstInitial + "." + lastInitial + ".");
        System.out.println("Your username is: " + username);
        System.out.println("Your name has " + namesLength + " letters");
    } // ! main method cBracket
} // ! main class cBracket
