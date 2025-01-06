package com.game.gfx.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import com.game.Game;

public class Button 
{
	public int x,y;
	public int width,height;
	
	public String label;

	public Button(int x, int y, int width, int height, String label) 
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.label = label;
	}
	
	public void render(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.setFont(new Font("Century Gothic", Font.ITALIC, 30));
		//g.drawRect(x, y, width, height);
		
		FontMetrics fm = g.getFontMetrics();
		int StringX=(getWidth()-fm.stringWidth(getLabel()))/2;
		int StringY=(fm.getAscent()+ (getHeight()-(fm.getAscent()+fm.getDescent()))/2);
		g.drawString(getLabel(), getX()+StringX, getY()+StringY);
	}
	
	public void TriggeredEvent()
	{
		if(!Game.schermata_livelli&&!Game.schermata_help)
		{
			if(getLabel().toLowerCase().contains("inizia il gioco")) {Game.Playing=true; Game.sigla.Stop();}
			else if(getLabel().toLowerCase().contains("esci dal gioco")) System.exit(0);
			else if(getLabel().toLowerCase().contains("livelli")) {Game.schermata_livelli=true;}
			else if(getLabel().toLowerCase().contains("help")) {Game.schermata_help=true;}
		}
		if(Game.schermata_livelli)
		{
			if(getLabel().toLowerCase().contains("back")){Game.schermata_livelli=false;}
			if(Game.livello1)if(getLabel().toLowerCase().contains("livello 1")){Game.level=0;Game.Playing=true;Game.sigla.Stop();}
			if(Game.livello2)if(getLabel().toLowerCase().contains("livello 2")){Game.level=1;Game.Playing=true;Game.sigla.Stop();}
		}
		if(Game.schermata_help)
		{
			if(getLabel().toLowerCase().contains("back")){Game.schermata_help=false;}
			if(getLabel().toLowerCase().contains("azzera gioco")){Game.Azzera();System.exit(0);}
		}
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	
	
}
