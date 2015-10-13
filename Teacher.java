//define a Teacher class, subclass of Person class
class Teacher extends Person{
	//declare a couple of fields to provide for the state of the Teacher class and its objects
	private int numCourses;		//number of courses taught currently
	private String[] courses;	//corresponding course codes
	private String salary;
	private static final int MAX_COURSES = 10;	//maximum courses
	//define 1 constructor that takes 5 parameters to initialize new objects of the Teacher class
	public Teacher(String salary, String name, int yearOfBirth, String residence){
		//lets call the base class's constructor using the super() keyword
		super(name, yearOfBirth, residence);
		//set incomin argument equal to instance variable
		this.salary = salary;
		numCourses = 0;
		courses = new String[MAX_COURSES];
	}
	//define 1 setter method to provide for the unique bahavior of the Teacher class and its objects
	public void setSalary(String salary){
		this.salary = salary;
	}
	//define 1 getter method to provide for the unique behavior of the Teacher class and its objects
	public String getSalary(){
		return this.salary;
	}
}
