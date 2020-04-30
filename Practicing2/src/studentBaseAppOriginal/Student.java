package studentBaseAppOriginal;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String ID;
	private int gradeYear;
	private String courses = " ";
	private int tuitionBalance;
	private static int costOfCouse = 600;
	private static int id = 1000;
	
	
	//Constructor prompt user to enter student's year
	public Student() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Student first name: ");
		this.firstName = keyboard.nextLine();
		
		System.out.println("Student last name: ");
		this.lastName = keyboard.nextLine();
		
		System.out.println("\n1.Freshmen\n2.Sophomore\n3.Junior\nStudent Class Level: ");
		this.gradeYear = keyboard.nextInt();
		
		setStudentID();
		
		
		
	}
	
	// Generate an ID
	private void setStudentID() {
		//Grade Level + ID
		id++;
		this.ID = gradeYear +""+id;
	}
	
	// Enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter course to enroll [Q to quit]");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			
			if (! course.equals("q")) {
				courses = courses + "\n" + course;
				tuitionBalance += costOfCouse;
			}else
				break;
		} while (1 != 0);
		
		
	}
	
	// View Balance
	public void viewBalance() {
		System.out.println("Your balance is: R$"+tuitionBalance);
	}
	
	
	// Pay Tuition
	public void payTuition () {
		Scanner in = new Scanner (System.in);
		
		viewBalance();
		System.out.print("Enter your payment: R$ ");
		int payment = in.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of: R$ "+ payment);
		System.out.println("Your balance is : R$ "+ tuitionBalance);
		
		
	}
	
	// Show Status
	public String toString() {
		return "\n\nName: " + firstName+ " "+ lastName+
				"\nGrade Level: " + gradeYear+
				"\nID: " + ID +
				"\nCourses Enrolled: "+ courses+
				"\nBalance: R$"+tuitionBalance;
	}
}
