package logicLayer;

import java.sql.SQLException;

import dataLayer.KundeSQL;

public class Kunde {
	private static int ID;
	private static String Nachname, Geburtsdatum, EMail;
	private String Vorname;
	private KundeSQL ksql = new KundeSQL();

	/**
	 * Diese Methode setzt dem Nachnamen einen Wert.
	 * 
	 * @param a �bergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 */

	public void setNachname(int a) throws ClassNotFoundException, SQLException {
		Kunde.Nachname = ksql.getNachname(a);
	}

	/**
	 * Diese Methode gibt den Wert des Nachnamen's zur�ck.
	 * 
	 * @param a �bergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 */
	public String getNachname(int a) throws ClassNotFoundException, SQLException {
		setNachname(a);
		return Nachname;
	}

	/**
	 * Diese Methode setzt dem Vornamen einen Wert.
	 * 
	 * @param a �bergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 */
	public void setVorname(int a) throws ClassNotFoundException, SQLException {
		this.Vorname = ksql.getVorname(a);
	}

	/**
	 * Diese Methode gibt den Wert des Vornamen's zur�ck.
	 * 
	 * @param a �bergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 */
	public String getVorname(int a) throws ClassNotFoundException, SQLException {
		setVorname(a);
		return Vorname;
	}

	/**
	 * Diese Methode setzt dem Geburtsdatum einen Wert.
	 * 
	 * @param a �bergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 */
	public void setGeburtsdatum(int a) throws ClassNotFoundException, SQLException {
		Kunde.Geburtsdatum = ksql.getGeburtsdatum(a);
	}

	/**
	 * Diese Methode gibt den Wert des Geburtsdatums zur�ck.
	 * 
	 * @param a �bergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 */
	public String getGeburtsdatum(int a) throws ClassNotFoundException, SQLException {
		setGeburtsdatum(a);
		return Geburtsdatum;
	}

	/**
	 * Diese Methode setzt der EMail einen Wert.
	 * 
	 * @param a �bergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 */
	public void setEMail(int a) throws ClassNotFoundException, SQLException {
		Kunde.EMail = ksql.getEMail(a);
	}

	/**
	 * Diese Methode gibt den Wert der EMail zur�ck.
	 * 
	 * @param a �bergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 */
	public String getEMail(int a) throws ClassNotFoundException, SQLException {
		setEMail(a);
		return EMail;
	}

	/**
	 * Diese Methode setzt der ID einen Wert.
	 * 
	 * @param a �bergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 */
	public void setID(int a) throws ClassNotFoundException, SQLException {
		Kunde.ID = ksql.getID(a);
	}

	/**
	 * Diese Methode gibt den Wert der ID zur�ck.
	 * 
	 * @param a �bergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 */
	public int getID(int a) throws ClassNotFoundException, SQLException {
		setID(a);
		return ID;
	}

	/**
	 * Diese Methode �berpr�ft ein eingegebenes Passwort auf Richtigkeit.
	 * 
	 * @param Kundennummer �bergibt den Wert der Kundennummer, die mit dem Passwort
	 *                     verglichen wird.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 */
	public static void checkPassword(int Kundennummer) throws SQLException, ClassNotFoundException {
		KundeSQL.checkPassword(Kundennummer);
	}

	/**
	 * Diese Methode gibt den Wert des �berpr�ften Passworts eines g�ltigen Accounts
	 * zur�ck.
	 * 
	 * @return gibt den Wert des �berpr�ften Passworts zur�ck.
	 */
	public static String getPasswort() {
		return KundeSQL.getCheckedPasswort();
	}

	/**
	 * Diese Methode �berpr�ft die Kundennummer auf g�ltigkeit.
	 * 
	 * @param Kundennummer �bergibt den Wert der Kundennummer.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 */
	public static void checkKundennummer(int Kundennummer) throws SQLException, ClassNotFoundException {
		KundeSQL.checkKundennummer(Kundennummer);
	}

	/**
	 * Diese Methode gibt den Wert der �berpr�ften Kundennummer zur�ck, wenn kein
	 * g�ltiger Account gefunden wurde, wird ein null Wert zur�ckgegeben.
	 * 
	 * @return gibt die �berpr�fte Kundennummer zur�ck.
	 */
	public static int getKundennummer() {
		return KundeSQL.getCheckedKundennummer();
	}

	/**
	 * Diese Methode gibt die Anzahl Datens�tze der Kundentabelle zur�ck.
	 * 
	 * @return gibt die Anzahl Datens�tze der Kundentabelle zur�ck.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 */
	public static int checkRows() throws ClassNotFoundException, SQLException {
		return KundeSQL.getRows();
	}
}
