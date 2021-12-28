package POOintrodução;

public class ObjetoAvião {
	
	public static void main(String[] args) {
		
		Avião avião = new Avião("Branco","Airbus360",34);
		avião.ligar();
		avião.abastecer();
		avião.decolagem();
		avião.status();
		
	}

}
