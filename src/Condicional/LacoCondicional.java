package Condicional;

import java.util.Scanner;

public class LacoCondicional {

	public static void main (String[]args){
		int a , b ,c;
		System.out.println("Digite um numero inteiro a  : ");
		Scanner receber1 = new Scanner(System.in);
		a = receber1.nextInt();
		System.out.println("Digite um numero inteiro a  : ");
		Scanner receber2 = new Scanner(System.in);
		b = receber2.nextInt();
		System.out.println("Digite um numero inteiro a  : ");
		Scanner receber3 = new Scanner(System.in);
		c = receber3.nextInt();
		
		if (a >b && b >c) {
			
		System.out.println("O maior numero é  a  :  "+a );
			
		}
		
		if (b>a && a>c)
		
			System.out.println("O maior numero é  a  :  "+b );
		
		if  (c>b && b >a) {
			
			System.out.println("O maior numero é  a  :  "+ c);
		}
		 
		 
			 
			



	}

}
