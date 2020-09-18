package com.jdc.hellofx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloJavafx extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		// GUI Layout Container (Branch)
		VBox box = new VBox();
		box.setPrefWidth(400);
		box.setPrefHeight(250);
		box.setAlignment(Pos.CENTER);
		
		// leaf node
		Label label = new Label("Hello Javafx");
		label.setFont(new Font(48));
		
		// add leaf to branch
		box.getChildren().add(label);
		
		Label jdc = new Label("Java Developer Class");
		box.getChildren().add(jdc);
		jdc.setFont(new Font(20));
		
		// Create Scene
		Scene scene = new Scene(box);
		
		// Set Scene to stage
		stage.setScene(scene);
		
		stage.show();
	}
}
