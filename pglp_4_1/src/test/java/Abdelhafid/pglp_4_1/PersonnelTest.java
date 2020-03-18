package Abdelhafid.pglp_4_1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import Abdelhafid.pglp_4_1.Personnel.PersonnelBuilder;
public class PersonnelTest { 
	
	
	private Personnel personne;
	
	@Before()
	
	public void initialisation() {
		
		personne = new PersonnelBuilder("BELHABIB", "Soufiane", "Informaticien")
				.Naissance(LocalDate.parse("1992-06-16", DateTimeFormatter.ISO_DATE))
				.ajouter_numero(new Telephone("Perso", "0650784512"))
				.ajouter_numero(new Telephone("Pro", "0650784513"))
				.build();	
	}
	
	// tester la liste des telephones//
	
	/*
	@Test()
	public void testGetNumTelephone() {
		
	   List<Telephone> numeros = new ArrayList<Telephone>();
		
		numeros.add(new Telephone("Perso","0650784512"));
		numeros.add(new Telephone("Pro", "0650784513"));
		
		assertEquals(personne.getNum_telephones(), numeros);	
	}
	*/
	
	
	@Test()
	public void testGetNom() {
		assertEquals(personne.getNom(), "BELHABIB");
	}
	
	@Test()
	public void testGetPrenom() {
		assertEquals(personne.getPrenom(), "Soufiane");
	}
	
	@Test()
	public void testGetFonction() {
		assertEquals(personne.getFonction(), "Informaticien");
	}
	
	@Test()
	public void testGetDate_naissance() {
		assertEquals(personne.getDate_naissance(), 
				LocalDate.parse("1992-06-16", DateTimeFormatter.ISO_DATE));
	}

}
