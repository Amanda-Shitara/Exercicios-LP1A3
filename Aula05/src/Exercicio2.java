
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
		System.out.println("Ap�s o tratamento de excecoes...");
	}
}

/*
 * A exce��o "java.lang.ArrayIndexOutOfBoundsException" ocorreu porque o �ndice 100 n�o existe
 * no vetor[100], j� que os �ndices v�o de 0..99
 */
