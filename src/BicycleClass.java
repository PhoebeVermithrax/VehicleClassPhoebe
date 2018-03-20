/*
 * Created by: Phoebe Vermithrax
 * Created on: 19-March-2018
 * Created for: ICS4U
 * Daily Assignment – Day #21
 * This program expands on the vehicle class, and inherits from it. It changes some things, and overrides others, and outputs this.
*/

//Use extend to inherit from the Vehicle class.
public class BicycleClass extends Vehicle{
	
	//Rewrite the variables for this class.
	private int _speed = 0;
	private final int _MAX_SPEED = 90;
	private int _seats = 1;
	private int _wheels = 2;
	private COLOUR _colour;
	
	//Set the default.
	public BicycleClass()
	{
		_colour = COLOUR.Black;
	}
	
	/*public BicycleClass (COLOUR userColour)
	{
		 _colour = userColour;
	}*/
	
	//This function forms the current state of the bike.
	public String CurrentState()
	{
		//Create variable to hold the string of information. 
		String returnString;
			
		//Add all the properties of the bike to the string
		returnString = "Speed: " + this._speed + " Max Speed: " + this._MAX_SPEED + " # Of Seats: " + this._seats + " # Of Wheels: " + this._wheels + " Colour: " + randomColour();
			
		//Return the string.
		return returnString;
	}

}
