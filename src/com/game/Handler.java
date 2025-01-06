package com.game;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.LinkedList;

import com.game.entity.Entity;
import com.game.entity.Fire;
import com.game.entity.mob.Boss;
import com.game.entity.mob.Enemie;
import com.game.entity.mob.Player;
import com.game.entity.powerup.DragonBalls;
import com.game.tile.PowerUpBlock;
import com.game.tile.Tile;
import com.game.tile.Wall;

public class Handler 
{

	public LinkedList<Entity> entity = new LinkedList<Entity>();
	public LinkedList<Tile> tile = new LinkedList<Tile>();
	public static Player player;
	
	public void render(Graphics g)
	{
		for(int i=0;i<entity.size();i++)
		{
			Entity en = entity.get(i);
			if(Game.getVisibleArea()!=null&&en.getBounds().intersects(Game.getVisibleArea())) en.render(g);
		}
		
		for(Tile ti:tile)
		{
			if(Game.getVisibleArea()!=null&&ti.getBounds().intersects(Game.getVisibleArea())) ti.render(g);
		}
		if(Game.Playing)
		g.drawImage(Game.dragonBalls[0].getBufferedImage(), Game.getVisibleArea().x+20, Game.getVisibleArea().y+20, 50,50,null);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Courier",Font.BOLD,20));
		if(Game.Playing)
		g.drawString("x"+Game.dragonballs, Game.getVisibleArea().x+70, Game.getVisibleArea().y+50+20-5);
	}
	
	public void tick()
	{
		for(int i=0;i<entity.size();i++)
		{
			Entity en = entity.get(i);
			if(en.getId()==Id.boss)
			{
			if(Game.getVisibleArea()!=null&&en.getBounds().intersects(Game.getVisibleArea()))en.tick();
			}
			else en.tick();
		}
		
		for(Tile ti:tile)
		{
			if(Game.getVisibleArea()!=null&&ti.getBounds().intersects(Game.getVisibleArea()))ti.tick();
		}
	}
	
	public void addEntity(Entity en)
	{
		entity.add(en);
	}
	
	public void removeEntity(Entity en)
	{
		entity.remove(en);
	}
	
	public void addTile(Tile ti)
	{
		tile.add(ti);
	}
	
	public void removeTile(Tile ti)
	{
		tile.remove(ti);
	}
	
	public void createLevel(BufferedImage level)
	{
		int width=level.getWidth();
		int height=level.getHeight();
		for(int y=0;y<height;y++)
		{
			for(int x=0;x<width;x++)
			{
				int pixel=level.getRGB(x, y);
				
				int red = (pixel >> 16) & 0xff;
				int green = (pixel >> 8) & 0xff;
				int blue = (pixel ) & 0xff;
				
				if(red==0&&green==0&&blue==0) addTile(new Wall(x*32,y*32,32,32,true,Id.wall,this));//nero
				if(red==0&&green==255&&blue==0) addTile(new PowerUpBlock(x*32,y*32,32,32,true,Id.powerUp,this,Game.dragonBalls[0]));//verde
				if(red==0&&green==0&&blue==255) addEntity(player=new Player(x*32,y*32,48,64,Id.player,this));//blu
				if(red==255&&green==0&&blue==0) addTile(new Fire(x*32,y*32,32,32,true,Id.fire,this));//rosso
				if(red==255&&green==255&&blue==0) addEntity(new DragonBalls(x*32,y*32,32,32,Id.dragonball,this));//giallo
				if(red==255&&green==0&&blue==255) addEntity(new Enemie(x*32,y*32,42,90,Id.enemie,this,50,"Majin"));//viola
				if(red==0&&green==255&&blue==255) addEntity(new Boss(x*32,y*32,35,58,Id.boss,this,50));//azzurro
				if(red==128&&green==128&&blue==128) addEntity(new Enemie(x*32,y*32,32,64,Id.enemie,this,20,"Ginyu"));//grigio
			}
		}
	}
	
	public void ClearLevel()
	{
		entity.clear();
		tile.clear();
	}

}
