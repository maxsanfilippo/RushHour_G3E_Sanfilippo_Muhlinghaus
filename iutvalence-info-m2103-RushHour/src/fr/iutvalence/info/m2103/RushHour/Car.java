package fr.iutvalence.info.m2103.RushHour;


/**
 * a car
 * @author sanfilma
 */
public class Car extends Vehicle {

	private static final String CAR_FRONT = "C";
	private static final String CAR_REAR = "c";

	public Car(boolean horizontalMovement, Position frontPosition) 
	{
		super(horizontalMovement);
		this.pieceList.add(new PieceOfVehicle(frontPosition, CAR_FRONT));
		this.pieceList.add(new PieceOfVehicle(new Position(frontPosition, horizontalMovement, 1), CAR_REAR));
	}
}
