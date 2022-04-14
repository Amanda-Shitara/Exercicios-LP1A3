import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		double a, b, c;
		Scanner scanner = new Scanner( System.in );
		
		try {
			System.out.print("Digite o primeiro valor: ");
			b = scanner.nextInt();
			System.out.print("Digite o segundo valor: ");
			c = scanner.nextInt();
			a = Math.pow(b, 2) + Math.pow(c, 2);
			a = Math.sqrt(a);
			System.out.println("Resultado: " + a);
		} 
		catch (InputMismatchException e) {
			System.out.println(e);
			System.out.println("O elemento informado não é um número!");
		} 
		finally {
			scanner.close();
		}

	}

}
