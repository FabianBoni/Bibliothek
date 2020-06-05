/**
 * Die Klasse Main ist die Startklasse, die die erste GUI initalisiert.
 * 
 * @author Fabian Boni
 * @version 1.0
 * @since 27.05.2020
 */
package GUI;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	/**
	 * Die Methode start ladet die GUI Anzeige von welcome.fxml
	 */
	@FXML
	public void start(Stage stage) throws IOException, ClassNotFoundException {
		// Load components from FMXL file
		Parent root = FXMLLoader.load(getClass().getResource("welcome.fxml"));
		// Create Scene with background color
		Scene scene = new Scene(root, 600, 400);

		// Set scene on stage with title
		stage.setTitle("Gemeindebibliothek Therwil");
		stage.setScene(scene);
		stage.show();

		welcomeController.getStage(stage);

	}

	/**
	 * Die Main-Methode führt die start-Methode automatisch bei der Inizialisierung
	 * des Programms aus.
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
