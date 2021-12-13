package Matriz;

import java.util.Scanner;

public class Matriz3x3 {
	
	public static void main (String[]args){
		
		int mat[][]= new int[3][3],linha,coluna, soma= 0,soma_da_diagonal;
		
		for(linha=0;linha<3;linha++) {
			
			for(coluna = 0;coluna<3;coluna++) {
			
			
			
			
			System.out.println("digite um  número  : ");
			Scanner receber = new Scanner(System.in);
			mat[linha][coluna]= receber.nextInt();
			}
		}
			
		for(linha = 0;linha<3;linha++) {
		
			for(coluna = 0;coluna<3;coluna++) {
				
				System.out.println(mat[linha][coluna]);
				soma = soma + mat[linha][coluna];
			}
				
			}
		System.out.println("digite um  número  : " +soma);
		soma_da_diagonal = mat[0][0]+mat[1][1]+mat[2][2];
		System.out.println("A soma da diagonal  é igual a  : " +soma_da_diagonal);
		}
	
		
	
	}
			




