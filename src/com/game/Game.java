
package com.game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.game.entity.Entity;
import com.game.entity.mob.Player;
import com.game.gfx.Sprite;
import com.game.gfx.gui.Help;
import com.game.gfx.gui.Launcher;
import com.game.gfx.gui.Levels;
import com.game.gfx.gui.Video;
import com.game.input.KeyInput;
import com.game.input.MouseInput;

public class Game extends Canvas implements Runnable
{
	
	BufferedReader filebuf =  null; 
	private static final long serialVersionUID = 1L;
	public static Graphics g;
	public static final int WIDTH = 160;
	public static final int HEIGHT = 90;
	public static final int SCALE = 5;
	public static final String TITLE = "Muna's game";
	public static FileWriter w = null;
	
	public static boolean livello1=true;
	public static boolean livello2=false;
	public static boolean livello3=false;
	public static boolean livello4=false;
	public static boolean livello5=false;
	public static boolean livello6=false;
	
	private Thread thread;
	public static Handler handler;
	public static Camera cam;
	public static Launcher launcher;
	public static Levels livelli;
	public static Help help;
	public static Player player1;
	public static MouseInput mouse;
	
	private boolean running = false;
	public static boolean move=false;
	public static boolean GameOver=false;
	public static boolean ShowDeathScreen=true;
	public static boolean Playing= false;
	public static boolean Pause=false;
	public static boolean Sigla=true;
	public static boolean schermata_livelli=false;
	public static boolean schermata_help=false;
	public static boolean stop=false;
	
	public static int lives = 10;
	public int DeathScreenTime=0;
	public static int level=0;
	
	public static boolean SuperSayan=false;
	public static boolean SuperSayan3=false;
	public static boolean SuperSayanGod=false;
	public static boolean morto=false;
	public static boolean Fotomorto=false;
	public static boolean shoot=false;
	public static boolean effetto=false;
	public static boolean effetto3=false;
	public static double damage=8.0;
	public static int shootTime=0;
	public static int dragonballs;
	public static int checkpoint=0;
	
	public static BufferedImage levels[]=null;
	public static Sprite Sfondo;
	public static Sprite Titolo;
	public static Sprite Morto;
	
	public static Sprite wall;
	public static Sprite PowerUpBlock;
	public static Sprite UsedPowerUpBlock;
	public static Sprite fire[]=new Sprite[14];
	
	public static Sprite player[]=new Sprite[6];
	public static Sprite energy[]=new Sprite[2];
	public static Sprite dragonBalls[]=new Sprite[7];
	public static Sprite majin[]=new Sprite[10];
	public static Sprite ginyu[]=new Sprite[8];
	public static Sprite freezer[]=new Sprite[8];
	
	public static Sound canzone;
	public static Sound salto;
	public static Sound supersayan;
	public static Sound coin;
	public static Sound sigla;
	public static Sound Canzone_morte;
	public static Sound effect;
	public static Sound effect3;
	//public static Video video;
	
	
	public Game ()
	{
		Dimension size = new Dimension(WIDTH*SCALE,HEIGHT*SCALE);
		setPreferredSize(size);
		setMaximumSize(size);
		setMinimumSize(size);
	}
	
	private void init()
	{
		try {filebuf=new BufferedReader(new FileReader("salvataggi.txt"));} catch (FileNotFoundException e2) {e2.printStackTrace();}
		String nextStr = null;
		try {nextStr = filebuf.readLine();} catch (IOException e1) {e1.printStackTrace();}
		while(nextStr!=null)
		{
			if(nextStr.contains("Sfere del drago: "))
			{
				System.out.println(nextStr);
				try {nextStr = filebuf.readLine();} catch (IOException e1) {e1.printStackTrace();}
				System.out.println(nextStr);
				String Drag = nextStr;
				dragonballs=Integer.parseInt(Drag);
				checkpoint=dragonballs;
			}
			if(nextStr.contains("Livello sbloccato: "))
			{
				try {nextStr = filebuf.readLine();} catch (IOException e1) {e1.printStackTrace();}

				if(nextStr.contains("1")) livello1=true;
				if(nextStr.contains("2")) livello2=true; 
				if(nextStr.contains("3")) {livello2=true; livello3=true;}
				if(nextStr.contains("4")) {livello2=true; livello3=true; livello4=true;}
				if(nextStr.contains("5")) {livello2=true; livello3=true; livello4=true; livello5=true;}
				if(nextStr.contains("6")) { livello2=true; livello3=true; livello4=true; livello5=true; livello6=true;}
			}
			try {nextStr = filebuf.readLine();} catch (IOException e1) {e1.printStackTrace();}
			
		}
	       
		launcher = new Launcher();
		livelli= new Levels();
		help=new Help();
		handler = new Handler();
		cam=new Camera();
		mouse=new MouseInput();
		levels=new BufferedImage[6];
		canzone=new Sound("/Musiche/musica.wav");
		salto=new Sound("/Musiche/bump.wav");
		supersayan=new Sound("/Musiche/powerup.wav");
		coin=new Sound("/Musiche/coin.wav");
		sigla=new Sound("/Musiche/Sigla.wav");
		Canzone_morte=new Sound("/Musiche/mariodie.wav");
		effect=new Sound("/Musiche/effect.wav");
		effect3=new Sound("/Musiche/effect3.wav");
		
		addKeyListener(new KeyInput());
		addMouseListener(mouse);
		addMouseMotionListener(mouse);
		
		Sfondo = new Sprite("/sfondo.jpg");
		Titolo = new Sprite("/Titolo.jpg");
		Morto = new Sprite("/morto.png");
		
		wall=new Sprite("/Livello/blocco.png");
		PowerUpBlock=new Sprite("/Livello/blocco2.png");
		UsedPowerUpBlock=new Sprite("/Livello/blocco2usato.png");
		
		fire[0]=new Sprite("/Livello/Fire/fire1.png");
		fire[1]=new Sprite("/Livello/Fire/fire2.png");
		fire[2]=new Sprite("/Livello/Fire/fire3.png");
		fire[3]=new Sprite("/Livello/Fire/fire4.png");
		fire[4]=new Sprite("/Livello/Fire/fire5.png");
		fire[5]=new Sprite("/Livello/Fire/fire6.png");
		fire[6]=new Sprite("/Livello/Fire/fire7.png");
		fire[7]=new Sprite("/Livello/Fire/fire8.png");
		fire[8]=new Sprite("/Livello/Fire/fire9.png");
		fire[9]=new Sprite("/Livello/Fire/fire10.png");
		fire[10]=new Sprite("/Livello/Fire/fire11.png");
		fire[11]=new Sprite("/Livello/Fire/fire12.png");
		fire[12]=new Sprite("/Livello/Fire/fire13.png");
		fire[13]=new Sprite("/Livello/Fire/fire14.png");
		
		player[0]=new Sprite("/GokuNormale/goku1.png");
		player[1]=new Sprite("/GokuNormale/goku1.1.png");
		player[2]=new Sprite("/GokuNormale/goku1.2.png");
		player[3]=new Sprite("/GokuNormale/goku1.3.png");
		player[4]=new Sprite("/GokuNormale/goku1.4.png");
		player[5]=new Sprite("/GokuNormale/goku1.5.png");
		
		energy[0]=new Sprite("/Energy/energy.png");
		energy[1]=new Sprite("/Energy/energy1.png");
		
		dragonBalls[0]=new Sprite("/DragonBalls/dragonBalls1.png");
		dragonBalls[1]=new Sprite("/DragonBalls/dragonBalls2.png");
		dragonBalls[2]=new Sprite("/DragonBalls/dragonBalls3.png");
		dragonBalls[3]=new Sprite("/DragonBalls/dragonBalls4.png");
		dragonBalls[4]=new Sprite("/DragonBalls/dragonBalls5.png");
		dragonBalls[5]=new Sprite("/DragonBalls/dragonBalls6.png");
		dragonBalls[6]=new Sprite("/DragonBalls/dragonBalls7.png");
		
		majin[0]=new Sprite("/Enemies/majin1.png");
		majin[1]=new Sprite("/Enemies/majin1.1.png");
		majin[2]=new Sprite("/Enemies/majin1.2.png");
		majin[3]=new Sprite("/Enemies/majin1.3.png");
		majin[4]=new Sprite("/Enemies/majin1.4.png");
		majin[5]=new Sprite("/Enemies/majin1.5.png");
		majin[6]=new Sprite("/Enemies/majin1.6.png");
		majin[7]=new Sprite("/Enemies/majin1.7.png");
		majin[8]=new Sprite("/Enemies/majin1.8.png");
		majin[9]=new Sprite("/Enemies/majin1.9.png");
		
		ginyu[0]=new Sprite("/Enemies/ginyu1.png");
		ginyu[1]=new Sprite("/Enemies/ginyu1.1.png");
		ginyu[2]=new Sprite("/Enemies/ginyu1.2.png");
		ginyu[3]=new Sprite("/Enemies/ginyu1.3.png");
		ginyu[4]=new Sprite("/Enemies/ginyu1.4.png");
		ginyu[5]=new Sprite("/Enemies/ginyu1.5.png");
		ginyu[6]=new Sprite("/Enemies/ginyu1.6.png");
		ginyu[7]=new Sprite("/Enemies/ginyu1.7.png");
		
		freezer[0]=new Sprite("/Boss/freezer1.png");
		freezer[1]=new Sprite("/Boss/freezer1.2.png");
		freezer[2]=new Sprite("/Boss/freezer1.3.png");
		freezer[3]=new Sprite("/Boss/freezer1.4.png");
		freezer[4]=new Sprite("/Boss/freezer1.5.png");
		freezer[5]=new Sprite("/Boss/freezer1.6.png");
		freezer[6]=new Sprite("/Boss/freezer1.7.png");
		freezer[7]=new Sprite("/Boss/freezer1.8.png");
		
		try 
		{
			levels[0]=ImageIO.read(getClass().getResourceAsStream("/level0.png"));
			levels[1]=ImageIO.read(getClass().getResourceAsStream("/level1.png"));
			levels[2]=ImageIO.read(getClass().getResourceAsStream("/level2.png"));
			levels[3]=ImageIO.read(getClass().getResourceAsStream("/level3.png"));
			levels[4]=ImageIO.read(getClass().getResourceAsStream("/level4.png"));
			levels[5]=ImageIO.read(getClass().getResourceAsStream("/level5.png"));
		} 
		catch (IOException e) {e.printStackTrace();}
	}
	
	
	private synchronized void start()
	{
		if(running) return;
		running=true;
		thread=new Thread(this,"Thread");
		thread.start();
	}
	
	private synchronized void stop()
	{
		if(!running) return;
		running=false;
		
		try{thread.join();} catch (InterruptedException e) {e.printStackTrace();}
	}

	public void run()
	{
		init();
		requestFocus();
		long lastTime = System.nanoTime();
		long timer = System.currentTimeMillis();
		double delta=0;
		double ns = 1000000000.0/60.0;
		int frames=0;
		int ticks =0;
		while(running)
		{
			long now = System.nanoTime();
			delta+=(now-lastTime)/ns;
			lastTime=now;
			while(delta>=1)
			{
				tick();
				
				ticks++;
				delta--;
			}
			
			render();
			
			frames++;
			if(System.currentTimeMillis()-timer >1000){
				timer+=1000;
				System.out.print("Frame per Second: "+frames);
				System.out.println("  Tick per Second: "+ticks);
				frames=0;
				ticks=0;
			}
		}
		stop();
	}
	
	

	public void render()
	{
		BufferStrategy bs = getBufferStrategy();
		if(bs==null)
		{
			createBufferStrategy(3);
			return;
		}
		g= bs.getDrawGraphics();
		if(!ShowDeathScreen){g.drawImage(Sfondo.getBufferedImage(), 0, 0,WIDTH*SCALE,HEIGHT*SCALE,null);}
		if(ShowDeathScreen) 
		{
			if(!GameOver)
			{
			if(Fotomorto) ;
				//g.drawImage(Morto.getBufferedImage(), 0, 0, WIDTH*SCALE,HEIGHT*SCALE, null);
			else
			{
				g.clearRect(0, 0, WIDTH*SCALE, HEIGHT*SCALE);
			
				g.setColor(Color.BLACK);
			
				g.setFont(new Font("Courier",Font.BOLD,30));
				g.drawString("x"+lives, WIDTH*SCALE/2, HEIGHT*SCALE/2+50);
			
				g.setFont(new Font("Courier",Font.BOLD,70));
				g.drawString("Livello "+(level+1), WIDTH*SCALE/2-170, HEIGHT*SCALE/2-100);
			
				
				if(((SuperSayan||SuperSayan3||SuperSayanGod)&&DeathScreenTime>=50)&&morto)
				{
					if(DeathScreenTime>=30){player[0]=new Sprite("/Trasformazioni/goku normal0.png");}
					if(DeathScreenTime>=60) {player[0]=new Sprite("/Trasformazioni/goku normal1.png");}
					if(DeathScreenTime>=90){player[0]=new Sprite("/Trasformazioni/goku normal2.png");}
					if(DeathScreenTime>=120){player[0]=new Sprite("/Trasformazioni/goku normal3.png");}
					if(DeathScreenTime>=150){player[0]=new Sprite("/GokuNormale/goku1.png");}
					
				}
				g.drawImage(player[0].getBufferedImage(),WIDTH*SCALE/2-48, HEIGHT*SCALE/2-64+50, 48,64,null);
				
				
			}
			
			}
			else if(GameOver)
			{
				g.clearRect(0, 0, WIDTH*SCALE, HEIGHT*SCALE);
				g.setColor(Color.BLACK);
				g.setFont(new Font("Courier",Font.BOLD,30));
				g.drawString("GAME OVER", WIDTH*SCALE/2-80, HEIGHT*SCALE/2-20);
			}
		}
		
		if(Playing) {g.translate(cam.getX(), cam.getY());}
		
		if(!ShowDeathScreen&&Playing) handler.render(g);
		
		else if(!Playing)
		{
			if(!schermata_livelli&&!schermata_help&&!Pause){launcher.render(g);}
			if(schermata_livelli&&!schermata_help&&!Pause){livelli.render(g);}
			if(!schermata_livelli&&schermata_help&&!Pause){help.render(g);}
			if(Pause){g.setFont(new Font("Century Gothic", Font.ITALIC, 30)); g.drawString("||", Game.GetFrameWidth()/2, Game.GetFrameHeight()/2);}
		}
		
		g.dispose();
		bs.show();
	}
	
	public void tick()
	{
		if(Playing) handler.tick();
		if(level==1) livello2=true;
		if(level==2) livello3=true;
		if(level==3) livello4=true;
		if(level==4) livello5=true;
		if(level==5) livello6=true;
		
		if(SuperSayan&&effetto) {effect.Play(); effect.infinity(); effetto=false;}
		if(SuperSayan3&&effetto3){effect3.Play(); effect3.infinity(); effetto3=false;}
		if(!SuperSayan3&&!SuperSayan){effect3.Stop(); effect.Stop();}
		
		if(((SuperSayan||SuperSayan3||SuperSayanGod)&&DeathScreenTime>=50)&&morto)
			if(DeathScreenTime>=190)
			{
				Game.damage=8.0;
				
				Game.player[0]=new Sprite("/GokuNormale/goku1.png");
				Game.player[1]=new Sprite("/GokuNormale/goku1.1.png");
				Game.player[2]=new Sprite("/GokuNormale/goku1.2.png");
				Game.player[3]=new Sprite("/GokuNormale/goku1.3.png");
				Game.player[4]=new Sprite("/GokuNormale/goku1.4.png");
				Game.player[5]=new Sprite("/GokuNormale/goku1.5.png");
			}
			
			
		shootTime++;
		if(shootTime>=60)
		{
			Game.shoot=false;
			shootTime=0;
		}
		
		for(int i=0;i<handler.entity.size();i++)
		{
			Entity en = handler.entity.get(i);
			
			if(en.getId()==Id.player)
			{
				cam.tick(en);
			}
		}
		if(ShowDeathScreen&&!GameOver&&Playing){canzone.Stop(); DeathScreenTime++;}
		
		if(DeathScreenTime==1&&morto) Canzone_morte.Play();
		
		if(DeathScreenTime>=220&&morto) Fotomorto=true;
		
		
		if(DeathScreenTime>=200)
		{
			if(!GameOver)
			{
				
				Fotomorto=false;
				Canzone_morte.Stop();
				if(morto){morto=false;
				Game.SuperSayan=false;
				Game.SuperSayan3=false;
				Game.SuperSayanGod=false;}
				DeathScreenTime=0;
				ShowDeathScreen=false;
				canzone.Play();
				canzone.infinity();
				handler.ClearLevel();
				handler.createLevel(levels[level]);
				
			}
			else if(GameOver)
			{
				DeathScreenTime=0;
				ShowDeathScreen=false;
				Playing = false;
				GameOver=false;
			}
		}
		if(Sigla)
		{
			System.out.println("Ciao");
			sigla.Play();
			sigla.infinity();
			Sigla=false;
		}
	}
	
	public static void Azzera()
	{

	    try {w=new FileWriter("salvataggi.txt");} catch (IOException e) {e.printStackTrace();}

	    BufferedWriter b;
	    b=new BufferedWriter (w);

	    try {
			b.write("Livello sbloccato: ");
			b.write("\n");
			b.write("1");
			b.write("\n");
			b.write("Sfere del drago: ");
			b.write("\n");
			b.write("0");
			b.flush();
		} catch (IOException e) {e.printStackTrace();}
	}
	
	public static void SwitchLevel()
	{
		level++;

		checkpoint=dragonballs;
		
	    try {w=new FileWriter("salvataggi.txt");} catch (IOException e) {e.printStackTrace();}

	    BufferedWriter b;
	    b=new BufferedWriter (w);

	    try {
			b.write("Livello sbloccato: ");
			b.write("\n");
			b.write(Integer.toString(level+1));
			b.write("\n");
			b.write("Sfere del drago: ");
			b.write("\n");
			b.write(Integer.toString(checkpoint));
			b.flush();
		} catch (IOException e) {e.printStackTrace();}

	    
		
		handler.ClearLevel();
		
		ShowDeathScreen=true;
		
		canzone.Stop();
		
	}
	
	public static Rectangle getVisibleArea()
	{
		for(int i=0;i<handler.entity.size();i++)
		{
			Entity e = handler.entity.get(i);
			if(e.getId()==Id.player)
			{
				return new Rectangle(e.getX()-((GetFrameWidth()/2)-5),e.getY()-(GetFrameHeight()/2-5),GetFrameWidth()+10,GetFrameHeight()+10);	
			}
			
		}
		return null;
	}
	
	public static int GetFrameWidth(){return WIDTH*SCALE;}
	
	public static int GetFrameHeight() { return HEIGHT*SCALE;}
	
	public static void main(String[] args)
	{
		Game game = new Game();
		JFrame frame = new JFrame(TITLE);
		//Video.main(args);
		frame.add(game);
		frame.pack();
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		game.start();
	}



}
