

import java.util.Scanner;

public class AnoInicial {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int ano1,ano2,i = 1, b = 0;
		
		System.out.println("Digite o ano inicial: ");
		ano1 = in.nextInt();
		
		System.out.println("Digite o ano final: ");
		ano2 = in.nextInt();
		
		while(i < ano2 - ano1) {
			if (i % 4 == 0) {
				b++;
				System.out.println(i + ano1 + " É um ano bissexto");
			}
			i++;
			
		}
		System.out.println("Anos bissextos: " + b);
		

	}

}
