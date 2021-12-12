
package LacoRepeticao;

import java.util.Scanner;

public class soma5 {
	
	public static void main (String[]args){
		int x,soma=0;
		
		System.out.println("Digite um número  : ");
		Scanner receber1 = new Scanner(System.in);
		x =receber1.nextInt();
		
		do {
			
			soma = soma + x;
			x = x -1;
			
		}while(x>0);
		
		System.out.println("A soma é igual a  : "+soma);
		
		
		
		
	}
	

}
