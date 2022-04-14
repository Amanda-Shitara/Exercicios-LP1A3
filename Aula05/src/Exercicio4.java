import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		posicionaVetor[] vetor = new posicionaVetor[3];
		Scanner scanner = new Scanner( System.in );
		int count = 0;
		
		do {
			try {
				System.out.print("Digite um número inteiro: ");
				int x = scanner.nextInt();
				System.out.print("Digite uma string: ");
				String y = scanner.next();
				
				vetor[count] = new posicionaVetor(x, y);
				
				count++;
			}
			catch (InputMismatchException e) {
				System.out.println(e);
				System.out.println("O elemento informado é inválido!");
				System.exit(0);
			}
		}while(count < 3);
		
		for (int i=0; i<3; i++) {
			System.out.println("\nVetor[" + i + "]");
			vetor[i].display();
		}		
		
		scanner.close();
	}

}

class posicionaVetor {
	public int x;
	public String y;
	
	posicionaVetor(int x, String y) {
        this.x = x;
        this.y = y;
    }
	
	public void display() {
        System.out.println("Int: " + x + "\nString: "+ y);
    }
	
}
