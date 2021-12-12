package LacoRepeticao;

import java.util.Scanner;

public class Idade {
	
	
	public static void main (String[]args){
		
		
    int idade = 0 ,i=0,v=0;
	
    while(idade>-99){
	
    System.out.println("Digite um numero inteiro a  : ");
	Scanner receber1 = new Scanner(System.in);
	idade =receber1.nextInt();
	
    
	if(idade<21)
		
		
		i = (i + 1);
	
	
	if(idade>50)
		
		v=v+1;
	}
    System.out.println("A quantidade de pessoas idade menor que 21 anos é"+(i-1));
    System.out.println("A quantidade de pessoas idade maior que 50 anoS é"+(v-1));
	}
				
}
	
