package com.linkedin.javacodechallenges;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static boolean isPasswordComplex(String password) {
        return password.length() >= 6 && password.matches(".*\\d.*") // Matches if there is a number in the password
                && password.matches(".*[a-z].*") // Matches if there is a lowercase letter in the password
                && password.matches(".*[A-Z].*"); // Matches if there is an uppercase letter in the password
    }

    
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your password");
        String password=scanner.nextLine();
        System.out.println("is Password strong:?"+ isPasswordComplex(password));
        scanner.close();
    }
}
