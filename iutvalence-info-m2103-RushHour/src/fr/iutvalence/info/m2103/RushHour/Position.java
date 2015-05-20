package fr.iutvalence.info.m2103.RushHour;


public class Position {
	private int x;
	private int y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * cr�er une pos � partir d'une autre en fonction un sens(le bool) et d'un decalage(offset, l'int)
	 * @param frontPosition
	 * @param offsetIsHorizontal
	 * @param offset
	 * Front position : position de la piece de t�te du v�hicule. A partir de �a et de l'orientation d�termine la position des autre pi�ces. De fait, les v�hicules verticaux auront tous la t�te du m�me c�t� et pareil pour les horizontaux.
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
