package Abdelhafid.pglp_4_1;

import java.util.ArrayDeque;
import java.util.Iterator;

public class AffichageParGroupe implements Iterable<PersonnelInterface> {

	
	
	private ArrayDeque<PersonnelInterface> file;
	
	
	public void parcoursLargeur(final PersonnelInterface p_i) {
		
		PersonnelInterface y,z;
		
		file=new ArrayDeque<PersonnelInterface>();
		
			GroupePersonnel grp;
	}
	
	
	
	@Override
	public Iterator<PersonnelInterface> iterator() {
		
		return file.iterator();
	}
	

}
