package logicLayer;

public class DVD extends Medium {
	private String Produktionsstudio;

	/**
	 * Diese Methode setzt dem Produktionsstudio einen Wert.
	 * 
	 * @param Produktionsstudio übergibt den Wert des Produktionsstudio.
	 */
	public void setProduktionsstudio(String Produktionsstudio) {
		this.Produktionsstudio = Produktionsstudio;
	}

	/**
	 * Diese Methode gibt das Produktionsstudio zurück.
	 * 
	 * @return gibt den Wert des Produktionsstudio's zurück.
	 */
	public String getProduktionsstudio() {
		return Produktionsstudio;
	}
}
