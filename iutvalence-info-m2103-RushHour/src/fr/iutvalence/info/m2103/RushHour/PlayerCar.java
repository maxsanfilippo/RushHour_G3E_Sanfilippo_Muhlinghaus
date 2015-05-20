package fr.iutvalence.info.m2103.RushHour;

public class PlayerCar extends Vehicle {

	private static final String CAR_FRONT = "P";
	private static final String CAR_REAR = "p";

	public PlayerCar(boolean horizontalMovement, Position frontPosition) 
	{
		super(horizontalMovement);
		this.pieceList.add(new PieceOfVehicle(frontPosition, CAR_FRONT));
		this.pieceList.add(new PieceOfVehicle(new Position(frontPosition, horizontalMovement, 1), CAR_REAR));
	}
}