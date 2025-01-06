package com.game.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import com.game.Game;
import com.game.Handler;
import com.game.Id;
import com.game.entity.Energy;
import com.game.entity.Entity;
import com.game.gfx.Sprite;

public class KeyInput implements KeyListener
{
	private Energy energy=null;
	int i1=0;
	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		int key= e.getKeyCode();
		
		for(int i=0;i<Game.handler.entity.size();i++)
		{
			Entity en = Game.handler.entity.get(i);
			
			switch(key)
			{
				case KeyEvent.VK_W:
					if(!en.jumping&&en.id==Id.player)
					{
						Game.salto.Play();
						en.jumping=true;
						en.gravity=6.0;
					}
					break;
					
				case KeyEvent.VK_A:
					if(en.getId()==Id.player) 
					{
						if(Game.SuperSayanGod) en.setVelX(-10);
						if(Game.SuperSayan3) en.setVelX(-8);
						if(Game.SuperSayan) en.setVelX(-6);
						if(!Game.SuperSayan&&!Game.SuperSayan3&&!Game.SuperSayanGod) en.setVelX(-4);
						Handler.player.setFacing(0);
					}
					break;
					
				case KeyEvent.VK_D:
					if(en.getId()==Id.player)
					{
						if(Game.SuperSayanGod) en.setVelX(10);
						if(Game.SuperSayan3) en.setVelX(8);
						if(Game.SuperSayan) en.setVelX(6);
						if(!Game.SuperSayan&&!Game.SuperSayan3&&!Game.SuperSayanGod) en.setVelX(4);
						en.setFacing(1);
					}
					break;
				case KeyEvent.VK_RIGHT:
					if(en.getId()==Id.player)
					{
						if(Game.SuperSayanGod) en.setVelX(10);
						if(Game.SuperSayan3) en.setVelX(8);
						if(Game.SuperSayan) en.setVelX(6);
						if(!Game.SuperSayan&&!Game.SuperSayan3&&!Game.SuperSayanGod) en.setVelX(4);
						en.setFacing(1);
					}
					break;
				case KeyEvent.VK_LEFT:
					if(en.getId()==Id.player) 
					{
						if(Game.SuperSayanGod) en.setVelX(-10);
						if(Game.SuperSayan3) en.setVelX(-8);
						if(Game.SuperSayan) en.setVelX(-6);
						if(!Game.SuperSayan&&!Game.SuperSayan3&&!Game.SuperSayanGod) en.setVelX(-4);
						Handler.player.setFacing(0);
					}
					break;
				case KeyEvent.VK_UP:
					if(!en.jumping&&en.id==Id.player)
					{
						Game.salto.Play();
						en.jumping=true;
						en.gravity=6.0;
					}
					break;
					
				case KeyEvent.VK_1:
					if(Game.dragonballs>=7)  Trasformation.SuperSayan();
					break;
				case KeyEvent.VK_0:
					Trasformation.Normal();
					break;
				case KeyEvent.VK_3:
					if(Game.dragonballs>=14) Trasformation.SuperSayan3();
					break;
				case KeyEvent.VK_4:
					if(Game.dragonballs>=28) Trasformation.SuperSayanGod();
					break;
				case KeyEvent.VK_C:
					 Trasformation.SuperSayanGod();
					 Game.lives=100;
					 
					break;
				case KeyEvent.VK_ESCAPE:
					
					if(Game.Playing==true)
					{
						Game.Playing=false;
						Game.canzone.Stop();
						for(int j=0;j<Game.handler.entity.size();j++)
						{
							Entity ent = Game.handler.entity.get(j);
							if(ent.getId()==Id.player) ent.die();
						}
						Game.lives++;
						Game.Sigla=true;
					}
					break;
				case KeyEvent.VK_P:
					
					if(!Game.Pause&&Game.Playing&&i1==0)
					{
					Game.Pause=true;
					Game.Playing=false;
					System.out.println(i1);
					i1++;
					}
					if(Game.Pause&&!Game.Playing&&i1==0)
					{Game.Pause=false;
					Game.Playing=true;
					i1++;
					
					}
					break;
				case KeyEvent.VK_ENTER:
					
					Game.stop=true;
					break;
				
				default:
					break;
				
			}
		}
		switch(key)
		{
			case KeyEvent.VK_SPACE:
				if(Game.shoot==false)
				{
					Game.shoot=true;
					
					if(Handler.player.getFacing()==1&&!Game.SuperSayan&&!Game.SuperSayan3&&!Game.SuperSayanGod)
					{
						Game.player[0]=new Sprite("/Energy/gokuEnergy0.png");try {Thread.sleep(100);} catch (InterruptedException e1) {e1.printStackTrace();}
						Game.player[0]=new Sprite("/Energy/gokuEnergy1.png");try {Thread.sleep(100);} catch (InterruptedException e1) {e1.printStackTrace();}
						Game.player[0]=new Sprite("/Energy/gokuEnergy2.png");
						
						Game.handler.addEntity(energy=new Energy(Handler.player.getX()+32,Handler.player.getY()+20,36,20,Id.energy,Game.handler));
				
						Game.player[0]=new Sprite("/GokuNormale/goku1.png");
					}
					if(Handler.player.getFacing()==0&&!Game.SuperSayan&&!Game.SuperSayan3&&!Game.SuperSayanGod)
					{
						Game.player[3]=new Sprite("/Energy/gokuEnergy3.png");try {Thread.sleep(100);} catch (InterruptedException e1) {e1.printStackTrace();}
						Game.player[3]=new Sprite("/Energy/gokuEnergy4.png");try {Thread.sleep(100);} catch (InterruptedException e1) {e1.printStackTrace();}
						Game.player[3]=new Sprite("/Energy/gokuEnergy5.png");
		
						Game.handler.addEntity(energy=new Energy(Handler.player.getX(),Handler.player.getY()+20,36,20,Id.energy,Game.handler));
				
						Game.player[3]=new Sprite("/GokuNormale/goku1.3.png");
					}
					
					
					if(Handler.player.getFacing()==1&&Game.SuperSayan)
					{
						Game.player[0]=new Sprite("/Energy/gokuEnergy1.0.png");try {Thread.sleep(100);} catch (InterruptedException e1) {e1.printStackTrace();}
						Game.player[0]=new Sprite("/Energy/gokuEnergy1.1.png");try {Thread.sleep(100);} catch (InterruptedException e1) {e1.printStackTrace();}
						Game.player[0]=new Sprite("/Energy/gokuEnergy1.2.png");
				
						Game.handler.addEntity(energy=new Energy(Handler.player.getX()+32,Handler.player.getY()+20,36,20,Id.energy,Game.handler));
				
						Game.player[0]=new Sprite("/GokuSuperSayan/goku2.png");
					}
					if(Handler.player.getFacing()==0&&Game.SuperSayan)
					{
						Game.player[3]=new Sprite("/Energy/gokuEnergy1.3.png");try {Thread.sleep(100);} catch (InterruptedException e1) {e1.printStackTrace();}
						Game.player[3]=new Sprite("/Energy/gokuEnergy1.4.png");try {Thread.sleep(100);} catch (InterruptedException e1) {e1.printStackTrace();}
						Game.player[3]=new Sprite("/Energy/gokuEnergy1.5.png");
				
						Game.handler.addEntity(energy=new Energy(Handler.player.getX(),Handler.player.getY()+20,36,20,Id.energy,Game.handler));
				
						Game.player[3]=new Sprite("/GokuSuperSayan/goku2.3.png");
				
					}
					
					if(Handler.player.getFacing()==1&&Game.SuperSayan3)
					{
						Game.player[0]=new Sprite("/Energy/gokuEnergy1.0.png");try {Thread.sleep(100);} catch (InterruptedException e1) {e1.printStackTrace();}
						Game.player[0]=new Sprite("/Energy/gokuEnergy1.1.png");try {Thread.sleep(100);} catch (InterruptedException e1) {e1.printStackTrace();}
						Game.player[0]=new Sprite("/Energy/gokuEnergy1.2.png");
				
						Game.handler.addEntity(energy=new Energy(Handler.player.getX()+32,Handler.player.getY()+20,36,20,Id.energy,Game.handler));
				
						Game.player[0]=new Sprite("/GokuSuperSayan3/goku3.png");
					}
					if(Handler.player.getFacing()==0&&Game.SuperSayan3)
					{
						Game.player[3]=new Sprite("/Energy/gokuEnergy1.3.png");try {Thread.sleep(100);} catch (InterruptedException e1) {e1.printStackTrace();}
						Game.player[3]=new Sprite("/Energy/gokuEnergy1.4.png");try {Thread.sleep(100);} catch (InterruptedException e1) {e1.printStackTrace();}
						Game.player[3]=new Sprite("/Energy/gokuEnergy1.5.png");
				
						Game.handler.addEntity(energy=new Energy(Handler.player.getX(),Handler.player.getY()+20,36,20,Id.energy,Game.handler));
				
						Game.player[3]=new Sprite("/GokuSuperSayan3/goku3.3.png");
				
					}
					
					if(Handler.player.getFacing()==1&&Game.SuperSayanGod)
					{
						Game.player[0]=new Sprite("/Energy/gokuEnergy1.0.png");try {Thread.sleep(100);} catch (InterruptedException e1) {e1.printStackTrace();}
						Game.player[0]=new Sprite("/Energy/gokuEnergy1.1.png");try {Thread.sleep(100);} catch (InterruptedException e1) {e1.printStackTrace();}
						Game.player[0]=new Sprite("/Energy/gokuEnergy1.2.png");
				
						Game.handler.addEntity(energy=new Energy(Handler.player.getX()+32,Handler.player.getY()+20,36,20,Id.energy,Game.handler));
				
						Game.player[0]=new Sprite("/GokuSuperSayanGod/goku4.png");
					}
					if(Handler.player.getFacing()==0&&Game.SuperSayanGod)
					{
						Game.player[3]=new Sprite("/Energy/gokuEnergy1.3.png");try {Thread.sleep(100);} catch (InterruptedException e1) {e1.printStackTrace();}
						Game.player[3]=new Sprite("/Energy/gokuEnergy1.4.png");try {Thread.sleep(100);} catch (InterruptedException e1) {e1.printStackTrace();}
						Game.player[3]=new Sprite("/Energy/gokuEnergy1.5.png");
				
						Game.handler.addEntity(energy=new Energy(Handler.player.getX(),Handler.player.getY()+20,36,20,Id.energy,Game.handler));
				
						Game.player[3]=new Sprite("/GokuSuperSayanGod/goku4.3.png");
				
					}
					
					if(Handler.player.getFacing()==0) energy.setVelX(-5);
					if(Handler.player.getFacing()==1) energy.setVelX(5);
				}
				break;
			default:
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		int key= e.getKeyCode();
		for(int i=0;i<Game.handler.entity.size();i++)
		{
			Entity en = Game.handler.entity.get(i);
			
			switch(key)
			{
				case KeyEvent.VK_A:
					if(en.getId()==Id.player)
					en.setVelX(0);
					break;
				case KeyEvent.VK_D:
					if(en.getId()==Id.player)
					en.setVelX(0);
					break;
				case KeyEvent.VK_LEFT:
					if(en.getId()==Id.player)
					en.setVelX(0);
					break;
				case KeyEvent.VK_RIGHT:
					if(en.getId()==Id.player)
					en.setVelX(0);
				case KeyEvent.VK_P:
					i1=0;
				default:
					break;
				
			}
		}
		switch(key)
		{
			case KeyEvent.VK_SPACE:
					if(Handler.player.getFacing()==0)
					energy.setVelX(-5);
					if(Handler.player.getFacing()==1)
					energy.setVelX(5);
				break;
			default:
				break;
		}
	}

}
