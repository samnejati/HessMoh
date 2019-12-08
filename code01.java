//package com.smilecode;

import java.util.Scanner;
public class code01{
    public static void main(String []args) {
//System.out.println("hello world");
        int numPeople;
        String firstName, lastName, socialNum, phoneNum, address;

        Scanner kb = new Scanner(System.in);

        System.out.print("Number of People to be added to database: ");
        numPeople = kb.nextInt();
        System.out.println("Number of People that will be added: "+numPeople); // just checking

        kb.nextLine(); // flushing the input stream

        int numArrays = numPeople;
        int numElements = 5; // five input: firstName, lastName, socialNum, phoneNum, address
        String[][] arrays = new String[numArrays][numElements];
        for (int i=0; i<numArrays; i++)
        {
                System.out.print("Firstname: ");
                firstName = kb.nextLine();

                System.out.print("Lastname: ");
                lastName = kb.nextLine();

                System.out.print("SSN: ");
                socialNum = kb.nextLine();

                System.out.print("Phone: ");
                phoneNum = kb.nextLine();

                System.out.print("Address: ");
                address = kb.nextLine();

                System.out.print("Your information is as follows: Firstname: "+firstName+ ", Lastname: "+ lastName+", SSN: "+socialNum+ ", Phone: "+phoneNum+", Address: "+address);
                if (numArrays>1) {
                    System.out.println("\n<<Please enter the information of the next person.>>");
                }

          /*  for (int j=0; j<numElements; j++)
            {

//                arrays[i][j] = "Hello";
//                System.out.println(arrays[i][j] + " ");

            }*/
        }
//String [] myArray = {Ali, Hessam, David};

        // Print all the array elements
        // for (int i = 0; i < myArray.length; i++) {
        //    System.out.println(myArray[i] + " ");
        // }
    }
}