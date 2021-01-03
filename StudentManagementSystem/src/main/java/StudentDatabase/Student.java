package StudentDatabase;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses="";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentId();
		
		//System.out.println(firstName + " " + lastName + ", " + gradeYear + " " + studentId);
		
		
		
		
	}
	
	private void setStudentId() {
		id++;
		this.studentId =  gradeYear + "" + id;
	}
	
	public void enroll() {
			boolean enroll=true;
			while(enroll) {
				System.out.print("Enter course to enroll (Q to quit): ");
				Scanner in = new Scanner(System.in);
				String course = in.nextLine();
				if(course.equals("Q")) {
					enroll = false;
					//break;
				} else {
					
					courses = courses + "\n  " + course;
					tuitionBalance = tuitionBalance + costOfCourse;
					
				}
			}
		//System.out.println("Enrolled in: " + courses);
		//System.out.println("Tuition Balance: " + tuitionBalance);
	}
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	public String toString() {
		return "\nName: " + firstName + " " + lastName + 
				"\nGrade Level: " + gradeYear + "\nStudent ID: " + studentId +
				"\nCourses Enrolled: " + courses + "\nBalance: $" + tuitionBalance;
	}
}
