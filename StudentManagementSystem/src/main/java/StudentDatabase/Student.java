package StudentDatabase;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses =null;
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
		
		System.out.println(firstName + " " + lastName + ", " + gradeYear + " " + studentId);
		
		enroll();
		
		
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
					courses = courses + "\n" + course;
					tuitionBalance = tuitionBalance + costOfCourse;
				}
			}
		System.out.println("Enrolled in: " + courses);
		System.out.println("Tuition Balance: " + tuitionBalance);
	}
}
