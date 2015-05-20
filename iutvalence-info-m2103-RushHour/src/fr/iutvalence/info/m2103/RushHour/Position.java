package fr.iutvalence.info.m2103.RushHour;


/**
 * the position of vehicle
 * @author sanfilma muhlinge
 */
public class Position 
{
	private int x;
	private int y;
	
	public Position(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
	
	/**
	 * create a new position in function of an other position
	 * @param frontPosition the position of the head of a vehicle
	 * @param offsetIsHorizontal the direction of the new position
	 * @param offset the space between the new and the old position
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
	
	public boolean equals (Object obj)
	{
        if (obj!= null && (obj.getClass().equals(this.getClass())))
        {
            if (obj instanceof Position)
            {
                Position thePosition = (Position)obj;
                return (this.x == thePosition.getX() &&
                    this.y == thePosition.getY());
            }    
            return false;
        }
        return false;
    }
	
	public int hashcode()
	{
		int x;
		x = this.x+this.y;
		return x;
		
	}
}
