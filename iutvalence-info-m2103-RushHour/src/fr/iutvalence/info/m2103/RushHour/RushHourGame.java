package fr.iutvalence.info.m2103.RushHour;

import java.util.ArrayList;
import java.util.Iterator;
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
		vehicles.add(new PlayerCar(true, new Position(1,3)));
		return true;
	}
	
	/**
	 * Algorithm of the game development
	 */
	public void play()
	{
		this.init();
			
		this.updateDisplay();
	}

	private void updateDisplay() 
	{
		String[] affichage = new String[BOARD_HEIGTH];
		for(int line = 0; line<BOARD_WIDTH; line++)
			affichage[line] = "1 2 3 4 5 6";
		
	    for (Iterator<Vehicle> iterator = vehicles.iterator(); iterator.hasNext();)
        {
                Vehicle vehicle = (Vehicle) iterator.next();
                List<PieceOfVehicle> pieces = vehicle.getPieceList();
                for (Iterator<PieceOfVehicle> iterator2 = pieces.iterator(); iterator2.hasNext();)
                {
                        PieceOfVehicle piece = (PieceOfVehicle) iterator2.next();
                        
                        affichage[piece.getPosition().getY()-1] = affichage[piece.getPosition().getY()-1].replace(Integer.toString(piece.getPosition().getX()).charAt(0), piece.toString().charAt(0));
                }
        }
		
		for(int line = 0; line<BOARD_WIDTH; line++)
		{
			affichage[line] = affichage[line].replace('1', '0');
			affichage[line] = affichage[line].replace('2', '0');
			affichage[line] = affichage[line].replace('3', '0');
			affichage[line] = affichage[line].replace('4', '0');
			affichage[line] = affichage[line].replace('5', '0');
			affichage[line] = affichage[line].replace('6', '0');

		}
		
		for(int line = 0; line<BOARD_WIDTH; line++)
			System.out.println(affichage[line]);
		
	}

	
}
