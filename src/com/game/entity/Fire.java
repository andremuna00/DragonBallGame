package com.game.entity;

import java.awt.Graphics;

import com.game.Game;
import com.game.Handler;
import com.game.Id;
import com.game.tile.Tile;

public class Fire  extends Tile
{

	int frame=0;
	int frameDelay=0;
	public Fire(int x, int y, int width, int height, boolean solid, Id id, Handler handler) 
	{
		super(x, y, width, height, solid, id, handler);
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Game.fire[frame].getBufferedImage(), x, y, width,height,null);
	}

	@Override
	public void tick() {
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
	
}
