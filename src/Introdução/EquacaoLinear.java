package Introdução;

import java.util.Scanner;

public class EquacaoLinear {
	public static void main (String[]args){
		
		float a,b,c,d,e,f ,x , y;
		
		System.out.println("Digite o valor  a : ");
		Scanner receber1 = new Scanner(System.in);
		a = receber1.nextFloat();
		System.out.println("Digite o valor  b : ");
		Scanner receber2 = new Scanner(System.in);
		b = receber2.nextFloat();
		
		System.out.println("Digite o valor  c : ");
		Scanner receber3 = new Scanner(System.in);
		c = receber3.nextFloat();
		
		System.out.println("Digite o valor  c : ");
		Scanner receber4 = new Scanner(System.in);
		d = receber4.nextFloat();
		
		System.out.println("Digite o valor  c : ");
		Scanner receber5 = new Scanner(System.in);
		e = receber5.nextFloat();
		
		System.out.println("Digite o valor  c : ");
		Scanner receber6 = new Scanner(System.in);
		f = receber6.nextFloat();
		
		x = (c*e-  b*f) / (a*e-b*d);
		y = (a*f - c*d) / (a*e- b*d);
		
		System.out.println("O valor de x e y  é , respectivamente : "+x+"e"+y);
		
		
	}
}
