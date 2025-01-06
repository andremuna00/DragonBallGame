package com.game.gfx.gui;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Video extends Application 
{
	public static void main(String [] args)
	{
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception
	{
		Group root = new Group();
		Media media = new Media("file:///C:/Users/andre/Desktop/Andrea/Scuola/workspace/provaVideo/Trailer/video.mp4");
		
		MediaPlayer player = new MediaPlayer(media);
		MediaView view = new MediaView(player);
		
		root.getChildren().add(view);
		Scene scene =new Scene(root,160*5,90*5,Color.BLACK);
		stage.setScene(scene);
		stage.show();
		scene.addEventHandler(KeyEvent.KEY_PRESSED, keyEvent -> 
		{
			if (keyEvent.getCode() == KeyCode.ENTER) 
	        {
				//stage.setFullScreen(!stage.isFullScreen());
				stage.close();
	        };
	        if (keyEvent.getCode() == KeyCode.F11) 
	        {
				stage.setFullScreen(!stage.isFullScreen());
	        };
	    }
		);
		player.play();
		
			
		
	}

	
}
