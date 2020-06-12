/**
 * Die Klasse KundeSQL stellt eine Verbindung zur entsprechenden Datenbank her 
 * und enhält diverse Methoden mit verschiedenen Datenbankabfragen.
 * 
 * @author Fabian Boni
 * @version 1.0
 * @since 27.05.2020
 */
package dataLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class KundeSQL {

	private int ID;
	private int Kundennummer;
	private String Nachname;
	private String Vorname;
	private String Geburtsdatum;
	private String EMail;
	private String Passwort;
	private Connection con;
	private int count;
	private Properties prob = new Properties();

	public void loadProperties() throws FileNotFoundException, IOException {
		prob.load(new FileInputStream("C:\\Users\\fabud\\Desktop\\Bibliothek\\Config Data\\credentials.properties\\"));
	}

	/**
	 * Diese Methode holt alle erforderlichen Informationen eines Kunden aus der
	 * Datenbank, die in der Benutzerverwaltung benötigt werden.
	 * 
	 * @param a Dieser Parameter übergibt die zu suchende ID bei der
	 *          Datenbankabfrage.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void getKunde(int a) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		loadProperties();
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection("jdbc:postgresql://" + prob.getProperty("host") + "/"
				+ prob.getProperty("database") + "?user=" + prob.getProperty("username") + "&password="
				+ prob.getProperty("password") + "&ssl=org.postgresql.ssl.DefaultJavaSSLFactory");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from \"Kunde\" where \"Kundennummer\" = " + a);
		while (rs.next()) {
			ID = rs.getInt(1);
			Nachname = rs.getString(2);
			Vorname = rs.getString(3);
			Geburtsdatum = rs.getString(4);
			EMail = rs.getString(5);
		}
		con.close();
	}

	/**
	 * Diese Methode holt das Passwort eines bestimmten Benutzers aus der Datenbank.
	 * 
	 * @param Kundennummer Dieser Parameter wird gebraucht, um das eingegebene
	 *                     Passwort mit dem Wert der Kundennummer zu vergleichen.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void checkPassword(int Kundennummer)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		loadProperties();
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection("jdbc:postgresql://" + prob.getProperty("host") + "/"
				+ prob.getProperty("database") + "?user=" + prob.getProperty("username") + "&password="
				+ prob.getProperty("password") + "&ssl=org.postgresql.ssl.DefaultJavaSSLFactory");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from  \"Kunde\" where \"Kundennummer\" = " + Kundennummer);
		while (rs.next()) {
			this.Passwort = rs.getString(6);
		}
		con.close();
	}

	/**
	 * Diese Methode holt die Kundennummer eines bestimmten Benutzers aus der
	 * Datenbank.
	 * 
	 * @param Kundennummer Dieser Parameter übergibt die Kundennummer.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void checkKundennummer(int Kundennummer)

			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		loadProperties();
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection("jdbc:postgresql://" + prob.getProperty("host") + "/"
				+ prob.getProperty("database") + "?user=" + prob.getProperty("username") + "&password="
				+ prob.getProperty("password") + "&ssl=org.postgresql.ssl.DefaultJavaSSLFactory");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from \"Kunde\" where \"Kundennummer\" = " + Kundennummer);
		while (rs.next()) {
			this.Kundennummer = rs.getInt(7);
		}
		con.close();
	}

	/**
	 * Diese Methode zählt die Anzahl Datensätze in der Kundentabelle.
	 * 
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void checkRows() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		loadProperties();
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection("jdbc:postgresql://" + prob.getProperty("host") + "/"
				+ prob.getProperty("database") + "?user=" + prob.getProperty("username") + "&password="
				+ prob.getProperty("password") + "&ssl=org.postgresql.ssl.DefaultJavaSSLFactory");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select count(*) from \"Kunde\"");
		if (rs.next()) {
			count = rs.getInt(1);
		}
		con.close();
	}

	/**
	 * Diese Methode gibt das ausgelesene Passwort zurück.
	 * 
	 * @return
	 */
	public String getCheckedPasswort() {
		return this.Passwort;
	}

	/**
	 * Diese Methode gibt die ausgelesene Kundennummer zurück.
	 * 
	 * @return
	 */
	public int getCheckedKundennummer() {
		return this.Kundennummer;
	}

	/**
	 * Diese Methode gibt die ID eines bestimmten Benutzers zurück.
	 * 
	 * @param a Dieser Parameter übergibt der Index, mit dem nach dem Benutzer
	 *          gesucht wird.
	 * @return gibt die Benutzer-ID zurück.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public int getID(int a) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		getKunde(a);
		System.out.println(a);
		return ID;
	}

	/**
	 * Diese Methode gibt den Nachnamen eines bestimmten Benutzers zurück.
	 * 
	 * @param a Dieser Parameter übergibt der Index, mit dem nach dem Benutzer
	 *          gesucht wird.
	 * @return gibt den Nachnamen des Benutzers zurück.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public String getNachname(int a) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		getKunde(a);
		return Nachname;
	}

	/**
	 * Diese Methode gibt den Vornamen eines bestimmten Benutzers zurück.
	 * 
	 * @param a Dieser Parameter übergibt der Index, mit dem nach dem Benutzer
	 *          gesucht wird.
	 * @return gibt den Vornamen des Benutzers zurück.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public String getVorname(int a) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		getKunde(a);
		return Vorname;
	}

	/**
	 * Diese Methode gibt das Geburtsdatum eines bestimmten Benutzers zurück.
	 * 
	 * @param a Dieser Parameter übergibt der Index, mit dem nach dem Benutzer
	 *          gesucht wird.
	 * @return gibt das Geburtsdatum des Benutzers zurück.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public String getGeburtsdatum(int a)
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		getKunde(a);
		return Geburtsdatum;
	}

	/**
	 * Diese Methode gibt die EMail eines bestimmten Benutzers zurück.
	 * 
	 * @param a Dieser Parameter übergibt der Index, mit dem nach dem Benutzer
	 *          gesucht wird.
	 * @return gibt die EMail des Benutzers zurück.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public String getEMail(int a) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		getKunde(a);
		return EMail;
	}

	/**
	 * Diese Methode gibt die Kundennummer eines bestimmten Benutzers zurück.
	 * 
	 * @param a Dieser Parameter übergibt der Index, mit dem nach dem Benutzer
	 *          gesucht wird.
	 * @return gibt die Kundennummer des Benutzers zurück.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public int getKundenNummer(int a) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		getKunde(a);
		return this.Kundennummer;
	}

	/**
	 * Diese Methode gibt die Anzahl Datensätze in der Kundentabelle zurück.
	 * 
	 * @param a Dieser Parameter übergibt der Index, mit dem nach dem Benutzer
	 *          gesucht wird.
	 * @return gibt die Anzahl Datensätze der Kundentabelle zurück.
	 * @throws ClassNotFoundException Zeigt ein Fehlercode an, wenn die Klasse mit
	 *                                dem jdbc-Treiber nicht gefunden wird.
	 * @throws SQLException           Zeigt ein Fehlercode bei einer fehlerhaften
	 *                                Datenbankabfrage an.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public int getRows() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		checkRows();
		return this.count;
	}
}