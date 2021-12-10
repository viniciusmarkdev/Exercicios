package Condicional;

import java.util.Scanner;

public class FaixaEtaria2 {
	
	public static void main (String[]args){
		
		int a;
		System.out.println("Digite sua idade : ");
		Scanner idade = new Scanner(System.in);
		a = idade.nextInt();
		
		if(a>=10 && a<=14) {
		System.out.println("Você se encontra na categoria infantil: ");
		

		}
		
		if(a>=15 && a<=17) {
			
		System.out.println("Você se encontra na categoria juvenil: ");
		}
		
		if(a>=18 && a<=25) {
		
			System.out.println("Você se encontra na categoria adulto: ");
	}

}
	
}
