package Abdelhafid.pglp_4_1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

import Abdelhafid.pglp_4_1.Personnel.PersonnelBuilder;

public class TestAffiGroupe {
	
	
	@Test
	public void test() {
		GroupePersonnel g1 = new GroupePersonnel();
		GroupePersonnel g2 = new GroupePersonnel();
		GroupePersonnel g3 = new GroupePersonnel();
		GroupePersonnel g4 = new GroupePersonnel();
		GroupePersonnel g5 = new GroupePersonnel();
		GroupePersonnel g6 = new GroupePersonnel();
		GroupePersonnel g7 = new GroupePersonnel();
    	
    	
		 Personnel personne = new PersonnelBuilder("BELHABIB", "Soufiane", "Informaticien")
				.Naissance(LocalDate.parse("1992-06-16", DateTimeFormatter.ISO_DATE))
				.ajouter_numero(new Telephone("Perso", "0650784512"))
				.ajouter_numero(new Telephone("Pro", "0650784513"))
				.build();
		
		
     
        g7.ajouter(personne);
        g4.ajouter(g6);
        g4.ajouter(g7);
        g3.ajouter(g4);
        g3.ajouter(g5);
        g1.ajouter(g2);
        g1.ajouter(g3);
        
        AffichageParGroupe afiicheGroupe = new AffichageParGroupe();
        afiicheGroupe.parcoursLargeur(g1);
        Iterator< PersonnelInterface> tmp = afiicheGroupe.iterator();
        
        ArrayList< PersonnelInterface> l1 = new ArrayList< PersonnelInterface>();
        ArrayList< PersonnelInterface> l2 = new ArrayList< PersonnelInterface>();
        
        for (; tmp.hasNext(); l1.add(tmp.next()));
        
        l2.add(g1);
        l2.add(g2);
        l2.add(g3);
        l2.add(g4);
        l2.add(g5);
        l2.add(g6);
        l2.add(g7);
        l2.add(personne);
        assertTrue(l1.toString().equalsIgnoreCase(l2.toString()));
	}

}
