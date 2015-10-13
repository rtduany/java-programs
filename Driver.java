/*write a java program that deines a class Person, a Student and Faculty classes that inherit from Person class. Then we define a Driver class to test our program*/

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

//lets now define a subclass called Student class
public class Student extends Person{
	//lets declare a couple of fields that provide for the state of our Student class
	private String SID;
	private String faculty;

	//define 1 constructor with 5 parameters to initialize new objects for the Student class
	public Student(String SID, String faculty, String name, int yearOfBirth, String residence){
		//first lets call the constructor of our base class using the super keyword
		super(String name, int yearOfBirth, String residence);
		//set incoming arguments equal to the our object's instance variables
		this.SID = SID;
		this.faculty = faculty;
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
//define a Staff subclass that inherits from Person
public class Staff extends Person{
	//lets declare a 3 fields to provide for the state of the Staff class
	private String title;
	private int roomNumber;
	private String salary;

	//define 1 constructor that takes 6 parameters to initialize new objects for the Staff class
	public Staff(String theTitle, int theRoomNumber, String theSalary, String name, int yearOfBirth, String residence){
		//lets call the base class's constructor using the keyword super()
		super(String n, int y, String r);
		//set incoming arguments equal to the new object's instance variables
		title = theTitle;
		roomNumber = theRoomNumber;
		salary = theSalary;
	}

	//lets define 3 setter methods to provide for the unique behavior of the Staff class
	public void setTitle(String t){
		title = t;
	}
	public void setRoomNumber(int roomNo){
		roomNumber = roomNo;
	}
	public void setSalary(String s){
		salary = s;
	}

	//define 3 getter methods to provide for the unique behavior of Staff class
	//define a getTitle method
	public String getTitle(){
		return title;
	}
	//define getRoomNumber() method
	public int getRoomNumber(){
		return roomNumber;
	}
	//define getSalary() method
	public String getSalary(){
		return salary;
	}
}
//lets now create a Driver class to test our program
public class Driver{
	//define a main method for our Driver class
	public static void main(String[] args){
		//lets instantiate 2 objects for the Person class
		Person p1 = new Person("Chul James Sigin", 1975, "Addis Ababa, Ethiopia");
		Person p2 = new Person("Daniel Wambugu", 1973, "Dagoreti, Nairobi");
		//instantiate a couple of Student objects
		Student s1 = new Student("ID-55-1909", "Computer Science", "Ibrahim Dirir", 1994, "Kasarani");
		Student s2 = new Student("BC-55-1900", "Software Engineering", "Bill Chabbz", 1992, "Lavington");
		//instantiate a couple of objects for the Staff class
		Staff stf1 = new Staff("Protocol Officer", 5, "$25,000", "Robert Moringa", 1988, "CBD, Nairobi");
		Staff stf2 = new Staff("HIR", 4, "$15,000", "Cornelius Ngondo", 1990, "Westlands, Nairobi");
		//lets do some printing
		System.out.println("First person name: "+p1.getName()+"they born in: "+p1.getYearOfBirth()+"and they live in: "+p1.getResidence());
		System.out.println("Second person name: "+p2.getName()+"they born in: "+p2.getYearOfBirth()+"and they live in: "+p2.getResidence());
	}
}
