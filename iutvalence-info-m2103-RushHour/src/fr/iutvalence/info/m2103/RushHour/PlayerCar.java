package fr.iutvalence.info.m2103.RushHour;

public class PlayerCar extends Vehicle {

	private static final String CAR_FRONT = "P";
	private static final String CAR_REAR = "p";

	public PlayerCar(boolean horizontalMovement, Position frontPosition) {
		super(horizontalMovement);
	}
}