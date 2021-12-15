package Herança;

public class TestandoAnimal {
	
	public static void main (String[]args){
		
		 Animal Cachorro2= new Animal ("BOB",7,true,true);
		 Animal Cavalo1 = new Animal("Gilbert",23,false,false);
		 Animal preguica1= new Preguica("Norma",22,true,true,true);
	     System.out.println(Cavalo1.status());
	     
         Cavalo1.Correr();
         Cavalo1.Sentirmedo();

}
}	