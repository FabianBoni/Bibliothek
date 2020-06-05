/**
 * Die Klasse Medium enthält Methoden um die Daten der Medien aus der Datenbank
 * zu holen, dabei gibt es 4 Unterklassen, die mindestens 1 Zusatzattribut haben,
 * da diese Medien sich von anderen in diesem Punkt unterscheiden.
 *  
 * @author Fabian Boni
 * @version 1.0
 * @since 27.05.2020
 */
package logicLayer;

public class Medium {

	private int ID, EAN, Altersfreigabe, Standortcode;
	private String Titel, Genre;

	/**
	 * Diese Methode setzt der Altersfreigabe einen Wert.
	 * 
	 * @param Altersfreigabe übergibt den Wert der Altersfreigabe.
	 */
	public void setAltersfreigabe(int Altersfreigabe) {
		this.Altersfreigabe = Altersfreigabe;
	}

	/**
	 * Diese Methode gibt den Wert der Altersfreigabe zurück.
	 * 
	 * @return gibt den Wert der Altersfreigabe zurück.
	 */
	public int getAltersfreigabe() {
		return Altersfreigabe;
	}

	/**
	 * Diese Methode setzt dem Standortcode einen Wert.
	 * 
	 * @param Standortcode übergibt den Wert des Standortcode's.
	 */
	public void setStandortcode(int Standortcode) {
		this.Standortcode = Standortcode;
	}

	/**
	 * Gibt den Wert des Standortcode's zurück.
	 * 
	 * @return gibt den Wert des Standortcode's zurück.
	 */
	public int getStandortcode() {
		return Standortcode;
	}

	/**
	 * Diese Methode setzt der EAN-Nummer einen Wert.
	 * 
	 * @param EAN übergibt den Wert der EAN-Nummer.
	 */
	public void setEAN(int EAN) {
		this.EAN = EAN;
	}

	/**
	 * Diese Methode gibt den Wert der EAN-Nummer zurück.
	 * 
	 * @return EAN gibt den Wert der EAN-Nummer zurück.
	 */
	public int getEAN() {
		return EAN;
	}

	/**
	 * Diese Methode setzt dem Genre einen Wert.
	 * 
	 * @param übergibt den Wert des Genre's.
	 */
	public void setGenre(String Genre) {
		this.Genre = Genre;
	}

	/**
	 * Diese Methode gibt den Wert des Genre's zurück.
	 * 
	 * @return gibt den Wert des Genre's zurück.
	 */
	public String getGenre() {
		return Genre;
	}

	/**
	 * Diese Methode setzt dem Titel einen Wert.
	 * 
	 * @param Titel übergibt den Wert des Titel's.
	 */
	public void setTitel(String Titel) {
		this.Titel = Titel;
	}

	/**
	 * Diese Methode gibt den Wert des Titel's zurück.
	 * 
	 * @return Titel gibt den Wert des Titel's zurück.
	 */
	public String getTitel() {
		return Titel;
	}

	/**
	 * Diese Methode setzt der ID einen Wert.
	 * 
	 * @param ID übergibt den Wert der ID.
	 */
	public void setID(int ID) {
		this.ID = ID;
	}

	/**
	 * Diese Methode gibt den Wert der ID zurück.
	 * 
	 * @return gibt den Wert der ID zurück.
	 */
	public int getID() {
		return ID;
	}

}
