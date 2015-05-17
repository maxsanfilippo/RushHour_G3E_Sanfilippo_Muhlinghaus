package fr.iutvalence.info.m2103.RushHour;

import java.util.ArrayList;
import java.util.List;


/**
 * This class represents a Rush Hour game : 
 * <a href="http://fr.wikipedia.org/wiki/Rush_hour_%28casse-t%C3%AAte%29"> RushHour rules <a/>
 * The goal is to exit the red car of the board. There is other cars and trucks placed to. The player can move all
 * of these vehicles in the right direction.
 * @author sanfilma muhlinge
 */
public class RushHourGame
{
	public final static int BOARD_WIDTH = 6;
	public final static int BOARD_HEIGTH = 6;
	
	private List<Vehicle> vehicles;
	private Vehicle playerVehicle;
	
	public RushHourGame()
	{
		this.vehicles = new ArrayList<Vehicle>();
	}
	
	public boolean init()
	{
		vehicles.add(new PlayerCar(true, new Position(4,2)));
		return true;
	}
	
	/**
	 * Algorithm of the game development
	 */
	public void play()
	{
		while(true) {
			//TO DO : déplacement
			
			this.updateDisplay();
		}
	}

	private void updateDisplay() {
		String[] affichage = new String[BOARD_HEIGTH];
		// board
	}
}
