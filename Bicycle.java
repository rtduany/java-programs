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
}
