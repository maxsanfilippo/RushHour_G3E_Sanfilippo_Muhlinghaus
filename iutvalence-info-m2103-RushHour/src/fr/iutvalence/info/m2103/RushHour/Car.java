package fr.iutvalence.info.m2103.RushHour;

public class Car
{
	private int number;
	
	private Position position1;
	
	private Position position2;
	
	public Car(int p_number, Position p_position1, Position p_position2)
	{
		this.number = p_number;
		this.position1 = p_position1;
		this.position2 = p_position2;
	}
	
	
	
	public String toString()
	{
		String theCar = "";
		if (this.number == 0)
			theCar += " O ";
		else
			theCar += " V"+this.number;
		return theCar;
	}
	
}
