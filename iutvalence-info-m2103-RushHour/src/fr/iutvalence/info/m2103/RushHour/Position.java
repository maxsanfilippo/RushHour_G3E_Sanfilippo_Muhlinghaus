package fr.iutvalence.info.m2103.RushHour;

/**
 * The position of different composants of the game
 * @author sanfilma muhlinge
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
	 * @param p_lineNumber the line number
	 * @param p_columnNumber the column number
	 */
	public Position(int p_lineNumber, int p_columnNumber)
	{
		this.lineNumber=p_lineNumber;
		this.columnNumber=p_columnNumber;
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