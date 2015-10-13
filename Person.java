/* Suppose that we are required to model students and teachers in our application. We can define a superclass called Person to store common properties such as name and address, and subclasses Student and Teacher for their specific properties. For students, we need to maintain the courses taken and their respective grades; add a course with grade, print all courses taken and the average grade. A student takes no more than 30 courses for the entire program. For teachers, we need to maintain the courses taught currently, and able to add or remove a course taught. A teacher teaches not more than 5 courses concurrently.
We design the classes as follows. */

//define a Person class
public class Person{
	//lets declare 3 fields for the Person class and its objects
	private String name;
	private int yearOfBirth;
	private String residence;

	//define 1 constructore that takes 3 parameters to initialize new objects for our Person class
	public Person(String name, int yearOfBirth, String residence){
		//set the incoming arguments equal to this bject's fields
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.residence = residence;
	}

	//lets now define some setter and getter methods for the Person class
	//first lets define 3 setter methods
	public void setName(String newName){
		name = newName;
	}
	public void setYearOfBirth(int newYear){
		yearOfBirth = newYear;
	}
	public void setResidence(String newResidence){
		residence = newResidence;
	}
	//lets now define the 3 getter methods
	public String getName(){
		return name;
	}
	public int getYearOfBirth(){
		return yearOfBirth;
	}
}
