/*
 * Program: TesttoString.java
 * Student: Lydia Frame 
 * Purpose: Demonstrate toString() method
*/

import java.util.Scanner; // Import the Scanner class

public class TesttoString {
		// Create a Scanner object to read input from the keyboard
		Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    
        //instaniate two object of class Student
        Student student1 = new Student(1, "Don", "Wiggin");
        Student student2 = new Student(1, "Bud", "Wiser"); 

        // print objects
        System.out.println("Student " + student1); 
        System.out.println("Student " + student2);
        
         
        
    }
}