package logicLayer;

public class Game extends Medium {
	private String Anforderungen, Entwicklerstudio;

	/**
	 * Diese Methode setzt den Anforderungen einen Wert,
	 * 
	 * @param Anforderungen übergibt den Wert den Anforderungen.
	 */
	public void setAnforderungen(String Anforderungen) {
		this.Anforderungen = Anforderungen;
	}

	/**
	 * Diese Methode gibt den Wert der Anforderungen zurück.
	 * 
	 * @return gibt den Wert der Anforderungen zurück.
	 */
	public String getAnforderungen() {
		return Anforderungen;
	}

	/**
	 * Diese Methode setzt dem Entwicklerstudio einen Wert.
	 * 
	 * @param Entwicklerstudio übergibt den Wert des Entwicklerstudios.
	 */
	public void setEntwicklerstudio(String Entwicklerstudio) {
		this.Entwicklerstudio = Entwicklerstudio;
	}

	/**
	 * Diese Methode gibt den Wert des Entwicklerstudio's zurück.
	 * 
	 * @return gibt den Wert des Entwicklerstudio's zurück.
	 */
	public String getEntwicklerstudio() {
		return Entwicklerstudio;
	}
}
