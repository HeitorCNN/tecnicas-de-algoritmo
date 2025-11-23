import java.util.Scanner;


public class exercicio4 {
		
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			
			final int TAM = 10;
			int a [], i,num;
			
			a = new int [TAM];
		
			for (i=0; i<TAM; i++) {
				System.out.println("digite o "+(i+1)+"º valor do vetor a");
				a [i] = in.nextInt();
			}
			
			for(i = 0; i <TAM; i++){
	            System.out.println("Elemento a : " + i + " = " + a[i]);
	            
	            System.out.print("Pares de 0 até " + a[i] + ": ");
	            
	            for( num = 0; num <= a[i]; num++){
	                if(num % 2 == 0){
	                    System.out.print(num + " ");
	                }
	            }
			}
	}

}
