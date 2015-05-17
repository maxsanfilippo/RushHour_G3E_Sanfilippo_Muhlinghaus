package fr.iutvalence.info.m2103.RushHour;


/**
 * Game board
 * @author sanfilma muhlinge
 */
public class Board
{
	/**
	 * Default lines number of the board
	 */
	public final static int LINES_NUMBER=6;
	
	/**
	 * Default columns number of the board
	 */
	public final static int COLUMNS_NUMBER=6;
	
	
	
	/**
	 * Array of cars
	 */
	private Car[] cars;
	
	/**
	 * Create a new board with the good number of lines and columns.
	 */	
	public Board()
	{
	

	}
	public void move(int p_carNumber, int p_lineNumber, int p_columnNumber)
	{
		
	}

	
	public String toString()
	{
		String theBoard = "------------------------------\n";
		for (int lineNumber = 0; lineNumber < LINES_NUMBER; lineNumber++)
		{
			for (int columnNumber = 0; columnNumber < COLUMNS_NUMBER; columnNumber++)
			//	theBoard += this.getBox(lineNumber,columnNumber);
			theBoard += '\n';
		}
		return theBoard;
		
	}
	
	
	
	
}
