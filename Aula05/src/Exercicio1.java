import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main( String args[] ) {
		
		int result, y;
		int[] list = new int[4];
		int x=10;
		Scanner scanner = new Scanner( System.in ); // scanner para entrada 
		try {
			System.out.print("Digite um denominador inteiro: ");
			y = scanner.nextInt();
			result = x/y;
			System.out.printf("Resultado: %d / %d = %d\n", x, y, result);
			list[result]=result;
			
		} catch (InputMismatchException e) {
			System.out.println(e);
			System.out.println("O elemento informado não é um número!");
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("O denominador não pode ser zero!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("O índice resultante não existe!");
		}
		
		finally {
			scanner.close();
		}
		
	} // fim de main
} // fim da classe
