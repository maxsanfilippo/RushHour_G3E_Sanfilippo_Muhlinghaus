package fr.iutvalence.info.m2103.RushHour;


public class Position {
	private int x;
	private int y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * créer une pos à partir d'une autre en fonction un sens(le bool) et d'un decalage(offset, l'int)
	 * @param frontPosition
	 * @param offsetIsHorizontal
	 * @param offset
	 * Front position : position de la piece de tête du véhicule. A partir de ça et de l'orientation détermine la position des autre pièces. De fait, les véhicules verticaux auront tous la tête du même côté et pareil pour les horizontaux.
	 */
	public Position(Position frontPosition, boolean offsetIsHorizontal, int offset) 
	{
		this.x = frontPosition.getX();
		this.y = frontPosition.getY();
		
		if(offsetIsHorizontal)
			this.x += offset;
		else	
			this.y += offset;
	}
	
	public int getX() 
	{
		return x;
	}
	
	public void setX(int x) 
	{
		this.x = x;
	}
	
	public int getY() 
	{
		return y;
	}
	
	public void setY(int y) 
	{
		this.y = y;
	}
}
