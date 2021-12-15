package Herança;

public class Animal {
	
private	String Nome;
private int Idade;




private boolean Som;
private boolean Medo;


public Animal(String nome, int idade, boolean som,boolean medo) {
        Nome = nome;
        Idade = idade;
        Som = som; 
        Medo = medo;
}

public String getNome() {
	return Nome;
}





public void setNome(String nome) {
	Nome = nome;
}





public int getIdade() {
	return Idade;
}





public void setIdade(int idade) {
	Idade = idade;
}





public boolean getSom() {
	return Som;
}





public void setSom(boolean som) {
	Som = som;
}





public boolean getMedo() {
	return Medo;
}





public void setMedo(boolean medo) {
	Medo = medo;
}        		
        

public void Sentirmedo() {
	if(Som = true)
		System.out.println("O animal emitiu um som ! ");
    if (Som = false)
			System.out.println("O animal não emitiu um som !");
		
			
		}


public boolean Correr() {
	if(Medo =true) 
		System.out.println("O animal correu , pois estava com medo  ");
	else{
	System.out.println("O animal não correu, pois não estava com medo ");
	}
	return Medo;
	
}

	public void status() {
		System.out.println("O nome do animal é: "+getNome());
		System.out.println("A idade do animal é : "+getIdade());
	
			
		
	
}
}
