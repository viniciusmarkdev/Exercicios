package Herança;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
		
		public  void  DeverCorrer () {

			   System.out.println ( " O Cavalo corre" );
	}
		 public void Emitirsom() {
				
			   System.out.println("Relincha");
	
}
}