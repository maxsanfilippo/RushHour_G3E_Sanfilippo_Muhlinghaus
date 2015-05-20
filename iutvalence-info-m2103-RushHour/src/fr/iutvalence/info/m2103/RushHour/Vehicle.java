package fr.iutvalence.info.m2103.RushHour;

import java.util.*;

public class Vehicle 
{
	protected List<PieceOfVehicle> pieceList;
	

	private boolean horizontalMovement;
	
	public Vehicle(boolean horizontalMovement)
	{
		this.horizontalMovement = horizontalMovement;
		this.pieceList = new ArrayList<PieceOfVehicle>();
	}
	
	public List<PieceOfVehicle> getPieceList() 
	{
		return pieceList;
	}
	
	public void go(boolean forwardMovement)
	{
		for (Iterator<PieceOfVehicle> iterator = pieceList.iterator(); iterator.hasNext();) 
			//parcours de la liste avec iterator
		{
			PieceOfVehicle pieceOfVehicle = (PieceOfVehicle) iterator.next();
			pieceOfVehicle.move(forwardMovement, this.horizontalMovement);
			// on d�place le v�hicule en d�placant ses pi�ces
		}
	}

}
