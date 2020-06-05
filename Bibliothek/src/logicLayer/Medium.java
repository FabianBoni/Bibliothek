/**
 * Die Klasse Medium enth�lt Methoden um die Daten der Medien aus der Datenbank
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
	 * @param Altersfreigabe �bergibt den Wert der Altersfreigabe.
	 */
	public void setAltersfreigabe(int Altersfreigabe) {
		this.Altersfreigabe = Altersfreigabe;
	}

	/**
	 * Diese Methode gibt den Wert der Altersfreigabe zur�ck.
	 * 
	 * @return gibt den Wert der Altersfreigabe zur�ck.
	 */
	public int getAltersfreigabe() {
		return Altersfreigabe;
	}

	/**
	 * Diese Methode setzt dem Standortcode einen Wert.
	 * 
	 * @param Standortcode �bergibt den Wert des Standortcode's.
	 */
	public void setStandortcode(int Standortcode) {
		this.Standortcode = Standortcode;
	}

	/**
	 * Gibt den Wert des Standortcode's zur�ck.
	 * 
	 * @return gibt den Wert des Standortcode's zur�ck.
	 */
	public int getStandortcode() {
		return Standortcode;
	}

	/**
	 * Diese Methode setzt der EAN-Nummer einen Wert.
	 * 
	 * @param EAN �bergibt den Wert der EAN-Nummer.
	 */
	public void setEAN(int EAN) {
		this.EAN = EAN;
	}

	/**
	 * Diese Methode gibt den Wert der EAN-Nummer zur�ck.
	 * 
	 * @return EAN gibt den Wert der EAN-Nummer zur�ck.
	 */
	public int getEAN() {
		return EAN;
	}

	/**
	 * Diese Methode setzt dem Genre einen Wert.
	 * 
	 * @param �bergibt den Wert des Genre's.
	 */
	public void setGenre(String Genre) {
		this.Genre = Genre;
	}

	/**
	 * Diese Methode gibt den Wert des Genre's zur�ck.
	 * 
	 * @return gibt den Wert des Genre's zur�ck.
	 */
	public String getGenre() {
		return Genre;
	}

	/**
	 * Diese Methode setzt dem Titel einen Wert.
	 * 
	 * @param Titel �bergibt den Wert des Titel's.
	 */
	public void setTitel(String Titel) {
		this.Titel = Titel;
	}

	/**
	 * Diese Methode gibt den Wert des Titel's zur�ck.
	 * 
	 * @return Titel gibt den Wert des Titel's zur�ck.
	 */
	public String getTitel() {
		return Titel;
	}

	/**
	 * Diese Methode setzt der ID einen Wert.
	 * 
	 * @param ID �bergibt den Wert der ID.
	 */
	public void setID(int ID) {
		this.ID = ID;
	}

	/**
	 * Diese Methode gibt den Wert der ID zur�ck.
	 * 
	 * @return gibt den Wert der ID zur�ck.
	 */
	public int getID() {
		return ID;
	}

}
