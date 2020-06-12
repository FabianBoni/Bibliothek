/**
 * Die Klasse welcomeController steueret die GUI welcome.fxml .
 * 
 * @author Fabian Boni
 * @version 1.0
 * @since 27.05.2020
 */
package GUI;

import java.io.IOException;
import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import logicLayer.Kunde;

public class welcomeController {

	@FXML
	private Button loginbutton;

	@FXML
	private TextField kundennummer, passwort;

	@FXML
	private Label notice;

	@FXML
	private BorderPane bp;

	@FXML
	private static Stage stage;
	
	private Kunde k = new Kunde();

	/**
	 * Diese Methode überprüft die eingegebene Kundennummer sowie das eingegebene
	 * Passwort auf einen Eintrag in der Datenbank.
	 * 
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException            Zeigt bei einem Input resp. Outputfeheler
	 *                                einen Fehlercode an.
	 */
	public void login() throws SQLException, ClassNotFoundException, IOException {
		int knummer = Integer.parseInt(kundennummer.getText());
		k.checkPassword(knummer);
		k.checkKundennummer(knummer);
		
		String rpasswort = k.getPasswort().replace(" ", "");

		if (k.getKundennummer() != 0) {
			if (passwort.getText().equals(rpasswort)) {
				kundenVerwaltung(stage);
			} else {
				notice.setVisible(true);
			}
		} else {
			notice.setVisible(true);
		}
	}

	/**
	 * Diese Methode ladet die GUI Kundenverwaltung.
	 * 
	 * @param stage der Parameter stage übergibt die aktuelle (umformuliert) Bühne.
	 *              Auf dieser Bühne wird die neue Szene Kundenverwaltung geladen,
	 *              die Bühne bleibt die gleiche.
	 * @throws IOException
	 */
	public void kundenVerwaltung(Stage stage) throws IOException {
		// Load components from FMXL file
		Parent root = FXMLLoader.load(getClass().getResource("kundenverwaltung.fxml"));
		// Create Scene with background color
		Scene scene = new Scene(root, 600, 400);

		// Set scene on stage with title
		stage.setTitle("Kundenverwaltung");
		stage.setScene(scene);
		stage.show();

	}

	/**
	 * Diese Methode weist der Instanzvariable stage den Wert der aktuellen Stage
	 * zu.
	 * 
	 * @param stage
	 */
	public static void getStage(Stage stage) {
		welcomeController.stage = stage;
	}

}