//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(50, 50, 5);
	}

	public Ammo(int x, int y)
	{
		//add code
		this(x, y, 5);
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		super(x, y);
		speed = s;
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		//add code to draw the ammo
		window.setColor(Color.yellow);
		window.fillRect(getX(), getY(), 10, 10);
	}
	
	
	public void move( String direction )
	{
		//add code to draw the ammo
		if(direction.equals("LEFT"))
		{
			setX(getX() - speed);
		}
		
		else if(direction.equals("RIGHT"))
		{
			setX(getX() + speed);
		}
		
		else if(direction.equals("UP"))
		{
			setY(getY() - speed);
		}
		
		else if(direction.equals("DOWN"))
		{
			setY(getY() + speed);
		}
	}

	public String toString()
	{
		return super.toString() + " " + getSpeed();
	}
}
