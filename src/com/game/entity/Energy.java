package com.game.entity;

import java.awt.Graphics;
import com.game.Game;
import com.game.Handler;
import com.game.Id;
import com.game.states.BossState;
import com.game.tile.Tile;

public class Energy extends Entity
{
	
	int wait=0;

	public Energy(int x, int y, int width, int height, Id id, Handler handler) 
	{
		super(x, y, width, height, id, handler);
	}

	public void render(Graphics g) 
	{	
		if(Handler.player.getFacing()==0)
			g.drawImage(Game.energy[1].getBufferedImage(), x, y, width,height,null);

		if(Handler.player.getFacing()==1)
			g.drawImage(Game.energy[0].getBufferedImage(), x, y, width,height,null);
	}

	@Override
	public void tick() 
	{	
		x+=velX;
		y+=velY;
		
		if(falling)
		{
			gravity+=0.1;
			setVelY((int)+gravity);
		}
		
		for(Tile ti:handler.tile)
		{
			if(getBounds().intersects(ti.getBounds()))
			{
				setVelY(0);
				die();
			}
		}
		
		for(int i=0;i<handler.entity.size();i++)
		{
			Entity e= handler.entity.get(i);
			if(e.getId()==Id.enemie||e.getId()==Id.boss)
			{
				if(getBounds().intersects(e.getBounds()))
				{	
					if(e.getId()==Id.enemie) 
					{
						if(wait==0)
						{
							e.hp-=Game.damage;
							wait++;
						}
						if(e.hp<=0) e.die();
						die();
						wait=0;
					}
					else if(e.attackable) 
					{
						e.hp-=Game.damage;
					
						e.falling=true;
						e.gravity=3.0;
						e.bossState=BossState.RECOVERING;
						e.attackable=false;
						e.phaseTime=0;
					
						e.jumping=false;
						e.falling=true;
						e.gravity=3.5;
						die();
					}
					
				}
			}
		}
	}

}
