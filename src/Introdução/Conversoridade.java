package Introdução;

import java.util.Scanner;

public class Conversoridade {
	public static void main (String[]args){
		int dia_total, anos , 	meses, dia;
		Scanner receber = new Scanner (System.in);	
		System.out.println("Digite sua idade em dias : ");
		dia= receber.nextInt();
		
		anos = (dia/365);
		meses = (dia % 365)	/31;
		dia_total= (dia%365)%31;
		
		
		
		System.out.println("A sua idade , em dias , convertida em  anos , meses e dia é igual a :"+anos+"anos(s) ,"+meses+"mes(es)"+dia_total+"dia(s)" );
		
		
	}
	
	
	
}