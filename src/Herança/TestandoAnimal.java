package Herança;

public class TestandoAnimal {
	
	public static void main (String[]args){
		
		 Cachorro cachorro1= new Cachorro("BOB",7);
		 cachorro1.Emitirsom();
		 cachorro1.status();
		 cachorro1.DeverCorrer();
		 Cavalo c = new Cavalo("Gilbeto",24);
		 c.status();
		 c.Devecorrer();
		 c.Emitirsom();
		 
		 Preguica p = new Preguica("Flash", 14);
		
		 p.Subir();
		 p.status();
		 p.Emitirsom();
	
		
	}
}
