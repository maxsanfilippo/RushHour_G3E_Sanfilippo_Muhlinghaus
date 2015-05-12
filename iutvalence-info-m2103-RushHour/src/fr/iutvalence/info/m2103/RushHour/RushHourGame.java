package fr.iutvalence.info.m2103.RushHour;


/**
 * This class represents a Rush Hour game : 
 * <a href="http://fr.wikipedia.org/wiki/Rush_hour_%28casse-t%C3%AAte%29"> RushHour rules <a/>
 * The goal is to exit the red car of the board. There is other cars and trucks placed to. The player can move all
 * of these vehicles in the right direction.
 * @author sanfilma muhlinge
 */
public class RushHourGame
{
	/**
	 * The game board
	 */
	private Board board;
	
	
	/**
	 * Create a new game with a new board of boxes and a red car ( player's car ) placed
	 */
	public RushHourGame()
	{
		this.board = new Board();
	}
	
	/**
	 * Algorithm of the game development
	 */
	public void play()
	{
		
		boolean gameOver = false;
		//while (!gameOver)
		//{
			System.out.println(new Board());
			//Car.selectCar(int ligne, int colonne)
			//Voiture.deplacer(int ligne, int colonne)
	//	}
	}
}
