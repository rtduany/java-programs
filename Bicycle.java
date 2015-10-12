//lets define Bicycle class
class Bicycle{
	//lets declare three fields that provide for the state of the Bicycle class and its objects
	public int cadence;
	public int gear;
	public int speed;

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
	//lets define a applyBrakes() method that decreases the speed of our Bicycle
	public void applyBrakes(int decrement){
		speed -= decrement;		//speed = speed - decrement
	}
	//define a speedUP() method that increases the speed of our Bicycle
	public void speedUp(int increment){
		speed += increment;		//speed = speed + increment
	}
}
