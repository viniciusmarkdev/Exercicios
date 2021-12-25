package POOintrodução;

public class Caneta {
	
	String modelo ;
	String 	cor ;
	double ponta;
	int carga;
	boolean tampada;
	
	void rabiscar() {
		
		if(this.tampada == true) {
			System.out.println("Não é possível rabiscar");
			
		}
	    else {
				
				System.out.println("Vamos rabiscar");
			}
		}
		
		
	
	
	void tampar() {
		
		this.tampada = true;
		
		
		
	}
	
	
	void destampar() {
		
		this.tampada = false;

}
	
	
	void status() {
		
		System.out.println("A caneta é " +getCor());
		System.out.println("Está tampada ?"+getTampada() );
		System.out.println("A caneta é " +getModelo() );
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public boolean getTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
}
