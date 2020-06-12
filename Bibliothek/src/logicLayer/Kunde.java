package logicLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import dataLayer.KundeSQL;

public class Kunde {
	private int ID;
	private String Nachname, Geburtsdatum, EMail;
	private String Vorname;
	private KundeSQL ksql = new KundeSQL();

	/**
	 * Diese Methode setzt dem Nachnamen einen Wert.
	 * 
	 * @param a übergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */

	public void setNachname(int a) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		this.Nachname = ksql.getNachname(a);
	}

	/**
	 * Diese Methode gibt den Wert des Nachnamen's zurück.
	 * 
	 * @param a übergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public String getNachname(int a) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		setNachname(a);
		return this.Nachname;
	}

	/**
	 * Diese Methode setzt dem Vornamen einen Wert.
	 * 
	 * @param a übergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void setVorname(int a) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		this.Vorname = ksql.getVorname(a);
	}

	/**
	 * Diese Methode gibt den Wert des Vornamen's zurück.
	 * 
	 * @param a übergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public String getVorname(int a) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		setVorname(a);
		return this.Vorname;
	}

	/**
	 * Diese Methode setzt dem Geburtsdatum einen Wert.
	 * 
	 * @param a übergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void setGeburtsdatum(int a) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		this.Geburtsdatum = ksql.getGeburtsdatum(a);
	}

	/**
	 * Diese Methode gibt den Wert des Geburtsdatums zurück.
	 * 
	 * @param a übergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public String getGeburtsdatum(int a)
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		setGeburtsdatum(a);
		return this.Geburtsdatum;
	}

	/**
	 * Diese Methode setzt der EMail einen Wert.
	 * 
	 * @param a übergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void setEMail(int a) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		this.EMail = ksql.getEMail(a);
	}

	/**
	 * Diese Methode gibt den Wert der EMail zurück.
	 * 
	 * @param a übergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public String getEMail(int a) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		setEMail(a);
		return this.EMail;
	}

	/**
	 * Diese Methode setzt der ID einen Wert.
	 * 
	 * @param a übergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void setID(int a) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		this.ID = ksql.getID(a);
	}

	/**
	 * Diese Methode gibt den Wert der ID zurück.
	 * 
	 * @param a übergibt den Wert des Index.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public int getID(int a) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		setID(a);
		return this.ID;
	}

	/**
	 * Diese Methode überprüft ein eingegebenes Passwort auf Richtigkeit.
	 * 
	 * @param Kundennummer übergibt den Wert der Kundennummer, die mit dem Passwort
	 *                     verglichen wird.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void checkPassword(int Kundennummer)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		ksql.checkPassword(Kundennummer);
	}

	/**
	 * Diese Methode gibt den Wert des überprüften Passworts eines gültigen Accounts
	 * zurück.
	 * 
	 * @return gibt den Wert des überprüften Passworts zurück.
	 */
	public String getPasswort() {
		return ksql.getCheckedPasswort();
	}

	/**
	 * Diese Methode überprüft die Kundennummer auf gültigkeit.
	 * 
	 * @param Kundennummer übergibt den Wert der Kundennummer.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void checkKundennummer(int Kundennummer)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		ksql.checkKundennummer(Kundennummer);
	}

	/**
	 * Diese Methode gibt den Wert der überprüften Kundennummer zurück, wenn kein
	 * gültiger Account gefunden wurde, wird ein null Wert zurückgegeben.
	 * 
	 * @return gibt die überprüfte Kundennummer zurück.
	 */
	public int getKundennummer() {
		return ksql.getCheckedKundennummer();
	}

	/**
	 * Diese Methode gibt die Anzahl Datensätze der Kundentabelle zurück.
	 * 
	 * @return gibt die Anzahl Datensätze der Kundentabelle zurück.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public int checkRows() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		return ksql.getRows();
	}
}
