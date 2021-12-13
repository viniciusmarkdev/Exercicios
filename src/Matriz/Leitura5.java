package Matriz;

import java.util.Scanner;

public class Leitura5 {
	
	public static void main (String[]args){

		int vet[]= new int [5] , maior= 0,x,pontuação;
	
		for(x=0;x<5;x++){	
			
			System.out.println("Digite uma pontuação : ");
			Scanner receber = new Scanner(System.in);
			vet[x]= receber.nextInt();
		}
		for(x=0;x<5;x++) {
			
		if(vet[x]>maior) {
			
			maior = vet[x];
		}
		
		
		
	}
		System.out.println("\t"+"O maior valor é "  +maior);	

}
}