/*write a java program that deines a class Person, a Student and Faculty classes that inherit from Person class. Then we define a Driver class to test our program*/

//define a Person class
class Person{
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
class Student extends Person{
	//lets declare a couple of fields that provide for the state of our Student class
	private String SID;
	private String faculty;

	//define 1 constructor with 5 parameters to initialize new objects for the Student class
	public Student(String SID, String faculty, String name, int yearOfBirth, String residence){
		//first lets call the constructor of our base class using the super keyword
		super(String n, int y, String r);
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
class Staff extends Person{
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

	//
}
