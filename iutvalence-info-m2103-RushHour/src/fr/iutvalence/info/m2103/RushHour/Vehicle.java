package fr.iutvalence.info.m2103.RushHour;

import java.util.*;

/**
 * a vehicle
 * @author sanfilma muhlinge
 */
public class Vehicle 
{
	protected List<PieceOfVehicle> pieceList;
	

	private boolean horizontalMovement;
	
	/**
	 * create a new vehicle with its direction
	 * @param horizontalMovement horizontal or vertical movement
	 */
	public Vehicle(boolean horizontalMovement)
	{
		this.horizontalMovement = horizontalMovement;
		this.pieceList = new ArrayList<PieceOfVehicle>();
	}
	
	public List<PieceOfVehicle> getPieceList() 
	{
		return pieceList;
	}
	
	/**
	 * moves component of the vehicle
	 * @param forwardMovement forward movement or back movement
	 */
	public void go(boolean forwardMovement)
	{
		for (Iterator<PieceOfVehicle> iterator = pieceList.iterator(); iterator.hasNext();) 
		{
			PieceOfVehicle pieceOfVehicle = (PieceOfVehicle) iterator.next();
			pieceOfVehicle.move(forwardMovement, this.horizontalMovement);
		}
	}

}
