//lets define Bicycle class
class Bicycle{
	//lets declare three fields that provide for the state of the Bicycle class and its objects
	private int cadence;
	private int gear;
	private int speed;

	//lets define one constructor that takes 3 parameters to initialize new objects for our Bicycle class
	public Bicycle(int startCadence, int startGear, int startSpeed){
		//lets set our incoming arguments equal to this (object's) fields
		cadence = startCadence;
		gear = startGear;
		speed = startSpeed;
	}

	//we now define methods to implement behaviors for our Bicycle class and its objects
	//lets define a couple of setter methods for the Bicycle
	public void setCadence(int newValue){
		cadence = newValue;
	}
	public void setGear(int newValue){
		gear = newValue;
	}

	//we define three getter methods that obtain field values for us
	public int getCadence(){
		return cadence;
	}
	public int getGear(){
		return gear;
	}
	public int getSpeed(){
		return speed;
	}

	//lets define a applyBrakes() method that decreases the speed of our Bicycle
	public void applyBrakes(int decrement){
		speed -= decrement;		//speed = speed - decrement
	}
	//define a speedUP() method that increases the speed of our Bicycle
	public void speedUp(int increment){
		speed += increment;		//speed = speed + increment
	}
}

/** MountainBike inherits all the fields and methods of Bicycle and adds the field seatHeight and a method to set it (mountain bikes have seats that can be moved up and down as the terrain demands).*/
//lets define a MountainBike class that is a subclass of Bicycle
public class MountainBike{
	//declare one field that provides for the state of the MountainBike class and its objects
	public int seatHeight;
	//lets define constructor that initializes new objects for our MountainBike class and its objects
	public MountainBike(int startHeight, int startCadence, int startGear, int startSpeed){
		super(int startCadence, int startGear, int startSpeed);
		seatHeight = startHeight;
	}
	//lets define one setter method to implement a unique behavior for the MountainBike class
	public void setHeight(newValue){
		seatHeight = newValue;
	}
}
