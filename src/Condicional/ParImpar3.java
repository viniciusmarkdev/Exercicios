package Condicional;

import java.util.Scanner;

import java.lang.Math;

public class ParImpar3{
	
	public static void main (String[]args){
		
		float a ;
		System.out.println("Digite sua idade : ");
		Scanner numero = new Scanner(System.in);
		a = numero.nextInt();
		
		if(a%2 == 0) {
			
			System.out.println("O numero "+a+"é par e sua raiz quadrada é "+Math.sqrt(a));
			
			
		}
		
		else {
			
			System.out.println("O numero "+a+"é impar e seu quadrado é "+(a*a));
			
		}
	}

}
