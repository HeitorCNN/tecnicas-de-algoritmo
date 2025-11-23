import java.util.Scanner;


public class AnoNascimento {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int idade,anonasc,anoatual;
		int i = 1;
		
		do {
			System.out.println("Digite ano de nascimento : ");
		    anonasc = in.nextInt();
			
		    System.out.println("Digite o ano atual : ");
			anoatual = in.nextInt();
			
			idade = anoatual-anonasc;
			
			System.out.println("Sua idade é : "+idade);
			
			System.out.println("deseja continuar ? 1-Continuar / 0-Sair");	
			i = in.nextInt();
		}while(i==1);
		
	}

}
