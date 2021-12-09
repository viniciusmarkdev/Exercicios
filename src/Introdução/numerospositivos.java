package Introdução;

import java.util.Scanner;

public class numerospositivos {
	public static void main (String[]args) {
		
		int a , b ,c , d,r,s;
		Scanner receber1 = new Scanner(System.in);
		System.out.println("Digite um número inteiro e positivo a : ");
		a = receber1.nextInt();
		Scanner receber2 = new Scanner(System.in);
	    System.out.println("Digite um número inteiro e positivo b : ");
		b = receber2.nextInt();
		Scanner receber3 = new Scanner(System.in);
	    System.out.println("Digite um número inteiro e positivo c : ");
		c = receber3.nextInt();
		r =(a+b)*(a+b);
	    s =(b+c)*(b+c);
		d = (r+s)/2;
		
		System.out.println("O resultado de 'd' é : "+d);
		
				
		
		
		
		
	}

}
