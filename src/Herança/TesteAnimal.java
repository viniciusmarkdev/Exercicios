package Herança;

public class TesteAnimal {
	
	public  static  void  main ( String [] args ) {

		Cachorro c = new Cachorro("Alex",7);
		c.DeverCorrer();
		c.Emitirsom();
		c.status();
		
		Preguica p = new Preguica("Flash",9);
		
		
		
		p.Subir();
		p.Emitirsom();
		p.status();
		
		Cavalo Cav = new Cavalo("Alazão",17);
		Cav.DeverCorrer();
		Cav.Emitirsom();
		Cav.status();
	}
	
}