/**
 * Die Klasse kundenverwaltungController steuert die GUI-Elemente der GUI Kundenverwaltung
 * 
 * @author Fabian Boni
 * @version 1.0
 * @since 27.05.2020
 */
package GUI;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import logicLayer.Kunde;

public class kundenverwaltungController implements Initializable {

	private int count;

	private Kunde k = new Kunde();

	private int a = 0;

	@FXML
	private ListView<String> kundenliste;

	@FXML
	private Label vorname, nachname, geburtsdatum, email, lvorname, lnachname, lgeburtsdatum, lemail;

	@FXML
	private ImageView usericon;

	/**
	 * Die Methode initialize wird automatisch ausgeführt wenn das GUI fertig
	 * geladen wurde. In dieser Methode werden die Benutzer der Bibliothek in der
	 * GUI angezeigt.
	 */
	public void initialize(URL location, ResourceBundle resources) {
		try {
			this.count = Kunde.checkRows();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < count; i++) {
			try {
				a++;
				kundenliste.getItems().add(k.getID(a) + " " + k.getNachname(a) + " " + k.getVorname(a));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		kundenliste.setOnMouseClicked((EventHandler<? super MouseEvent>) new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				int index = kundenliste.getSelectionModel().getSelectedIndex() + 1;
				try {
					showKunden(index);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Diese Methode zeigt Details über einen ausgewählten Benutzer an.
	 * 
	 * @param index Dieser Parameter übergibt den Index der Einträge aus der Liste.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 */
	public void showKunden(int index) throws ClassNotFoundException, SQLException {
		vorname.setText(k.getVorname(index));
		nachname.setText(k.getNachname(index));
		geburtsdatum.setText(k.getGeburtsdatum(index));
		email.setText(k.getEMail(index));

		vorname.setVisible(true);
		nachname.setVisible(true);
		geburtsdatum.setVisible(true);
		email.setVisible(true);
		usericon.setVisible(true);

		lvorname.setVisible(true);
		lnachname.setVisible(true);
		lgeburtsdatum.setVisible(true);
		lemail.setVisible(true);
	}

}
