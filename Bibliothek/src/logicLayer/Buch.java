package logicLayer;

public class Buch extends Medium {
	private String Author;
	private int ISBN;

	/**
	 * Diese Methode setzt dem Author einen Wert.
	 * 
	 * @param Author übergibt den Wert des Authors.
	 */
	public void setAuthor(String Author) {
		this.Author = Author;
	}

	/**
	 * Diese Methode gibt den Author zurück.
	 * 
	 * @return gibt den Wert des Author's zurück.
	 */
	public String getAuthor() {
		return Author;
	}

	/**
	 * Diese Methode setzt der ISBN-Nummer einen Wert.
	 * 
	 * @param ISBN übergibt den Wert der ISBN-Nummer.
	 */
	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}

	/**
	 * Diese Methode gibt die ISBN-Nummer zurück.
	 * 
	 * @return gibt den Wert der ISBN-Nummer zurück.
	 */
	public int getISBN() {
		return ISBN;
	}
}
