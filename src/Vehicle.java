import java.util.Random;

import javax.swing.JOptionPane;

public class Vehicle {
	
	//Create an enum to hold all the variables for colour.
	public enum COLOUR
	{
		Red,
		Black,
		Blue,
		Purple, 
		Pink, 
		Yellow,
		White,
		Grey,
		Green,
		Orange
	}
	
	//Create the variables for the speed, license plate, and colour.
	private int _speed = 0;
	private final int _MAX_SPEED = 120;
	private String _licensePlate = "000-000";
	//private COLOUR _colour = COLOUR.Black;
	private int _numDoors = ((int) (Math.random() * 4) + 1);
	
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
	
	//This is a function that randomizes the colour of the car.
	private COLOUR randomColour()
	{
		//This is to randomize the colours chosen for the car.
		int random = new Random().nextInt(COLOUR.values().length);
		
		//Return this value.
		return COLOUR.values()[random];
	}
	
	//This function forms the current state of the car.
	public String CurrentState()
	{
		//Create variable to hold the string of information. 
		String returnString;
		
		//Add all the properties of the vehicle to the string/
		returnString = "Speed: " + this._speed + " # Of Doors: " + this._numDoors + " License Plate: " + this._licensePlate + " Colour: "
				+ randomColour();
		
		//Return the string.
		return returnString;
	}
	
}
