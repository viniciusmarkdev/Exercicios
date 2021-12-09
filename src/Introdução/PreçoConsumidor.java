package Introdução;

import java.util.Scanner;

public class PreçoConsumidor {
	public static void main (String[]args){
		float cust_cons,cust_fabrica;
		System.out.println("Digite o custo de fabrica : ");
		Scanner receber1 = new Scanner(System.in);
	    cust_fabrica = receber1.nextFloat();
	    cust_cons = (float) (cust_fabrica * (1.73));
	    System.out.println("O custo do consumidor será  de : "+cust_cons);
	    
	    
	    
	}

}
