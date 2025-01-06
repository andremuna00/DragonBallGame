package com.game.tile;

import java.awt.Graphics;
import com.game.Game;
import com.game.Handler;
import com.game.Id;

public class Wall extends Tile//sottoclasse dei blocchi
{

	public Wall(int x, int y, int width, int height, boolean solid, Id id, Handler handler) //costruttore ereditato
	{
		super(x, y, width, height, solid, id, handler);
	}

	@Override
	public void render(Graphics g)
	{
		g.drawImage(Game.wall.getBufferedImage(), x, y, width,height,null);
	}

	@Override
	public void tick() 
	{
		
	}

}
