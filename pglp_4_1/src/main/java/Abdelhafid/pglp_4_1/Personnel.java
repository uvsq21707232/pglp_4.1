package Abdelhafid.pglp_4_1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Personnel {
	
	private final String Nom;
	private final String Prenom;
	private List<Telephone> num_telephones;
	
	private final String fonction;
	private final LocalDate date_naissance;
	
	
	
	
	
	
	/* Builder*/
	
	public static class PersonnelBuilder {
		
		private final String Nom;
		private final String Prenom;
		private final String fonction;
		private List<Telephone> num_telephones = new ArrayList<Telephone>();
		private LocalDate date_naissance;
		
		
		
		public PersonnelBuilder(String nom ,String prenom,String fonction) {
			
			this.Nom=nom;
			this.Prenom=prenom;	
			this.fonction=fonction;
	    }
		
		
		
		public  PersonnelBuilder Naissance(LocalDate naissance) {
			
			this.date_naissance =naissance;
			return this;
			
		}
		
		
		public PersonnelBuilder ajouter_numero( Telephone Tel_numero) {
			this.num_telephones.add(Tel_numero);
			return this;
		}

		
	

		public Personnel build() {
		return new Personnel(this);	
		}
		
	}
	
	
	private Personnel(PersonnelBuilder builder) {
		
		 Nom = builder.Nom;
		 Prenom = builder.Prenom;
		 fonction = builder.fonction;
		 date_naissance = builder.date_naissance;
		 num_telephones=builder.num_telephones;
		 
		
		
	}
	
		public List<Telephone> getNum_telephones() {
			
			return num_telephones;
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



		public String getFonction() {
			return fonction;
		}
		
	
 




}
