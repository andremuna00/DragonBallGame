package com.game.entity.powerup;

import java.awt.Graphics;

import com.game.Game;
import com.game.Handler;
import com.game.Id;
import com.game.entity.Entity;

public class DragonBalls extends Entity
{

	
	int n = (int)(Math.random()*6);
	
	public DragonBalls(int x, int y, int width, int height, Id id, Handler handler) {
		super(x, y, width, height,  id, handler);
	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(Game.dragonBalls[n].getBufferedImage(), x, y, width, height, null);
		
	}

	@Override
	public void tick() {
		
	}

}
