package LacoRepeticao;

import java.util.Scanner;

public class TestePs {
	
	public static void main (String[]args){
	
	int idade,sexo,estado,i=1,c=0,n=0,a=0,o=0,t=0,d=0;


	 
	    while(i>0 && i<=150) {
	    System.out.println("Digite sua idade  : ");
		Scanner receber1 = new Scanner(System.in);
		idade =receber1.nextInt();
		
		System.out.println("Digite seu sexo : ");
		Scanner receber2 = new Scanner(System.in);
		sexo =receber2.nextInt();
		
		System.out.println("Digite seu  estado emocional : ");
		Scanner receber3 = new Scanner(System.in);
		estado =receber3.nextInt();
		 
		i=i+1;
		
		if(estado ==1) {
			
			c=c+1;
			
		}
		
		if(sexo==1 && estado==2) {
		
			n=n+1;
		}
		
		if(sexo ==2 && estado==3) {
			
			a=a+1;
		}
		
		if(sexo ==3 && estado ==1) {
			
			o=o+1;
		}
		
        if(idade >40 && estado ==2) {
			
			t=t+1;
		}
        
        if(idade >0 && idade<18 &&estado==1) {
        	
        	d=d+1;
        }
	
		
}
	    
	    System.out.println("O numéro de pessoas calmas é : "+c);
	    System.out.println("O numéro de mulheres nervosas  é : "+n);
	    System.out.println("O numéro de homens agresivos : "+a);
	    System.out.println("O numéro de pessoas de outros generos que são: "+o);
	    System.out.println("O numéro de pessoas nervosas com mais de 40 anos é : "+t);
	    System.out.println("O numéro de pessoas calmas com menos de 18 : "+d);
	  
	    
	   
	    
	}
}
	    