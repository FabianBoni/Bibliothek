package logicLayer;

public class DVD extends Medium {
	private String Produktionsstudio;

	/**
	 * Diese Methode setzt dem Produktionsstudio einen Wert.
	 * 
	 * @param Produktionsstudio �bergibt den Wert des Produktionsstudio.
	 */
	public void setProduktionsstudio(String Produktionsstudio) {
		this.Produktionsstudio = Produktionsstudio;
	}

	/**
	 * Diese Methode gibt das Produktionsstudio zur�ck.
	 * 
	 * @return gibt den Wert des Produktionsstudio's zur�ck.
	 */
	public String getProduktionsstudio() {
		return Produktionsstudio;
	}
}
