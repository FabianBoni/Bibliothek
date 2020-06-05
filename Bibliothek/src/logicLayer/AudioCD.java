package logicLayer;

public class AudioCD extends Medium {
	private String Interpret;

	/**
	 * Diese Methode setzt dem Interpret einen Wert.
	 * 
	 * @param Interpret �bergibt den Wert des Interpret.
	 */
	public void setInterpret(String Interpret) {
		this.Interpret = Interpret;
	}

	/**
	 * Diese Methode gibt den Interpreten zur�ck.
	 * 
	 * @return gibt den Wert des Interpreten zur�ck.
	 */
	public String getInterpret() {
		return Interpret;
	}
}
