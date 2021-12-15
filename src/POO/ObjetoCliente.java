package POO;

public class ObjetoCliente {
	
	public static void main (String[]args){
		 
		Cliente Cliente1 = new Cliente(  "Marcos","Vinicius","Vieira");
		Cliente1.idade = 20;
		
		Cliente1.sexo = "Masculino";
	
		
	    
		Cliente1.getCPFcadastrado();
		
		//CPF ficticio //teste
		Cliente1.setCPFcadastrado(12345678910l);
		Cliente1.getValidação();
		Cliente1.setValidação(12345678912l);
		Cliente1.confirmação();
		Cliente1.status();
	}

}


