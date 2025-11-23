import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        int a[],i,d,num,contador;
        final int TAM = 10;
		
		a = new int [TAM];

        Scanner in = new Scanner(System.in);
        
        a = new int[10];

        for (i = 0; i < a.length; i++) {
            System.out.print("Digite o elemento A[" + i + "]: ");
            a[i] = in.nextInt();
        }

        for (i = 0; i < a.length; i++) {
            num = a[i];
            contador = 0;

            for (d = 1; d <= num; d++) {
                if (num % d == 0) {
                    contador++;
                }
            }

            System.out.print("A[" + i + "] = " + num + " -> ");

            if (contador == 2) {
                System.out.println("É primo");
            } else {
                System.out.println("Não é primo");
            }
        }

    }
}
