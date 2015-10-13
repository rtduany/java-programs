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
		System.out.println("First person name: "+p1.getName()+" born in: "+p1.getYearOfBirth()
						   +" and residing in: "+p1.getResidence());
		System.out.println("Second person name: "+p2.getName()+" born in: "+p2.getYearOfBirth()
						   +" and residing in: "+p2.getResidence());
		//print a couple of Student objects
		System.out.println("First student's name: "+s1.getName()+" born in: "+s1.getYearOfBirth()
						   +" and residing in: "+s1.getResidence()+" with a student ID: "
						   +s1.getSID()+" Majoring in: "+s1.getFaculty());
		System.out.println("Second student's name: "+s2.getName()+" born in: "+s2.getYearOfBirth()
						   +" and residing in: "+s2.getResidence()+" with a student ID: "
						   +s2.getSID()+" Majoring in: "+s2.getFaculty());
		//print a couple of Staff objects
		System.out.println("Staff name: "+stf1.getName()+" born in: "+stf1.getYearOfBirth()
						   +" and residing in: "+stf1.getResidence()+" with a Office no: "
						   +stf1.getRoomNumber()+" Job title: "+stf1.getTitle()
						   +" and their salary is: "+stf1.getSalary());
		System.out.println("Staff name: "+stf2.getName()+" born in: "+stf2.getYearOfBirth()
						   +" and residing in: "+stf2.getResidence()+" with an Office no: "
						   +stf2.getRoomNumber()+"Job title: "+stf2.getTitle()+" and their salary is: "
						   +stf2.getSalary());
	}
}
