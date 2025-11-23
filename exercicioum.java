import java.util.Scanner;

public class exercicioum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int TAM=20;
		
		int A[], B[], i;
		
		A = new int[TAM];
		B = new int[TAM];
		
		int p = 0;
		
		System.out.println("Digite 20 numeros:");
        for (i = 0; i < 20; i++) {
            A[i] = in.nextInt();
        }


        for (i = 0; i < 20; i++) {
            if (A[i] % 2 == 0) {
                B[p] = A[i];
                p++;
            }
        }

        for ( i = 0; i < 20; i++) {
            if (A[i] % 2 != 0) {
                B[p] = A[i];
                p++;
            }
        }


        System.out.println("Vetor B ");
        for (i = 0; i < 20; i++) {
        	
            System.out.print(B[i] + " ");
        }

	}

}
