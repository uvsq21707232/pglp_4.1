package Abdelhafid.pglp_4_1;

public class Telephone {
	
	private String tel_type;
	private int numero;
	
	public Telephone(String tel_type, int numero) {
	
		this.tel_type = tel_type;
		this.numero = numero;
	}

	@Override
	public String toString() {
		
	return  tel_type + " -- " + numero;
	
	}

	public String getTel_type() {
		return tel_type;
	}

	

	public int getNumero() {
		return numero;
	}

	
	
	
	
	
	

}
