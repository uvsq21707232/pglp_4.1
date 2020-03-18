package Abdelhafid.pglp_4_1;

public class Telephone {
	
	private String tel_type;
	private String numero;
	
	public Telephone(String tel_type, String numero) {
	
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

	

	public String getNumero() {
		return numero;
	}

	
	
	
	
	
	

}
