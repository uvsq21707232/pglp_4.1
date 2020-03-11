package Abdelhafid.pglp_4_1;

public class Telephone {
	
	private TypeTelephone tel_type;
	private int numero;
	
	public Telephone(TypeTelephone tel_type, int numero) {
	
		this.tel_type = tel_type;
		this.numero = numero;
	}
	
	public TypeTelephone getTel_type() {
		return tel_type;
	}
	
	public int getNumero() {
		return numero;
	}
	
	
	

}
