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
		for (int lineNumber = 0; lineNumber < LINES_NUMBER; lineNumber++)
			for (int columnNumber = 0; columnNumber < COLUMNS_NUMBER; columnNumber++)
				this.boxes[lineNumber][columnNumber] = new Box(0);
		boxes[2][3] = new Box(1);
		boxes[2][4] = new Box(1);
		boxes[4][5] = new Box(2);
		boxes[5][5] = new Box(2);
		
//		for (int lineNumber = 0; lineNumber < LINES_NUMBER; lineNumber++)
//			for (int columnNumber = 0; columnNumber < COLUMNS_NUMBER; columnNumber++)
//				if (boxes[lineNumber][columnNumber].getPieceOfCar()==1)
//					boxes[lineNumber][columnNumber].setPieceOfCar(0);
//					boxes[lineNumber+1][columnNumber].setPieceOfCar(0);
	}
	
	private Box getBox(int lineNumber, int columnNumber)
	{
		return this.boxes[lineNumber][columnNumber];
	}

	
	public String toString()
	{
		String theBoard = "------------------------------\n";
		for (int lineNumber = 0; lineNumber < LINES_NUMBER; lineNumber++)
		{
			for (int columnNumber = 0; columnNumber < COLUMNS_NUMBER; columnNumber++)
				theBoard += this.getBox(lineNumber,columnNumber);
			theBoard += '\n';
		}
		return theBoard;
		
	}
	
	
	
	
}
