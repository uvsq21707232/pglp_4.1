package Abdelhafid.pglp_4_1;

import java.util.ArrayList;
import java.util.Iterator;

public class GroupePersonnel implements PersonnelInterface,Iterable<PersonnelInterface>{
	
	
	private ArrayList<PersonnelInterface> liste_personnels;
	
	private  final int id_composite;
	private static int Compteur = 1;
	
	public  GroupePersonnel() {
		id_composite = Compteur++;
		
		liste_personnels= new ArrayList<PersonnelInterface>();
	}
	
	@Override
	public void print() {
		System.out.println("Numero du composite  : " + id_composite);
		for (PersonnelInterface per_inter : liste_personnels) {
			per_inter.print();
		}
		
	}
	
	
	/*ajouter une personne à la liste si elle n'éxiste pas déja  */
	
	public GroupePersonnel ajouter(final PersonnelInterface per_inter) {
		if (!liste_personnels.contains(per_inter)) {
			liste_personnels.add(per_inter);
		}
		return this;
	}
	
 /* Supprimer une personne si elle éxiste dans la liste */
	
	public GroupePersonnel supprimer(final PersonnelInterface per_inter) {
		
		if (liste_personnels.contains(per_inter)) {
			liste_personnels.remove(per_inter);
		}
		return this;
	}


	public int getId_composite() {
		return id_composite;
	}

	@Override
	public Iterator<PersonnelInterface> iterator() {
		
		return liste_personnels.iterator();
	}

}
