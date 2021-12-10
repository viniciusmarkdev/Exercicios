package Condicional;

import java.util.Scanner;

public class OrdemCrescente2{

	public static void main (String[]args)
	{
		int a,b,c;
		
		System.out.println("Digite um numero inteiro a  : ");
		Scanner receber1 = new Scanner(System.in);
		a = receber1.nextInt();
		System.out.println("Digite um numero inteiro b  : ");
		Scanner receber2 = new Scanner(System.in);
		b = receber2.nextInt();   
		System.out.println("Digite um numero inteiro c  : ");
		Scanner receber3 = new Scanner(System.in);
		c = receber3.nextInt();

		
		if (a >b && a>c && b>c)
		{
			
		System.out.println("Os numeros em ordem crescente  é  igual a :  "+c+","+b+","+a);
		}
		if(a <b && a<c && b<c) {
			

			
			System.out.println("Os numeros em ordem crescente  é  igual a :  "+a+","+b+","+c);
		}
		

		if (b>a && b>c && a>c)
		{

			System.out.println("Os numeros em ordem crescente  é  igual a :  "+c+","+a+","+b);
		}
		if (a<b && a<c && b>c){
		
			System.out.println("Os numeros em ordem crescente  é  igual a :  "+a+","+c+","+b);
		}
		
		if (a<c && a>b && b<c){
			
			System.out.println("Os numeros em ordem crescente  é  igual a :  "+b+","+a+","+c);
			
		}
			
		if (a>c && a>b && b<c) {
				
			System.out.println("Os numeros em ordem crescente  é  igual a :  "+b+","+c+","+a);
	}
}

}
