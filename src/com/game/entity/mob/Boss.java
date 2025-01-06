package com.game.entity.mob;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import com.game.Game;
import com.game.Handler;
import com.game.Id;
import com.game.entity.Entity;
import com.game.states.BossState;
import com.game.tile.Tile;

public class Boss extends Entity {
	
	public int jumpTime=0;
	public int frame=0;
	public int frameDelay=0;
	public int hp_initial=0;
	
	public boolean addJumpTime=false;
	
	Random random;

	public Boss(int x, int y, int width, int height, Id id, Handler handler,int hp) 
	{
		super(x, y, width, height, id, handler);
		this.hp=hp;
		this.hp_initial=hp;
		bossState= BossState.IDLE;
		random=new Random();
	}

	public void render(Graphics g) 
	{
		if(this.getFacing()==0)
			g.drawImage(Game.freezer[frame+4].getBufferedImage(), x, y,width,height,null);
		if(this.getFacing()==1)
			g.drawImage(Game.freezer[frame].getBufferedImage(), x, y,width,height,null);
			
		g.setColor(Color.black);
		g.drawRect(this.getX(), this.getY()-5, hp_initial, 3);
		g.setColor(Color.red);
		g.fillRect(this.getX(), this.getY()-5, hp, 3);
	}

	public void tick() 
	{
		x+=getVelX();
		y+=getVelY();
		
		if(hp<=0) 
		{
			die();
			Game.SwitchLevel();
		}
		
		phaseTime++;
		
		if(bossState==BossState.IDLE||bossState==BossState.RECOVERING)
		{
			setVelX(0);
			setVelY(0);
		}
		
		if((phaseTime>=180&&bossState==BossState.IDLE)||(phaseTime>=600&&bossState!=BossState.SPINNING)) ChooseState();
		
		if(bossState==BossState.RECOVERING&&phaseTime>=180)
		{
			bossState=BossState.SPINNING;
			phaseTime=0;
		}
		
		if(phaseTime>=360&&bossState==BossState.SPINNING)
		{
			phaseTime=0;
			bossState=BossState.IDLE;
		}
		
		if(bossState==BossState.JUMPING||bossState==BossState.RUNNING) attackable=true;
		else attackable=false;
		
		if(bossState!=BossState.JUMPING)
		{
			addJumpTime=false;
			jumpTime=0;
			falling=true;
		}
		
		if(addJumpTime)
		{
			jumpTime++;
			if(jumpTime>=30)
			{
				addJumpTime=false;
				jumpTime=0;
			}
		}
		
		if(!jumping&&!falling)
		{
			jumping=true;
			gravity=8.0;
		}
		
		for(Tile ti:handler.tile)
		{
			if(!ti.solid) break;
			
			if(getBoundsTop().intersects(ti.getBounds()))
			{
				setVelY(0);
				if(jumping)
				{
					jumping = false;
					gravity=0.5;
					falling=true;
				}
					
			}
			if(getBoundsBottom().intersects(ti.getBounds()))
			{
				setVelY(0);
				if(falling) 
				{
					falling=false;
					addJumpTime=true;
				}
			}
			if(getBoundsLeft().intersects(ti.getBounds()))
			{
				setVelX(0);
				if(bossState==BossState.RUNNING) 
				{
					setVelX(4);
					facing=1;
				}
				x=ti.getX()+ti.width;
			}
			if(getBoundsRight().intersects(ti.getBounds()))
			{
				setVelX(0);
				if(bossState==BossState.RUNNING) 
				{
					setVelX(-4);
					facing=0;
				}
				x=ti.getX()-width;
			}
		}
		
		for(int i=0;i<handler.entity.size();i++)
		{
			Entity e= handler.entity.get(i);
			if(e.getId()==Id.player)
			{
				if(bossState==BossState.JUMPING)
				{
					if(jumping||falling)
					{
						if(getX()>=e.getX()-4&&getX()<=e.getX()+4) setVelX(0);
						else if(e.getX()<getX()) 
						{
							setVelX(-3);
							facing=0;
						}
						else if(e.getX()>getX()) 
						{
							setVelX(3);
							facing=1;
						}
					}
					else setVelX(0);
				}
				else if(bossState==BossState.SPINNING)
				{
					if(getX()>=e.getX()-4&&getX()<=e.getX()+4) setVelX(0);
					else if(e.getX()<getX()) 
					{
						setVelX(-3);
						facing=0;
					}
					else if(e.getX()>getX()) 
					{
						setVelX(3);
						facing=1;
					}
				}
			}

		}
		
		if(jumping)
		{
			gravity-=0.15;
			setVelY((int)-gravity);
			if(gravity<=0.6)
			{
				jumping=false;
				falling=true;
			}
		}
		
		if(falling)
		{
			gravity+=0.15;
			setVelY((int)gravity);
		}
		
		if(bossState==BossState.RUNNING||bossState==BossState.JUMPING)
		{
			frameDelay++;
			if(frameDelay>=5)
			{
				frame++;
				if(frame>=4)
				{
					frame=0;
				}
				frameDelay=0;
			}
		}
		if(bossState!=BossState.RUNNING&&bossState!=BossState.JUMPING)
			frame=0;
	}
	
	public void ChooseState()
	{
		int nextPhase = random.nextInt(2);
		
		if(nextPhase==0)
		{
			bossState=BossState.RUNNING;
			int dir=random.nextInt(2);
			if(dir==0) 
			{
				setVelX(4);
				facing=1;
			}
			else 
			{
				setVelX(-4);
				facing=0;
			}
			
		}
		else if(nextPhase==1)
		{
			bossState=BossState.JUMPING;
			jumping=true;
			gravity=8.0;
		}
		
		phaseTime=0;
	}

}
