//define a Teacher class, subclass of Person class
class Teacher extends Person{
	//declare a couple of fields to provide for the state of the Teacher class and its objects
	private int numCourses;		//number of courses taught currently
	private String[] courses;	//corresponding course codes
	private static final int MAX_COURSES = 10;	//maximum courses
	//define 1 constructor that takes 5 parameters to initialize new objects of the Teacher class
	public Teacher(String name, int yearOfBirth, String residence){
		//lets call the base class's constructor using the super() keyword
		super(name, yearOfBirth, residence);
		numCourses = 0;
		courses = new String[MAX_COURSES];
	}
}
