package fr.iutvalence.info.m2103.RushHour;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


/**
 * This class represents a Rush Hour game : 
 * <a href="http://fr.wikipedia.org/wiki/Rush_hour_%28casse-t%C3%AAte%29"> RushHour rules <a/>
 * The goal is to exit the red car of the board. There is other cars and trucks placed to. The player can move all
 * of these vehicles in the right direction.
 * @author sanfilma muhlinge
 */
public class RushHourGame
{
	public final static int BOARD_HEIGHT = 6;
	public final static int BOARD_WIDTH = 6;
	
	private List<Vehicle> vehicles;
	
	private Scanner sc;
	
	public RushHourGame()
	{
		this.vehicles = new ArrayList<Vehicle>();
	}
	
	public boolean init()
	{
		vehicles.add(new PlayerCar(true, new Position(1,3)));
		vehicles.add(new Car(false, new Position(4,4)));
		vehicles.add(new Car(false, new Position(4,1)));
		vehicles.add(new Truck(false, new Position(6,4)));
		return true;
	}
	
	/**
	 * Algorithm of the game development
	 */
	public void play()
	{
		this.init();
		System.out.println("Si vous placez la voiture P sur la case (6,3) vous avez gagné.");
		while(true)
		{	
			this.updateDisplay();
			sc = new Scanner(System.in);
			System.out.println("Veuillez saisir une colonne :");
			int x = sc.nextInt();
			System.out.println("Veuillez saisir une ligne :");
			int y = sc.nextInt();
			System.out.println("Veuillez saisir un sens ( true = avancer vers le bas ou la droite) :");
			boolean sens = sc.nextBoolean();
			this.moving(new Position(x,y), sens);
			this.updateDisplay();
			
		}
		
	}
	
	/**
	 * from a starting position, selects the vehicle on it and move it
	 * @param startPosition the position of the vehicle we want to move
	 * @param forwardMovement forward or back movement
	 */
	public void moving(Position startPosition, boolean forwardMovement)
	{
	    for (Iterator<Vehicle> iterator = vehicles.iterator(); iterator.hasNext();)
	    {
	    	   Vehicle vehicle = (Vehicle) iterator.next();
               List<PieceOfVehicle> pieces = vehicle.getPieceList();
               for (Iterator<PieceOfVehicle> iterator2 = pieces.iterator(); iterator2.hasNext();)
               {
            	   PieceOfVehicle piece = (PieceOfVehicle) iterator2.next();
            	   if (piece.getPosition().equals(startPosition))
            	   {
            		   vehicle.go(forwardMovement);
            		   break;
            	   }
               }
	    }
	}
	
	/**
	 * displays the board with all the boxes with or not a vehicle on it 
	 */
	private void updateDisplay() 
	{
		String[] display = new String[BOARD_WIDTH];
		for(int line = 0; line<BOARD_HEIGHT; line++)
			display[line] = "1 2 3 4 5 6";
		
	    for (Iterator<Vehicle> iterator = vehicles.iterator(); iterator.hasNext();)
        {
                Vehicle vehicle = (Vehicle) iterator.next();
                List<PieceOfVehicle> pieces = vehicle.getPieceList();
                for (Iterator<PieceOfVehicle> iterator2 = pieces.iterator(); iterator2.hasNext();)
                {
                        PieceOfVehicle piece = (PieceOfVehicle) iterator2.next();
                        
                        display[piece.getPosition().getY()-1] = display[piece.getPosition().getY()-1].replace(Integer.toString(piece.getPosition().getX()).charAt(0), piece.toString().charAt(0));
                }
        }
		
		for(int line = 0; line<BOARD_HEIGHT; line++)
		{
			display[line] = display[line].replace('1', '0');
			display[line] = display[line].replace('2', '0');
			display[line] = display[line].replace('3', '0');
			display[line] = display[line].replace('4', '0');
			display[line] = display[line].replace('5', '0');
			display[line] = display[line].replace('6', '0');
		}
		

		
		for(int line = 0; line<BOARD_HEIGHT; line++)		
			System.out.println(display[line]);
		System.out.println('\n');
		
		
		
		
	}
	
	

	
}
