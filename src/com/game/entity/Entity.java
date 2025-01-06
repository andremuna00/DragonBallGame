package com.game.entity;

import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.Game;
import com.game.Handler;
import com.game.Id;
import com.game.states.BossState;

public abstract class Entity {
		public int velX,velY;
		public int x,y;
		public int width,height;
		public int hp;
		
		public int facing=0;
		public boolean animate=false;
		public boolean jumping=false;
		public boolean falling=true;
		public double gravity= 0.0;
		
		public int phaseTime;
		public boolean attackable=false;
		public BossState bossState;

		public Id id;
		public Handler handler;
		
		public Entity(int x,int y,int width,int height, Id id,Handler handler)
		{
			this.x=x;
			this.y=y;
			this.width=width;
			this.height=height;
			this.id=id;
			this.handler=handler;
		}
		
		
		public abstract void render(Graphics g);
		
		public abstract void tick();

		public void die()
		{
			if(this.getId()==Id.player)
			{
				
				Game.lives--;
				Game.ShowDeathScreen=true;
				Game.dragonballs=Game.checkpoint;
			
				if(Game.lives<=0)
				{
					Game.GameOver=true;
				}
			}
			handler.removeEntity(this);
			
			
		}
		
		public int getX() {return x;}
		public void setX(int x) {this.x = x;}
		public int getY() {return y;}
		public void setY(int y) {this.y = y;}
		public int getVelX() {return velX;}
		public void setVelX(int velX) {this.velX = velX;}
		public int getVelY() {return velY;}
		public void setVelY(int velY) {this.velY = velY;}
		public int getWidth() {return width;}
		public void setWidth(int width) {this.width = width;}
		public int getHeight() {return height;}
		public void setHeight(int height) {this.height = height;}
		 
			
		public int getFacing(){return facing;}
		public void setFacing(int facing) {this.facing = facing;}

		public Id getId() {return id;}
		
		
		public Rectangle getBounds(){return new Rectangle(x+5,y+5,width-5,height-5);}
		public Rectangle getBoundsTop(){return new Rectangle(getX()+10,getY(),width-20,5);}
		public Rectangle getBoundsBottom(){return new Rectangle(getX()+10,getY()+height-5,width-20,5);}
		public Rectangle getBoundsLeft(){return new Rectangle(getX(),getY()+10,5,height-20);}
		public Rectangle getBoundsRight(){return new Rectangle(getX()+width-5,getY()+10,5,height-20);}
		
}
