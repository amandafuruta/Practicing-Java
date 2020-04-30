package studentBaseAppOriginal;

/**
 * Project 2 Student Database Application 
 
 *Scenario: You are a Database Administrator for a university 
 *and need to create an application to manage student enrollments and balance. 
 
 *Your application should do the following: 
 * 1. Ask the user how many new students will be added to the database 
 * 2. The user should be prompted to enter the name and year for each student 
 * 3. The student should have a 5-digit unique ID, with the first number being their grade level 
 * 4. A student can enroll in the following courses: History, Mathematics, English, Chemistry, Computer Science 
 * 5. Each course costs $600 to enroll 
 * 6. The student should be able to view their balance and pay the tuition 
 * 7. To see the status of the student, we should see their name, ID, courses enrolled, and balance 
 * 
 */

import java.util.Scanner;

public class StudentBaseApp {

	public static void main(String[] args) {
		
		// Ask how many students we want to add
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of new students to enroll: ");
		int newStudent = in.nextInt();
		
		Student[] students = new Student[newStudent];
		
		//Create a number of students
		
		for (int i = 0; i < newStudent; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
		}
		
		for (int i = 0; i < newStudent; i++) {
			System.out.println(students[i].toString());
		}
		
	}

}
