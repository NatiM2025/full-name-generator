package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        System.out.print("First name: ");
        String firstName = input.nextLine();
        System.out.print("Middle name: ");
        String middleName = input.nextLine();
        System.out.print("Last name: ");
        String lastName = input.nextLine();
        System.out.print("Suffix: ");
        String suffix = input.nextLine();

        String result = createFullName(firstName,middleName,lastName,suffix);
        System.out.println(result);

    }

    public static String createFullName (String firstName,String middleName, String lastName, String suffix){
        String fullName = "";
        if (!firstName.isBlank()){
            fullName += firstName + " ";
        }if (!middleName.isBlank()) {
            fullName += middleName + " ";
        }if (!lastName.isBlank()){
            fullName += lastName;
        }if (!suffix.isBlank()) {
            fullName += "," + suffix;
        }
        System.out.println(fullName);
        return fullName;
    }
}
