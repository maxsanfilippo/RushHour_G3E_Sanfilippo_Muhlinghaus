package fr.iutvalence.info.m2103.RushHour;

/**
 * Board boxes
 * @author sanfilma muhlinge
 */
public class Box
{
	/**
	 * This is the position of the box
	 */
	private Position position;
	
	/**
	 * Create a new box with a position set in parameters
	 * @param thePosition The position of the box : line and column
	 */
	public Box(Position thePosition)
	{
		this.position=thePosition;
	}

	/**
	 * Getter of the position of the box in the board
	 * @return the position
	 */
	public Position getPosition()
	{
		return position;
	}
}
