package fr.iutvalence.info.m2103.RushHour;

/**
 * The position of different composants of the game
 * @author sanfilma
 *
 */
public class Position
{
	/**
	 *  lines number of the board
	 */
	private int lineNumber;

	/**
	 * columns number oh the board
	 */
	private int columnNumber;
	
	/**
	 * Create a new position with initializing line number and column number.
	 * @param lineNumber the line number
	 * @param columnNumber the column number
	 */
	public Position(int lineNumber, int columnNumber)
	{
		this.lineNumber=lineNumber;
		this.columnNumber=columnNumber;
	}
	
	/**
	 * Getter of the line number
	 * @return the line
	 */
	public int getLineNumber()
	{
		return lineNumber;
	}
	
	/**
	 * Getter of the column number
	 * @return the column
	 */
	public int getColumnNumber()
	{
		return columnNumber;
	}
}