package Matriz;

import java.util.Scanner;

public class elementmat {
	
	
	public static void main (String[]args){
		
		
		int N1[][] = new int[4][6],linha,coluna; int N2[][] = new int[4][6],linha1,coluna1; int M1[][] = new int[4][6]; int M2[][] = new int[4][6]; 
		
		
		for(linha=0; linha < 4;linha++) {
			
			for(coluna=0; coluna < 6;coluna++) {
			
			System.out.println("Digite um número para linha e coluna : ");
			Scanner entrada1 = new Scanner(System.in);
			N1[linha][coluna]= entrada1.nextInt();
			
			}	
			
		}
			for(linha=0; linha < 4;linha++) {
				
				for(coluna=0; coluna < 6;coluna++) {
				
				System.out.println("Digite um número para linha1 e coluna2 : ");
				Scanner entrada2 = new Scanner(System.in);
				N2[linha][coluna]= entrada2.nextInt();
				
		}
	}
		
	
                for(linha=0; linha < 4;linha++) {
				
				for(coluna=0; coluna < 6;coluna++) {
				
				 
				M1[linha][coluna]= N2[linha][coluna]+N1[linha][coluna];
				 System.out.println("\n"+M1[linha][coluna]);

}
	}
                
                for(linha=0; linha < 4;linha++) {
    				
    				for(coluna=0; coluna < 6;coluna++) {
    				
    				 
    				M2[linha][coluna]= N2[linha][coluna]-N1[linha][coluna];
    				 System.out.println("\n"+M2[linha][coluna]);
               
	}
}

}
}