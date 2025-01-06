package com.game.gfx.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.game.Game;
import com.game.gfx.Sprite;

public class Help {
	public Button[] button;
	Sprite movimenti;
	Sprite sparo;
	Sprite s1;
	Sprite s3;
	Sprite s4;
	Sprite p1;
	Sprite p3;
	Sprite p4;
	
	public Help()
	{
		movimenti= new Sprite("/help/movimenti.png");
		sparo=new Sprite("/help/sparo.png");
		s1=new Sprite("/help/s1.jpg");
		s3=new Sprite("/help/s3.jpg");
		s4=new Sprite("/help/s4.jpg");
		p1= new Sprite("/GokuSuperSayan/goku2.3.png");
		p3= new Sprite("/GokuSuperSayan3/goku3.3.png");
		p4= new Sprite("/GokuSuperSayanGod/goku4.3.png");
		button=new Button[2];
		button[0]=new Button(50,350,160,90,"back");
		button[1]=new Button(600,350,160,90,"Azzera gioco");
	}
	
	public void render(Graphics g) 
	{
		g.setColor(Color.black);
		g.fillRect(0, 0, Game.GetFrameWidth(), Game.GetFrameHeight());
		g.drawImage(movimenti.getBufferedImage(), 50, 50, 200,100,null);
		g.setColor(Color.white);
		g.setFont(new Font("Century Gothic", Font.BOLD, 20));
		g.drawString("= Movimenti", 250, 100);
		
		g.drawImage(sparo.getBufferedImage(), 425, 60, 200,50,null);
		g.drawString("= ", 650, 100);
		g.drawImage(Game.energy[0].getBufferedImage(), 700, 65, 75,50,null);
		
		g.drawImage(Game.dragonBalls[0].getBufferedImage(), 50, 200, 50,50,null);
		g.drawString(">=7   +", 100, 200+35);
		g.drawImage(s1.getBufferedImage(), 170, 200, 50,50,null);
		g.drawString(" = ", 250, 200+35);
		g.drawImage(p1.getBufferedImage(), 280, 190, 48,64,null);
		
		g.drawImage(Game.dragonBalls[0].getBufferedImage(), 50+350, 200, 50,50,null);
		g.drawString(">=14   +", 100+350, 200+35);
		g.drawImage(s3.getBufferedImage(), 170+350+20, 200, 50,50,null);
		g.drawString(" = ", 250+350+20, 200+35);
		g.drawImage(p3.getBufferedImage(), 280+350+20, 190, 48,64,null);
		
		g.drawImage(Game.dragonBalls[0].getBufferedImage(), 50, 200+100, 50,50,null);
		g.drawString(">=28   +", 100, 200+35+100);
		g.drawImage(s4.getBufferedImage(), 170+20, 200+100, 50,50,null);
		g.drawString(" = ", 250+20, 200+35+100);
		g.drawImage(p4.getBufferedImage(), 280+20, 190+100, 48,64,null);
		
		for(int i=0;i<button.length;i++)
		{
			button[i].render(g);
		}			
		
	}

}
