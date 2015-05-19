package fr.iutvalence.info.m2103.RushHour;

import java.util.*;

public class Vehicle 
{
	private List<PieceOfVehicle> pieceList;
	
	public List<PieceOfVehicle> getPieceList() {
		return pieceList;
	}
	private boolean horizontalMovement;
	
	public Vehicle(boolean horizontalMovement)
	{
		this.horizontalMovement = horizontalMovement;
		this.pieceList = new ArrayList<PieceOfVehicle>();
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
