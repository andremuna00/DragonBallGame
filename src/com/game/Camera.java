package com.game;

import com.game.entity.Entity;

public class Camera {

	public int x;
	public int y;
	
	public void tick(Entity player)
	{
		setX(-player.getX()+Game.GetFrameWidth()/2);
		setY(-player.getY()+Game.GetFrameHeight()/2);
	}
	
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	
}
