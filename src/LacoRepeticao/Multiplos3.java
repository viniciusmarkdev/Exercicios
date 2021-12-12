package LacoRepeticao;

import java.util.Scanner;

public class Multiplos3 {
	
	public static void main (String[]args)
	{
		
		int a, soma = 0,b, media,i=0;
		
		
		do {
			
			System.out.println("Digite um numero inteiro a  : ");
			Scanner receber1 = new Scanner(System.in);
			a = receber1.nextInt();
			
			if (a%3==0) {
				
				soma = a+soma;
				i=i+1;
			}
			
			System.out.println("Digite um numero inteiro b : ");
			Scanner receber2 = new Scanner(System.in);
			b=receber2.nextInt();
			
		
			
		}while(b!=0);
		
		media = soma/i;
		System.out.println("A soma  dos números multiplos de 3 é igual :"+soma+" e a media é igual a :"+media );
		
		
	}
	
}
