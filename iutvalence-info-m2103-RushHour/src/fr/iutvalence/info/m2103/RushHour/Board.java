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
	 * Array of boxes
	 */
	private Box[][] boxes;
	
	/**
	 * Create a new board with the good number of lines and columns.
	 */	
	public Board()
	{
		this.boxes = new Box[LINES_NUMBER][COLUMNS_NUMBER];
		//TODO : faire une boucle pour initialiser le tableau : les voitures
	}
	
	
	
}
