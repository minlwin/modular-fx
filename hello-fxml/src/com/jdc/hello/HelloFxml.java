package com.jdc.hello;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloFxml extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		// load view
		Parent root = FXMLLoader.load(getClass().getResource("HelloFxml.fxml"));

		// create scene
		Scene scene = new Scene(root);

		// set scene to stage
		stage.setScene(scene);
		
		// show stage
		stage.show();
	}
}
