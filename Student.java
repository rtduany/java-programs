/*
Suppose that we are required to model students and teachers in our application. We can define a superclass called Person to store common properties such as name and address, and subclasses Student, Staff and Teacher for their specific properties. For students, we need to maintain the courses taken and their respective grades; add a course with grade, print all courses taken and the average grade. A student takes no more than 30 courses for the entire program. For teachers, we need to maintain the courses taught currently, and able to add or remove a course taught. A teacher teaches not more than 5 courses concurrently.
We design the classes as follows.
*/

//define Student class, subclass of Person class
public class Student extends Person{
	//lets declare a couple of fields that provide for the state of our Student class
	private String SID;
	private String faculty;
	//grade for the corresponding course codes
	private int[] grades;
	//number of courses taken so far, max 30
	private int numCourses;
	//course codes
	private String[] courses;
	//maximum number of courses
	private static final int MAX_COURSES = 30;

	//define 1 constructor with 5 parameters to initialize new objects for the Student class
	public Student(String SID, String faculty, String name, int yearOfBirth, String residence,){
		//first lets call the constructor of our base class using the super keyword
		super(name, yearOfBirth, residence);
		//set incoming arguments equal to the our object's instance variables
		this.SID = SID;
		this.faculty = faculty;
		numCourses = 0;
		courses = new String[MAX_COURSES];
		grades = new int[MAX_COURSES];
	}
	//lets now define a couple of setter methods for the Student class
	public void setSID(String sid){
		SID = sid;
	}
	public void setFaculty(String theFaculty){
		faculty = theFaculty;
	}
	//define a couple of getter methods for the Student class
	public String getSID(){
		return SID;
	}
	public String getFaculty(){
		return faculty;
	}
}
