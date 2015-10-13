//define a Teacher class, subclass of Person class
class Teacher extends Person{
	//declare a couple of fields to provide for the state of the Teacher class and its objects
	private int numCourses;
	private String courses;
	//define 1 constructor that takes 5 parameters to initialize new objects of the Teacher class
	public Teacher(int theNumCourses, String theCourses, String name, int yearOfBirth, String residence){
		//lets call the base class's constructor using the super() keyword
		super(name, yearOfBirth, residence);
		//set incoming arguments equal to the new object's instance variables
		numCourses = theNumCourses;
		courses = theCourses;
	}
}
