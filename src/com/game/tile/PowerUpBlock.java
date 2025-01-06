package com.game.tile;

import java.awt.Graphics;

import com.game.Game;
import com.game.Handler;
import com.game.Id;
import com.game.entity.powerup.DragonBalls;
import com.game.gfx.Sprite;

public class PowerUpBlock extends Tile
{

	private Sprite powerUp;
	private boolean poppedUp=false;
	private int SpriteY = getY();
	
	public PowerUpBlock(int x, int y, int width, int height, boolean solid, Id id, Handler handler, Sprite powerUp) //costruttore ereditato
	{
		super(x, y, width, height, solid, id, handler);
		this.powerUp=powerUp;
	}

	@Override
	public void render(Graphics g)
	{
		if(!poppedUp) g.drawImage(powerUp.getBufferedImage(),x,SpriteY, width,height,null);
		if(!activated) g.drawImage(Game.PowerUpBlock.getBufferedImage(), x, y, width,height,null);
		else g.drawImage(Game.UsedPowerUpBlock.getBufferedImage(), x, y, width,height,null);
	}

	@Override
	public void tick() 
	{
		if(activated&&!poppedUp)
		{
			SpriteY--;
			if(SpriteY==y-height)
			{
				handler.addEntity(new DragonBalls(x,SpriteY,width,height,Id.dragonball,handler));
				poppedUp=true;
			}
		}
		
	}

}
