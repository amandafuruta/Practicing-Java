package emailapplication;

/**
 * Project 1 Email Application 
 
 * Scenario: You are an IT Support Administrator Specialist and are charged
 * with the task of creating email accounts for new hires. 
 
 * Your application should do the following: 
 * 1. Generate an email with the following syntax: firstname.lastname@department.company.com 
 * 2. Determine the department (sales, development, accounting) 
 * 3. Generate a random String for a password 
 * 4. Have set methods to change the password, set the mailbox capacity, and change email address 
 * 5. Have get methods to display the name, email, and mailbox capacity 
 */

import java.util.Scanner;

public class Email {
	private String name;
	private String lastName;
	private String automatEmail;
	private String automatPassword;
	private String automatCompany = "company";
	private int automatMailboxCapacity = 100;
	private int mailboxCapacity;
	private String department;
	
	public Email() {
		menu();
	}
	
	public void menu() {
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("*** WELCOME ***");
		
		this.department = depart();
		
		basicInfos();
		
		automaticEmail();
		
		automaticPassword();
		
		showAutomatInfos();
		
		System.out.println("\n\nDo you want to change your email?\n1.Yes\n2.No");
		int option = keyboard.nextInt();
		if(option == 1) 
			changeEmail();
		
		System.out.println("Do you want to change your password?\n1.Yes\n2.No");
	    option = keyboard.nextInt();
		if (option == 1)
			changePassword();
		
		System.out.println("Do you want to change your mailboxCapacity?\n1.Yes\n2.No");
		option = keyboard.nextInt();
		if (option == 1)
			changeCapacity();
		
		showAutomatInfos();
			
	}
	
	public String depart() {
		System.out.println("*** DEPARTMENTS ***");
		System.out.println("1.Sales\n2.Development\n3.Accounting\nSelect your department:");
		
		Scanner keyboard = new Scanner(System.in);
		int option = keyboard.nextInt();
		
		switch(option) {
			case 1:
				department = "Sales"; break;
			case 2:
				department = "Development"; break;
			case 3:
				department = "Accounting"; break;
			default:
				System.out.println("IT'S NOT AN OPTION. TRY AGAIN\n");
				depart();
		}
		
		return department;
	}
	
	public void basicInfos() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type your name: ");
		this.name = keyboard.nextLine();
		
		System.out.println("Type your last name:");
		this.lastName = keyboard.nextLine();	
	}
	
	private void showAutomatInfos() {
		System.out.println("\n\n*** INFORMATIONS ***");
		
		System.out.println("Name: "+ this.name);
		System.out.println("Last Name: "+ this.lastName);

		System.out.println("Email: "+ this.automatEmail);
		
		System.out.println("Password: "+ this.automatPassword);
		
		System.out.println("Mailbox Capacity: " + this.automatMailboxCapacity);
	}
	
	private void automaticEmail() {
		this.automatEmail = this.name.toLowerCase() + this.lastName.toLowerCase() +"@" + this.department.toLowerCase() + this.automatCompany + ".com"; 

	}
	
	private void automaticPassword() {
		String password = "abcdefghijklmnopqrstuvxywz0123456789!@#$%&*";
		char[] randomPassword = new char[10];
		
		for (int i = 0; i < 10; i++) {
			int rand = (int) (Math.random() * password.length());
			randomPassword[i] = password.charAt(rand);
		}
		
		this.automatPassword = new String (randomPassword);
	}
	
	public void changeEmail() {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("New email: ");
		String newEmail = keyboard.nextLine();
		this.automatEmail =  newEmail;
		
	}
	
	public void changePassword() {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("New Password: ");
		this.automatPassword = keyboard.nextLine();
	}
	
	public void changeCapacity() {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Type your mailbox capacity (Betwen 10 and 200): ");
		int cap = keyboard.nextInt();
		
		if (cap >= 10 && cap <=200)
			this.automatMailboxCapacity = cap;
		else {
			System.out.println("Not betwen the limits. Try again");
			changeCapacity();
		}
	}
	
	
}
