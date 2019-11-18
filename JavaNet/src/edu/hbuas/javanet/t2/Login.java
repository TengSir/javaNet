package edu.hbuas.javanet.t2;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * scene Builder
 * @author Lenovo
 */
public class Login  extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group g=new Group();
		Scene  s=new Scene(g,300,400,Color.GRAY);
		primaryStage.setTitle("Login");
		primaryStage.setScene(s);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Login.launch(args);
	}

}
