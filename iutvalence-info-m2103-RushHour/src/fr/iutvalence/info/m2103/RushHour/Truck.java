package fr.iutvalence.info.m2103.RushHour;


public class Truck extends Vehicle {

	private static final String TRUCK_FRONT = "T";
	private static final String TRUCK_MIDDLE = "t";
	private static final String TRUCK_REAR = "t";

	public Truck(boolean horizontalMovement, Position frontPosition) {
		super(horizontalMovement);
		
		this.pieceList.add(new PieceOfVehicle(frontPosition, TRUCK_FRONT));
		this.pieceList.add(new PieceOfVehicle(new Position(frontPosition, horizontalMovement, 1), TRUCK_MIDDLE));
		this.pieceList.add(new PieceOfVehicle(new Position(frontPosition, horizontalMovement, 2), TRUCK_REAR));
	}
}
