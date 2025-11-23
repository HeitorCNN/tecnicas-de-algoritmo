import java.util.Scanner;

public class exerciciodois {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int TAM = 5;
		int a [], i,m;
		
		a = new int [TAM];
	
		for (i=0; i<TAM; i++) {
			System.out.println("digite o "+(i+1)+"valor do vetor a");
			a [i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("/ntabuada de "+  a[i] +" :  ");
			for(m = 1; m <=10; m++) {
				System.out.println(a[i] + " x " +m+" = " +(a[i]*m));
			}
		}
	}
}