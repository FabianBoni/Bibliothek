package logicLayer;

public class AudioCD extends Medium {
	private String Interpret;

	/**
	 * Diese Methode setzt dem Interpret einen Wert.
	 * 
	 * @param Interpret übergibt den Wert des Interpret.
	 */
	public void setInterpret(String Interpret) {
		this.Interpret = Interpret;
	}

	/**
	 * Diese Methode gibt den Interpreten zurück.
	 * 
	 * @return gibt den Wert des Interpreten zurück.
	 */
	public String getInterpret() {
		return Interpret;
	}
}
