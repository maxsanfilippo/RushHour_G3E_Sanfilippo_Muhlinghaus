package fr.iutvalence.info.m2103.RushHour;

/**
 * Board boxes
 * @author sanfilma muhlinge
 */
public class Box
{
	
	private int pieceOfCar;
	
	public int getPieceOfCar()
	{
		return pieceOfCar;
	}

	public void setPieceOfCar(int pieceOfCar)
	{
		this.pieceOfCar = pieceOfCar;
	}

	public Box(int p_pieceOfCar)
	{
		this.pieceOfCar = p_pieceOfCar;
		
	}
	
	public String toString()
	{
		String theBox = "";
		if (this.pieceOfCar == 0)
			theBox += " O ";
		else 
			theBox += " V"+this.pieceOfCar;
		return theBox;
	}
	//TODO:  bout de voiture dans la case , penser a deplacer les 2 
	
	
	
//	/**
//	 * This is the position of the box
//	 */
//	private Position position;
//	
//	/**
//	 * Create a new box with a position set in parameters
//	 * @param thePosition The position of the box : line and column
//	 */
//	public Box(Position thePosition)
//	{
//		this.position=thePosition;
//	}
//
//	/**
//	 * Getter of the position of the box in the board
//	 * @return the position
//	 */
//	public Position getPosition()
//	{
//		return position;
//	}
	

}
