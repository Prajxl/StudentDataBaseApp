package studentsdatabaseapp;
import java.util.Scanner;
public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses=null;
	private int tuitionBalance=0;
	private static int costtOfCourse = 600;
	private static int id = 1000;
	
	
	// Constructor : prompt user to enter students name and year
	public Student() {
		Scanner in =  new Scanner(System.in);
		System.out.print("Enter student first name ");
		this.firstName=in.nextLine();
		
		System.out.print("Enter student last name ");
		this.lastName=in.nextLine();
		
		System.out.print("1 - Freshman\n2 - sophmore\n3 - junior\n4 - Senior\nEnter student class level ");
		this.gradeYear=in.nextInt();
		
		setStudentID();
		
//		System.out.println(firstName + " " + lastName + " " + gradeYear  + " " + studentID);
		
	}
	
			// Generate Id
	 private void setStudentID() {
	    	 // Grade level + id
		 id++;
		 this.studentID = gradeYear + "" + id;
	 }
			
			// Enroll in courses
	 public void enroll() {		
		 //Get inside a loop , user hits 0
		 do {
		  System.out.print("Enter course to enroll (Q to quit): ");
		  Scanner in = new Scanner(System.in);
		  String course = in.nextLine();
		  if( !course.equals("Q"))
		  {
			  courses = courses + "\n  " + course ;
			  tuitionBalance = tuitionBalance + costtOfCourse;
		  }else {
			  break;
		  }
		  
		  
		 } while(1 !=  0 );
			 
			 
//		 System.out.println("Enrolled In : "+courses);
//		 System.out.println("Tuition Balance " +tuitionBalance);
	 }
			//View balance
	 public void viewBalance() {
		 System.out.println("Your balance is: $"+tuitionBalance);
	 }
			
			//Pay tuition
	public void payTuition()
	{
		viewBalance();
		System.out.println("Enter your payment : $ ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thankyou for your Paymment of $ " +payment);
		viewBalance();
	}
			// Show status 
	public String toString() {
		return "Name: " + firstName+ " " + lastName +
				"\nGradelevel: " +gradeYear +
				"\nStudent ID: " +studentID +
				"\nCourses Enrolled:" + courses +
				"\nBalance: $" +tuitionBalance;
	}
	
}
