package Introdução;

import java.util.Scanner;

public class Mediaalunos {

	public static void main (String[]args) {
		
		float a,b,c , media_ponderada, p1 , p2 , p3,soma_das_notas;
		
		
		
		System.out.println("escreva a nota a do aluno : ");
		Scanner receber1 = new Scanner(System.in);
		a = receber1.nextFloat();
        System.out.println("escreva a nota b do aluno :  ");
        Scanner receber2 = new Scanner(System.in);
		b = receber2.nextFloat();
        System.out.println("escreva a nota c do aluno : ");
        Scanner receber3 = new Scanner(System.in);
        c = receber3.nextFloat();
        		
        		
       
          p1 = 2;
          
          p2 = 3;
          p3 = 5;
         
          
          soma_das_notas= a*p1+b*p2+c*p3;
          media_ponderada = soma_das_notas/10;
          System.out.println("A média ponderada é igual :  "+media_ponderada);
		
	}
}
