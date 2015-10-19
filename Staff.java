//define Staff class, subclass of Person class
public class Staff extends Person{
	//lets declare a 3 fields to provide for the state of the Staff class and its objects
	private String title;
	private int roomNumber;
	private double salary;
	//define 1 constructor that takes 6 parameters to initialize new objects for the Staff class
	public Staff(String theTitle, int theRoomNumber, double theSalary, String name, int yearOfBirth, String residence){
		//lets call the base class's constructor using the keyword super()
		super(name, yearOfBirth, residence);
		//set incoming arguments equal to the new object's instance variables
		title = theTitle;
		roomNumber = theRoomNumber;
		salary = theSalary;
	}
	//lets define 3 setter methods to provide for the unique behavior of the Staff class and its objects
	//define a setTitle method to the title to the variable title
	public void setTitle(String t){
		title = t;
	}
	//define a setRoomNumber setter method to assign room number to the variable roomNumber
	public void setRoomNumber(int roomNo){
		roomNumber = roomNo;
	}
	//define a setSalary setter method to assign the salary to the variable salary
	public void setSalary(double s){
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
	public double getSalary(){
		return salary;
	}
}
