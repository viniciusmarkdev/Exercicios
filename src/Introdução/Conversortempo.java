package Introdução;

import java.util.Scanner;

public class Conversortempo {
	public static void main (String[]args) {
	int segundos, horas, minutos,segundos_restantes;
	Scanner receber = new Scanner(System.in);
    System.out.println("Digite o tempo de duração de um evento em uma fábrica expressa em segundos :");
    segundos = receber.nextInt();
    horas = segundos/3600;
    minutos = (segundos% 3600)/60;
    segundos_restantes = (segundos % 3600)%60;
    System.out.println("O tempo de duração do evento em horas , minutos e segundos é igual a : "+horas+  "hora(s)" + minutos+  "minuto(s)"   +segundos_restantes+   "segundo(s)");
    
}
}