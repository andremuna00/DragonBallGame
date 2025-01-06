package com.game.gfx.gui;

import java.awt.Color;
import java.awt.Graphics;

import com.game.Game;
import com.game.gfx.Sprite;

public class Levels 
{
	public Button[] button;
	Sprite livello1 ;
	Sprite livello2 ;
	Sprite livello0;
	
	public Levels()
	{
		livello0= new Sprite("/Livello/livello_bloccato.jpg");
		button=new Button[7];
		livello1= new Sprite("/Livello/livello1.png");
		button[0]=new Button(100,100,160,90,"livello 1");
		livello2= new Sprite("/Livello/livello2.png");
		button[1]=new Button(300,100,160,90,"livello 2");
		button[2]=new Button(500,100,160,90,"livello 3");
		button[3]=new Button(100,200,160,90,"livello 4");
		button[4]=new Button(300,200,160,90,"livello 5");
		button[5]=new Button(500,200,160,90,"livello 6");
		button[6]=new Button(50,350,160,90,"back");
	}
	
	public void render(Graphics g) 
	{
		
		g.setColor(Color.black);
		g.fillRect(0, 0, Game.GetFrameWidth(), Game.GetFrameHeight());
		for(int i=0;i<button.length;i++)
		{
			button[i].render(g);
		}
		g.drawImage(livello1.getBufferedImage(), 100, 100, 160,90,null);
		
		if(Game.livello2) g.drawImage(livello2.getBufferedImage(), 300, 100, 160,90,null);
		else g.drawImage(livello0.getBufferedImage(), 300, 100, 160,90,null);
		
		if(Game.livello3);
		else g.drawImage(livello0.getBufferedImage(), 500, 100, 160,90,null);
		
		if(Game.livello4);
		else g.drawImage(livello0.getBufferedImage(), 100, 200, 160,90,null);
		
		if(Game.livello5);
		else g.drawImage(livello0.getBufferedImage(), 300, 200, 160,90,null);
		
		if(Game.livello6);
		else g.drawImage(livello0.getBufferedImage(), 500, 200, 160,90,null);				
		
	}
}
