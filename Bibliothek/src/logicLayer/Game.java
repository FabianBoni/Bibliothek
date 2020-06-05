package logicLayer;

public class Game extends Medium {
	private String Anforderungen, Entwicklerstudio;

	/**
	 * Diese Methode setzt den Anforderungen einen Wert,
	 * 
	 * @param Anforderungen �bergibt den Wert den Anforderungen.
	 */
	public void setAnforderungen(String Anforderungen) {
		this.Anforderungen = Anforderungen;
	}

	/**
	 * Diese Methode gibt den Wert der Anforderungen zur�ck.
	 * 
	 * @return gibt den Wert der Anforderungen zur�ck.
	 */
	public String getAnforderungen() {
		return Anforderungen;
	}

	/**
	 * Diese Methode setzt dem Entwicklerstudio einen Wert.
	 * 
	 * @param Entwicklerstudio �bergibt den Wert des Entwicklerstudios.
	 */
	public void setEntwicklerstudio(String Entwicklerstudio) {
		this.Entwicklerstudio = Entwicklerstudio;
	}

	/**
	 * Diese Methode gibt den Wert des Entwicklerstudio's zur�ck.
	 * 
	 * @return gibt den Wert des Entwicklerstudio's zur�ck.
	 */
	public String getEntwicklerstudio() {
		return Entwicklerstudio;
	}
}
