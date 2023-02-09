package com.mycompany.csc229_211review_lab02hw;

import java.util.Scanner;
public class DriverClass {
	
	public static void main(String[] args) {
		// ToDo 5: Fix the error
		Scanner sc = new Scanner(System.in);
                
		// ToDo 6: Fix the constructor of Student class
                //the line below is showing an error
		Student std1= new Student("James", 20, 3.5);
		
		// ToDo 8: Set the gpa of the student using the scanner and user input and then print the output.
		          System.out.println("Enter the GPA of the student: ");
                          std1.setGpa(sc.nextDouble());
                          
                          System.out.println(std1);
		
		// ToDo 9: add comments and explain your code
		
		// ToDo 10: submit using a pull request.
                sc.close();
	}

}