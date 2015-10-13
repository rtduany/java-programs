//define Student class, subclass of Person class
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
