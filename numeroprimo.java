
public class numeroprimo {
	

	    // Função para verificar se um número é primo
	    public static boolean ehPrimo(int n) {
	      
	    	if (n < 2) return false;

	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {

	        // Vetor de exemplo
	        int[] A = {2, 3, 4, 5, 10, 13, 15, 17};

	        for (int elemento : A) {
	            if (ehPrimo(elemento)) {
	                System.out.println(elemento + " é primo.");
	            } else {
	                System.out.println(elemento + " NÃO é primo.");
	            }
	        }
	    }
	}

