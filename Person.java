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
}
