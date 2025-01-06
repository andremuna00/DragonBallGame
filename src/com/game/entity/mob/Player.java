package com.game.entity.mob;

import java.awt.Graphics;
import com.game.Game;
import com.game.Handler;
import com.game.Id;
import com.game.entity.Entity;
import com.game.input.Trasformation;
import com.game.states.PlayerStates;
import com.game.tile.Tile;

public class Player extends Entity 
{
	public PlayerStates state;
	
	private int frame=0;
	private int frameDelay=0;
	public static Trasformation trasform=null;
	
	public Player(int x, int y, int width, int height, Id id, Handler handler)
	{
		super(x, y, width, height, id, handler);
		state = PlayerStates.ALIVE;
	}
		
	@Override
	public void render(Graphics g)
	{
		
		if(this.getFacing()==0)
			g.drawImage(Game.player[frame+3].getBufferedImage(), x, y,width,height,null);
		if(this.getFacing()==1)
			g.drawImage(Game.player[frame].getBufferedImage(), x, y,width,height,null);
		
	}

	@Override
	public void tick()
	{
		x+=getVelX();
		y+=getVelY();
		
		trasform=new Trasformation();
		
		if(getVelX()!=0) animate=true;
		else animate=false;
		
		
		for(Tile ti:handler.tile)
		{
			
			if(!ti.solid) break;
			
			if(getBoundsTop().intersects(ti.getBounds()))
			{
				setVelY(0);
				if(jumping)
				{
					jumping = false;
					gravity=0.6;
					falling=true;
				}
				if(ti.getId()==Id.powerUp)
				{
					if(getBoundsTop().intersects(ti.getBounds()))
					{
						ti.activated=true;
					}
				}
			}
			if(getBoundsBottom().intersects(ti.getBounds()))
			{
				setVelY(0);
				if(falling) falling=false;
				if(ti.getId()!=Id.fire)
				y=ti.getY()-getHeight();
			}
			else
			{
				if(!falling&&!jumping) 
				{	
					gravity=0.6;
					falling=true;
				}
			}
			if(getBoundsLeft().intersects(ti.getBounds()))
			{
				setVelX(0);
				x=ti.getX()+ti.width;
			}
			if(getBoundsRight().intersects(ti.getBounds()))
			{
				setVelX(0);
				x=ti.getX()-width;
			}
		}
		
		
		for(int i=0;i<handler.entity.size();i++)
		{
			Entity e= handler.entity.get(i);
			if(e.getId()==Id.dragonball)
			{
				if(getBounds().intersects(e.getBounds()))
				{
					Game.coin.Play();
					Game.dragonballs++;
					
					
					e.die();
					
				}
			}
			
			if(e.getId()==Id.enemie||e.getId()==Id.boss)
			{
				if(getBounds().intersects(e.getBounds()))
				{
					die();
					Game.morto=true;
					Game.effect3.Stop(); 
					Game.effect.Stop();
					state = PlayerStates.DEAD;
				}
			}
		}
		
		if(jumping)
		{
			gravity-=0.15;
			setVelY((int)-gravity);
			
			if(gravity<=0.9)
			{
				jumping=false;
				falling=true;
			}
		}
		
		if(falling)
		{
			gravity+=0.15;
			setVelY((int)+gravity);
		}
		
		if(animate)
		{
			frameDelay++;
			if(frameDelay>=5)
			{
				frame++;
				if(frame>=3)
				{
					frame=0;
				}
				frameDelay=0;
			}
		}
		if(!animate) frame=0;
		
		for(Tile ti:handler.tile)
		{
			if(ti.getId()==Id.fire)
			{
				if(getBoundsBottom().intersects(ti.getBounds()))
				{
					die();
					Game.morto=true;
					Game.effect3.Stop(); 
					Game.effect.Stop();
					state= PlayerStates.DEAD;

				}
			}
		}

		
	}

}
