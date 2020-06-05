package JUnit_Tests;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import dataLayer.KundeSQL;

class KundeTest {
	
	KundeSQL ksql = new KundeSQL();
	String nachname, vorname, geburtsdatum, email, passwort;
	int id, kundennummer;

	@Test
	void testSetNachname() throws ClassNotFoundException, SQLException {
		int a = 1;
		assertNotNull("Success!", ksql.getNachname(a));
		this.nachname = ksql.getNachname(a);
	}

	@Test
	void testGetNachname() {
		assertNotNull("Success!", this.nachname);
	}

	@Test
	void testSetVorname() throws ClassNotFoundException, SQLException {
		int a = 1;
		assertNotNull("Success!", ksql.getVorname(a));
		this.vorname = ksql.getVorname(a);
	}

	@Test
	void testGetVorname() {
		assertNotNull("Success!", this.vorname);
	}

	@Test
	void testSetGeburtsdatum() throws ClassNotFoundException, SQLException {
		int a = 1;
		assertNotNull("Success!", ksql.getGeburtsdatum(a));
		this.geburtsdatum = ksql.getGeburtsdatum(a);
	}

	@Test
	void testGetGeburtsdatum() {
		assertNotNull("Success!", this.geburtsdatum);
	}

	@Test
	void testSetEMail() throws ClassNotFoundException, SQLException {
		int a = 1;
		assertNotNull("Success!", ksql.getEMail(a));
		this.email = ksql.getEMail(a);
	}

	@Test
	void testGetEMail() {
		assertNotNull("Success!", this.email);
	}

	@Test
	void testSetID() throws ClassNotFoundException, SQLException {
		int a = 1;
		assertNotNull("Success!", ksql.getID(a));
		this.id = ksql.getID(a);
	}
}
