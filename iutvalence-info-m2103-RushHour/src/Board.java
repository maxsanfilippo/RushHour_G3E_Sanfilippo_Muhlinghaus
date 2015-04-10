
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
	 *  lines number of the board
	 */
	private final int linesNumber;
	
	/**
	 * columns number oh the board
	 */
	private final int columnsNumber;
	
	/**
	 * Array of boxes
	 */
	private Box[][] boxes;
	
	/**
	 * Create a new board with the good number of lines and columns.
	 */	
	public Board()
	{
		this.linesNumber=LINES_NUMBER;
		this.columnsNumber=COLUMNS_NUMBER;
		//TODO : faire une boucle pour initialiser le tableau : les voitures
	}
	
	
	
}
