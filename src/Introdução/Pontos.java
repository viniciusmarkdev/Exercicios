package Introdução;

import java.lang.Math;

import java.util.Scanner;

public class Pontos {
	
	public static void main (String[]args){
		float x1,x2,y1,y2,d,sub_pontox,sub_pontosy,radicando;
		
		System.out.println("Digite x1 : ");
		Scanner receber1 = new Scanner(System.in);
		 x1 = receber1.nextFloat();

		System.out.println("Digite x2 : ");
		Scanner receber2 = new Scanner(System.in);
		x2 = receber1.nextFloat();
		
		System.out.println("Digite y1: ");
		Scanner receber3 = new Scanner(System.in);
		y1 = receber3.nextFloat();
		
		System.out.println("Digite y2: ");
		Scanner receber4 = new Scanner(System.in);
		y2 = receber4.nextFloat();
		
		sub_pontox=(x2-x1)*(x2-x1);
	    sub_pontosy=(y2-y1)*(y2-y1);
	    
	    radicando = sub_pontox +  sub_pontosy;
	    
	    System.out.println("A raiz quadrada de"+radicando+"é igual a :" +Math.sqrt(radicando));
	    		
			
	}

}
