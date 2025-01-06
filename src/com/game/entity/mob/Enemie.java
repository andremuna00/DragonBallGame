package com.game.entity.mob;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import com.game.Game;
import com.game.Handler;
import com.game.Id;
import com.game.entity.Entity;
import com.game.tile.Tile;

public class Enemie extends Entity 
{

	int frame=0;
	int frameDelay=0;
	int hp_initial;
	String type;
	
	Random random=new Random();

	public Enemie(int x, int y, int width, int height, Id id, Handler handler,int hp,String type) 
	{
		super(x, y, width, height, id, handler);
		int dir=random.nextInt(2);
		this.hp_initial=hp;
		this.type=type;
		this.hp=hp;
		switch(dir)
		{
		case 0:
			setVelX(2);
			setFacing(1);
			break;
		case 1:
			setVelX(-2);
			setFacing(0);
			break;
		}
	}


	@Override
	public void render(Graphics g) 
	{
		if(type=="Majin")
		{
			if(this.getFacing()==0)
			g.drawImage(Game.majin[frame+5].getBufferedImage(), x, y,width,height,null);
			if(this.getFacing()==1)
			g.drawImage(Game.majin[frame].getBufferedImage(), x, y,width,height,null);
		}
		if(type=="Ginyu")
		{
			if(this.getFacing()==0)
			g.drawImage(Game.ginyu[frame+4].getBufferedImage(), x, y,width,height,null);
			if(this.getFacing()==1)
			g.drawImage(Game.ginyu[frame].getBufferedImage(), x, y,width,height,null);
		}
			
			g.setColor(Color.black);
			g.drawRect(this.getX()+10, this.getY()-5, hp_initial, 3);
			g.setColor(Color.red);
			g.fillRect(this.getX()+10, this.getY()-5, hp, 3);
	}

	@Override
	public void tick() 
	{
		x+=getVelX();
		y+=getVelY();
		
		
		for(Tile ti:handler.tile)
		{
			if(!ti.solid) break;
			
			if(ti.getId()==Id.wall||ti.getId()==Id.fire)	
			{
				if(getBoundsBottom().intersects(ti.getBounds()))
				{
					setVelY(0);
					if(falling) falling=false;
					
				}
				else
				{
					if(!falling&&!jumping) 
					{	
						gravity=0.5;
						falling=true;
					}
				}
				if(getBoundsLeft().intersects(ti.getBounds()))
				{
					setVelX(2);
					setFacing(1);
				}
				if(getBoundsRight().intersects(ti.getBounds()))
				{
					setVelX(-2);
					setFacing(0);
				}
			}
		}
		
		if(falling)
		{
			gravity+=0.1;
			setVelY((int)+gravity);
		}
		
		if(getVelX()!=0)
		{
			frameDelay++;
			if(frameDelay>=5)
			{
				frame++;
				if(type=="Majin")
					if(frame>=5)frame=0;
				if(type=="Ginyu")
					if(frame>=4)frame=0;
				frameDelay=0;
			}
		}

	}

}
