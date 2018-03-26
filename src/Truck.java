import javax.swing.JOptionPane;

//Use extends to inherit functions and properties from Vehicle.
public class Truck extends Vehicle{

	//Create the variables private to this class.
	private int _numDoors = ((int) (Math.random() * 4) + 1);
	private int _speed = 0;
	private final int _MAX_SPEED = 90;
	private int _wheels = ((int) (Math.random() * 4) + 1);
	private COLOUR _colour;
	
	//Set the default.
	public Truck()
	{
		_colour = COLOUR.Black;
	}
	
	//This is the function to increase the speed.
	public void Accelerate(int speedIncrease)
	{
		//Increase the speed by the integer, speedIncrease, passed. If it's greater than the max speed, then:
		if ((this._speed + speedIncrease) > _MAX_SPEED)
		{
			//Tell the user that they went over the max speed.
			JOptionPane.showMessageDialog(null, "You went over the speed limit.");
		}
		//If it doesn't break the limit,
		else
		{
			//Add the speedIncrease to the speed.
			this._speed += speedIncrease;
		}
	}
		
	//This is the function that decreases the speed.
	public void Brakes(int speedDecrease)
	{
		//Decrease the speed by the value, speedDecrease, passed.
		this._speed -= speedDecrease;
	}
	
	//This function forms the current state of the bike.
	public String CurrentState()
	{
		//Create variable to hold the string of information. 
		String returnString;
				
		//Add all the properties of the bike to the string
		returnString = "Speed: " + this._speed + " Max Speed: " + this._MAX_SPEED + " # Of Doors: " + this._numDoors + " # Of Wheels: " + this._wheels + " Colour: " + randomColour();
				
		//Return the string.
		return returnString;
	}
}
