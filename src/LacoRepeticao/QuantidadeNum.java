package LacoRepeticao;

import java.util.Scanner;

public class QuantidadeNum {
	
	public static void main (String[]args){
		
		int a, x,i=0,p=0;
		
		for(x=1;x<=10;x++) {
			
			
			
			System.out.println("Digite um numero inteiro a  : ");
			Scanner receber1 = new Scanner(System.in);
			a = receber1.nextInt();
			
			
			if(a%2==0) {
			
				p=p+1;
					
					
			}
			if (a%2!=0){
				
				i = i+1;
				
			}
					
			
		}
		
		System.out.println("A quantidade de numeros pares é igual  a : "+p);		
		System.out.println("A quantidade de numeros impares  é igual a  : "+i);
		
	}

}

