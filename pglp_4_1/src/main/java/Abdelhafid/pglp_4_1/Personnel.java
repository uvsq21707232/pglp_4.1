package Abdelhafid.pglp_4_1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Personnel {
	
	private final String Nom;
	private final String Prenom;
	
	private List<Telephone> telephone = new ArrayList<>();
	
	private final Fonction fonction;
	private final LocalDate date_naissance;
	
	
	private Personnel(PersonnelBuilder builder) {
		
		 this.Nom = builder.Nom;
		 this.Prenom = builder.Prenom;
		 this.fonction = builder.fonction;
		 this.date_naissance = builder.date_naissance;
		 this.telephone=builder.telephone;
		
	}
	
	
	/* Builder*/
	
	public static class PersonnelBuilder{
		
		private final String Nom;
		private final String Prenom;
		
		private List<Telephone> telephone = new ArrayList<>();
		
		private Fonction fonction;
		
		private LocalDate date_naissance;
		
		
		
		public PersonnelBuilder(String nom , String prenom) {
			
			this.Nom=nom;
			this.Prenom=prenom;	
		}
		
		public PersonnelBuilder Fonction(Fonction fonc) {
			this.fonction=fonc;
			return this;
			
		}
		
		public  PersonnelBuilder Naissance(LocalDate naissance) {
			
			this.date_naissance =naissance;
			return this;
			
		}
		

		public Personnel build() {
		return new Personnel(this);	
		}
		
		
		public void ajoutTel(Telephone tel) {
			this.telephone.add(tel);
		}
		
  public  PersonnelBuilder Telephone(Telephone tel) {
			
     this.telephone.add(tel);
     return this;
			
		}

public List<Telephone> getTelephone() {
	return telephone;
}



public Fonction getFonction() {
	return fonction;
}

public LocalDate getDate_naissance() {
	return date_naissance;
}

public String getNom() {
	return Nom;
}

public String getPrenom() {
	return Prenom;
}

}
}
