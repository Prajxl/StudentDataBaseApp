package studentsdatabaseapp;
import java.util.Scanner;

public class StudentsDataBaseApp {

	public static void main(String[] args) {
		
		// Ask how many student  we want to add
		System.out.println("Enter the number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		
		// Create n number of new students
		for(int n=0 ; n<numOfStudents ; n++)
		{
			students[n]= new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		for(int n=0 ; n<numOfStudents ; n++)
		{
			System.out.println(students[n].toString());
		}

	}

}
