package fr.iutvalence.info.m2103.RushHour;

public class PieceOfVehicle {

	private Position position;
	private String appearance;

	public PieceOfVehicle(Position position, String appearance)
	{
		this.position = position;
		this.appearance = appearance;
	}
	
	public void move(boolean forwardMovement, boolean horizontalMovement) 
	{
		if(horizontalMovement)
		{
			if(forwardMovement)
				position.setX(position.getX()+1);
			else
				position.setX(position.getX()-1);
		}
		else
		{
			if(forwardMovement)
				position.setY(position.getY()+1);
			else
				position.setY(position.getY()-1);
		}
		
	}

	public Position getPosition()
	{
		return this.position;
	}

	@Override
	public String toString() {
		return this.appearance;
	}
}
