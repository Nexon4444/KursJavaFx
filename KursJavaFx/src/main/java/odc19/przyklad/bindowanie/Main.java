package odc19.przyklad.bindowanie;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - Bindowanie properties - przykład #19
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=2QbOaxVJo0E
 */
public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/odc19/Binding.fxml"));
		Pane pane = loader.load();
		Scene scene = new Scene(pane);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Przykład properties");
		stage.setResizable(false);
		stage.show();
	}

}
