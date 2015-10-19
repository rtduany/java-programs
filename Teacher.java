//define a Teacher class, subclass of Person class
class Teacher extends Person{
	//declare a couple of fields to provide for the state of the Teacher class and its objects
	private int numCourses;		//number of courses taught currently
	private String[] courses;	//corresponding course codes
	private double salary;
	private static final int MAX_COURSES = 10;	//maximum courses
	//define 1 constructor that takes 4 parameters to initialize new objects of the Teacher class
	public Teacher(double salary, String name, int yearOfBirth, String residence){
		//lets call the base class's constructor using the super() keyword
		super(name, yearOfBirth, residence);
		//set incoming argument equal to instance variable salary
		this.salary = salary;
		//lets reset the counter each time the object is instantiated
		numCourses = 0;
		//lets instantiate a new String array and assign it to courses String Array (course codes)
		courses = new String[MAX_COURSES];
	}
	//define 1 setter method to provide for the unique bahavior of the Teacher class and its objects
	public void setSalary(double salary){
		this.salary = salary;
	}
	//define 1 getter method to provide for the unique behavior of the Teacher class and its objects
	public String getSalary(){
		return this.salary;
	}
	//validate the addition of a course. If the course already exists, return false
	public boolean addCourse(String course){
		//we now check to see if the course is already in the list
		for (int i = 0; i < numCourses; i++){
			if (course[i].equals(course)) return false;
		}
		courses[numCourses] = course;
		numCourses++;
		return true;
	}
	//lets now conside the case in which the course is not in the course list
	public boolean removeCourse(String course){
		//lets look for the course index
		courseIndex = numCourses;
		for (int i = 0; i < numCourses; i++){
			if (courses[i].equal(course)){
				courseIndex = i;
				break;
			}
		}
	}
}
