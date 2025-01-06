package com.game.gfx.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.game.Game;

public class Launcher {
	
	public Button[] button;
	
	public Launcher()
	{
		
		button=new Button[4];
		button[0]=new Button(200,150,200,70,"Inizia il gioco");
		button[1]=new Button(200,350,200,70,"Esci dal gioco");
		button[2]=new Button(200+80,250,200,70,"Livelli");
		button[3]=new Button(0+80,250,200,70,"Help");
	}
	public void render(Graphics g) 
	{
		g.drawImage(Game.Titolo.getBufferedImage(),0,0,Game.WIDTH*Game.SCALE,Game.HEIGHT*Game.SCALE,null);
		g.setColor(Color.white);
		g.setFont(new Font("Century Gothic",Font.BOLD,75));
		g.drawString("Muna's Game", 20, 120);
		
		
		for(int i=0;i<button.length;i++)
		{
			button[i].render(g);
		}
	}
}
