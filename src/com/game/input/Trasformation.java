package com.game.input;

import com.game.Game;
import com.game.Id;
import com.game.entity.Entity;
import com.game.gfx.Sprite;

public class Trasformation {

	public static void SuperSayan()
	{
		for(int i=0;i<Game.handler.entity.size();i++)
		{
			Entity en = Game.handler.entity.get(i);
			if(en.getId()==Id.player)
			{
				if(Game.SuperSayan==false&&Game.SuperSayan3==false&&Game.SuperSayanGod==false&&!en.animate)
				{
					Game.effetto=true;
					Game.supersayan.Play();
					Game.SuperSayan=true;
					Game.damage=10.0;
					if(en.getFacing()==1)
					{
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan0.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan1.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan2.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan4.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan5.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan6.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan7.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan8.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
					}
					if(en.getFacing()==0)
					{
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan0.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan1.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan2.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan4.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan5.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan6.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan7.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan8.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
					}
					
					Game.player[0]=new Sprite("/GokuSuperSayan/goku2.png");
					Game.player[1]=new Sprite("/GokuSuperSayan/goku2.1.png");
					Game.player[2]=new Sprite("/GokuSuperSayan/goku2.2.png");
					Game.player[3]=new Sprite("/GokuSuperSayan/goku2.3.png");
					Game.player[4]=new Sprite("/GokuSuperSayan/goku2.4.png");
					Game.player[5]=new Sprite("/GokuSuperSayan/goku2.5.png");
				}
			}
		}
	}
	public static void SuperSayan3()
	{
		for(int i=0;i<Game.handler.entity.size();i++)
		{
			Entity en = Game.handler.entity.get(i);
			if(en.getId()==Id.player)
			{
				if(Game.SuperSayan3==false&&Game.SuperSayan==true&&Game.SuperSayanGod==false&&!en.animate)
				{
					Game.effetto3=true;
					Game.supersayan.Play();
					Game.SuperSayan3=true;
					Game.SuperSayan=false;
					Game.damage=30.0;
					if(en.getFacing()==1)
					{
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.0.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.1.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.2.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.3.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.4.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.5.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.6.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.7.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.8.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.9.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.10.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.11.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.12.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.13.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.14.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.15.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.16.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.17.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.18.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.19.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.20.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.21.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.22.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku super sayan3.23.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
					}
					if(en.getFacing()==0)
					{
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.0.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.1.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.2.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.3.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.4.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.5.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.6.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.7.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.8.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.9.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.10.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.11.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.12.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.13.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.14.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.15.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.16.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.17.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.18.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.19.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.20.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.21.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.22.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku super sayan3.23.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
					}
					
					Game.player[0]=new Sprite("/GokuSuperSayan3/goku3.png");
					Game.player[1]=new Sprite("/GokuSuperSayan3/goku3.1.png");
					Game.player[2]=new Sprite("/GokuSuperSayan3/goku3.2.png");
					Game.player[3]=new Sprite("/GokuSuperSayan3/goku3.3.png");
					Game.player[4]=new Sprite("/GokuSuperSayan3/goku3.4.png");
					Game.player[5]=new Sprite("/GokuSuperSayan3/goku3.5.png");
				}
			}
		}
	}
	
	public static void SuperSayanGod()
	{
		for(int i=0;i<Game.handler.entity.size();i++)
		{
			Entity en = Game.handler.entity.get(i);
			if(en.getId()==Id.player)
			{
				Game.supersayan.Play();
				if(Game.SuperSayan3==false&&Game.SuperSayan==false&&Game.SuperSayanGod==false&&!en.animate)
				{
					Game.SuperSayanGod=true;
					Game.damage=100.0;
					if(en.getFacing()==1)
					{
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.1.png");try {Thread.sleep(300);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.2.png");try {Thread.sleep(300);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.3.png");try {Thread.sleep(300);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.4.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.5.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.6.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.7.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.8.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.9.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.10.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.11.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.12.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.13.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.14.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.15.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.16.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.17.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.18.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.19.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.20.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.21.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.22.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.23.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.24.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.25.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.26.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.27.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
					}
					
					if(en.getFacing()==0)
					{
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.1.png");try {Thread.sleep(300);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.2.png");try {Thread.sleep(300);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.3.png");try {Thread.sleep(300);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.4.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.5.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.6.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.7.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.8.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.9.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.10.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.11.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.12.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.13.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.14.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.15.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.16.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.17.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.18.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.19.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.20.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.21.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.22.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.23.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.24.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.25.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.26.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku_super_saiyan_god_.27.png");try {Thread.sleep(100);} catch (InterruptedException e2) {e2.printStackTrace();}
					}
					
					Game.player[0]=new Sprite("/GokuSuperSayanGod/goku4.png");
					Game.player[1]=new Sprite("/GokuSuperSayanGod/goku4.1.png");
					Game.player[2]=new Sprite("/GokuSuperSayanGod/goku4.2.png");
					Game.player[3]=new Sprite("/GokuSuperSayanGod/goku4.3.png");
					Game.player[4]=new Sprite("/GokuSuperSayanGod/goku4.4.png");
					Game.player[5]=new Sprite("/GokuSuperSayanGod/goku4.5.png");
				}
			}
		}
	}
		
	public static void Normal()
	{
		for(int i=0;i<Game.handler.entity.size();i++)
		{
			Entity en = Game.handler.entity.get(i);
			if(en.getId()==Id.player)
			{
				if(Game.SuperSayan==true||Game.SuperSayan3==true||Game.SuperSayanGod==true)
				{
					Game.damage=8.0;
					Game.SuperSayan=false;
					Game.SuperSayan3=false;
					Game.SuperSayanGod=false;
					if(en.getFacing()==1)
					{
						Game.player[0]=new Sprite("/Trasformazioni/goku normal0.png");try {Thread.sleep(300);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku normal1.png");try {Thread.sleep(300);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku normal2.png");try {Thread.sleep(300);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[0]=new Sprite("/Trasformazioni/goku normal3.png");try {Thread.sleep(300);} catch (InterruptedException e2) {e2.printStackTrace();}
					}
					if(en.getFacing()==0)
					{
						Game.player[3]=new Sprite("/Trasformazioni/goku normal0.png");try {Thread.sleep(300);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku normal1.png");try {Thread.sleep(300);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku normal2.png");try {Thread.sleep(300);} catch (InterruptedException e2) {e2.printStackTrace();}
						Game.player[3]=new Sprite("/Trasformazioni/goku normal3.png");try {Thread.sleep(300);} catch (InterruptedException e2) {e2.printStackTrace();}
					}

					Game.player[0]=new Sprite("/GokuNormale/goku1.png");
					Game.player[1]=new Sprite("/GokuNormale/goku1.1.png");
					Game.player[2]=new Sprite("/GokuNormale/goku1.2.png");
					Game.player[3]=new Sprite("/GokuNormale/goku1.3.png");
					Game.player[4]=new Sprite("/GokuNormale/goku1.4.png");
					Game.player[5]=new Sprite("/GokuNormale/goku1.5.png");
				}
			}
		}
	}
	public static void Normal2()
	{
		for(int i=0;i<Game.handler.entity.size();i++)
		{
			Entity en = Game.handler.entity.get(i);
			if(en.getId()==Id.player)
			{
				if(Game.SuperSayan==true||Game.SuperSayan3==true||Game.SuperSayanGod==true)
				{
					Game.damage=8.0;

					Game.player[0]=new Sprite("/GokuNormale/goku1.png");
					Game.player[1]=new Sprite("/GokuNormale/goku1.1.png");
					Game.player[2]=new Sprite("/GokuNormale/goku1.2.png");
					Game.player[3]=new Sprite("/GokuNormale/goku1.3.png");
					Game.player[4]=new Sprite("/GokuNormale/goku1.4.png");
					Game.player[5]=new Sprite("/GokuNormale/goku1.5.png");
				}
			}
		}
	}
}
