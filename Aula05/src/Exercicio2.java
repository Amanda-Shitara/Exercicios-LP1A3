
public class Exercicio2 {
	
	public static void main (String [] args) {
		
		try {
			int vetor[] = new int[100];
			vetor[100] = 1;
			System.out.println("Dentro do bloco try...");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Ocorreu a excecao: " + e);
		}
		System.out.println("Após o tratamento de excecoes...");
	}
}

/*
 * A exceção "java.lang.ArrayIndexOutOfBoundsException" ocorreu porque o índice 100 não existe
 * no vetor[100], já que os índices vão de 0..99
 */
