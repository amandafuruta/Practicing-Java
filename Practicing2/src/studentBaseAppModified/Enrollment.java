package studentBaseAppModified;

import java.util.ArrayList;
import java.util.Scanner;

public class Enrollment extends Student{
	private static int costOfCourse = 600;
	private static int id = 1000;
	private String studentId;
	private int tuitionBalance;
	ArrayList<String> courses = new ArrayList<String>();
	private Scanner in;
	
	

	public Enrollment() {
		super();
		menu();
		enroll();
		payment();
		print();
		//classes();
	}
	
	public Enrollment(String name, String lastName, int ID, String gradeYear) {
		super(name, lastName, ID, gradeYear);
		
	}
	
	private void menu() {
		int newId;
		Scanner in = new Scanner (System.in);
		System.out.println("\n**** ENROLLMENT ****");
		System.out.print("Student first name: ");
		setName(in.nextLine());
		System.out.print("Student last name: ");
		setLastName(in.nextLine());
		
		System.out.println("\n\n   Class Level   ");
		System.out.println("1.Freshmen\n2.Sophomore\n3.Junior");
		System.out.println("\n Select class level: ");
		int option = in.nextInt();
		
		switch (option) {
			case 1:
				setGradeYear("Freshmen");
				break;
			case 2:
				setGradeYear("Sophomore");
				break;
			case 3:
				setGradeYear("Junior");
				break;
			default:
				setGradeYear("Have not inform it");
		}
		studentId = Integer.toString(option) + Integer.toString(this.id);
		this.id++;
	}
	
	private void enroll() {
		Scanner in = new Scanner (System.in);
		int option = 0;
		while (option != 6) {
		System.out.println("\n\nA student can enroll in the following courses:");
		System.out.println("1. History\n2.Mathematics\n3.English\n4.Chemistry\n5.Computer Science\n6.Exit");
		System.out.println("Select one at a time: ");
		option = in.nextInt();
		
		switch (option) {
			case 1: 
				if (! courses.contains("History")) // verifica se o item já foi adicionado no array
					courses.add("History"); 
				break;
			case 2:
				if (! courses.contains("Mathematics"))
					courses.add("Mathematics");
				break;
			case 3:
				if (! courses.contains("English"))
					courses.add("English");
				break;
			case 4:
				if (! courses.contains("Chemistry"))
					courses.add("Chemistry");
				break;
			case 5:
				if (! courses.contains("Computer Science"))
					courses.add("Computer Science");
				break;
			case 6:
				break;
			default:
				System.out.println("Not an Option");
		}
		
		}
		
		tuitionBalance = costOfCourse * courses.size();
	}
	
	private void payment() {
		in = new Scanner (System.in);
		String option;
		int pay;
		System.out.println("\n\nYourBalance: $" + tuitionBalance);
		System.out.print("Do you want to pay now? [y/n] ");
		option = in.next().toLowerCase();
		
		if (option.equals("y")) {
			System.out.print("\nEnter your payment: $");
			pay = in.nextInt();
			
			if(pay <= tuitionBalance) {
				tuitionBalance -= pay;
			}else {
				System.out.println("Not a Valid Number! Try again.");
				payment();
			}

		}else if (! option.equals("n")) {
			System.out.println("Not an Option! Try again.");
			payment();
			
		}
	}
	
	private void print() {
		System.out.println("\n\n************");
		System.out.println("Student Name: " + getName() + " "+ getLastName() );
		System.out.println("Student ID: "+ studentId);
		System.out.println("Grade Year: " + getGradeYear()  );
		System.out.println("Courses: "+ courses);
		System.out.println("Tuition Balance: $ " + tuitionBalance);
	}
	
	
	
	
	
}
