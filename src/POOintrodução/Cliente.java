	package POOintrodução;

public class Cliente {
	
	private	String ClienteNome;
	private	String SobreNome;
	private String UltimoNome;
	private Long Validação;
	int idade ;
		
	public String sexo;
	private long CPFcadastrado;
		


	 

	public Cliente (String primeiro,String segundo,String Ultimo) {
		
		ClienteNome = primeiro;
	    SobreNome = segundo;
	    UltimoNome = Ultimo;
		
	}
	public String getNomeCompleto() {
		String NomeCompleto = ClienteNome +" "+ SobreNome +" "+UltimoNome ;
		return NomeCompleto;
	}

	public long getCPFcadastrado() {
		
		
		return CPFcadastrado;
		
	}
	public void setCPFcadastrado(long cPFcadastrado ) {
		CPFcadastrado = cPFcadastrado;
		
	}

		public Long getValidação() {
			return Validação;
		}
		public void setValidação(Long validação) {
			Validação = validação;
		}




	public  void confirmação() {
		
		
	    if(CPFcadastrado == Validação ) {
	    System.out.println("O CPF está validado e cadastrado");
	    }
	    
	    else {
	    	System.out.println("O CPF está invalido e não foi cadastrado");
	    	
	    
		}
		



	}


	public void status() {
		System.out.println("O nome completo do cliente é : "+this.getNomeCompleto());
		System.out.println("A idade do cliente é : "+this.idade);
		System.out.println("O sexo do cliente é  : "+this.sexo );
		System.out.print( "O cpf cadastrado é :"+this.getCPFcadastrado());

	}

		
	}


