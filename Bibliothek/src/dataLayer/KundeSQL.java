/**
 * Die Klasse KundeSQL stellt eine Verbindung zur entsprechenden Datenbank her 
 * und enhält diverse Methoden mit verschiedenen Datenbankabfragen.
 * 
 * @author Fabian Boni
 * @version 1.0
 * @since 27.05.2020
 */
package dataLayer;

import java.sql.*;

public class KundeSQL {

	private static int ID;
	private static int Kundennummer;
	private static String Nachname;
	private String Vorname;
	private static String Geburtsdatum;
	private static String EMail;
	private static String Passwort;
	private static Connection con;
	private static int count;

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
	 */
	public void getKunde(int a) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(
				"jdbc:mysql://192.168.1.139:3306/Bibliothek?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
				"admin", "Lb18.admin");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Kunde where ID = " + a);
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
	 */
	public static void checkPassword(int Kundennummer) throws SQLException, ClassNotFoundException {
		con = DriverManager.getConnection(
				"jdbc:mysql://192.168.1.139:3306/Bibliothek?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
				"admin", "Lb18.admin");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Kunde where Kundennummer = " + Kundennummer);
		while (rs.next()) {
			KundeSQL.Passwort = rs.getString(6);
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
	 */
	public static void checkKundennummer(int Kundennummer) throws SQLException, ClassNotFoundException {
		con = DriverManager.getConnection(
				"jdbc:mysql://192.168.1.139:3306/Bibliothek?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
				"admin", "Lb18.admin");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Kunde where Kundennummer = " + Kundennummer);
		while (rs.next()) {
			KundeSQL.Kundennummer = rs.getInt(7);
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
	 */
	public static void checkRows() throws SQLException, ClassNotFoundException {
		con = DriverManager.getConnection(
				"jdbc:mysql://192.168.1.139:3306/Bibliothek?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
				"admin", "Lb18.admin");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select count(*) from Kunde");
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
	public static String getCheckedPasswort() {
		return KundeSQL.Passwort;
	}

	/**
	 * Diese Methode gibt die ausgelesene Kundennummer zurück.
	 * 
	 * @return
	 */
	public static int getCheckedKundennummer() {
		return KundeSQL.Kundennummer;
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
	 */
	public int getID(int a) throws ClassNotFoundException, SQLException {
		getKunde(a);
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
	 */
	public String getNachname(int a) throws ClassNotFoundException, SQLException {
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
	 */
	public String getVorname(int a) throws ClassNotFoundException, SQLException {
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
	 */
	public String getGeburtsdatum(int a) throws ClassNotFoundException, SQLException {
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
	 */
	public String getEMail(int a) throws ClassNotFoundException, SQLException {
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
	 */
	public int getKundenNummer(int a) throws ClassNotFoundException, SQLException {
		getKunde(a);
		return Kundennummer;
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
	 */
	public static int getRows() throws ClassNotFoundException, SQLException {
		checkRows();
		return count;
	}
}
