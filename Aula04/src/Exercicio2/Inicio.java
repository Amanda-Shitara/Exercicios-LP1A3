package Exercicio2;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("+------------------+");
		System.out.println("|       MENU       |");
		System.out.println("+------------------+");
		System.out.println("| 1) Soma          |");
        System.out.println("| 2) Subtra��o     |");
        System.out.println("| 3) Multiplica��o |");
        System.out.println("| 4) Divis�o       |");
        System.out.println("+------------------+");
        
        System.out.println("Selecione uma op��o: ");
        int opcao = scn.nextInt();
        
        System.out.println("Digite o primeiro n�mero: ");
        int num1 = scn.nextInt();
        System.out.println("Digite o segundo n�mero: ");
        int num2 = scn.nextInt();
        
        OperacaoMatematica op;
        
        switch (opcao) {
            case 1: op = new Soma();
            	System.out.println("O resultado da SOMA �: " + op.calculaOperacao(num1, num2));
            	break;
            case 2: op = new Subtracao();
            	System.out.println("O resultado da SUBTRA��O �: " + op.calculaOperacao(num1, num2));
                break;
            case 3: op = new Multiplicacao();
    			System.out.println("O resultado da MULTIPLICA��O �: " + op.calculaOperacao(num1, num2));
                break;
            case 4: op = new Divisao();
            	System.out.println("O resultado da DIVIS�O �: " + op.calculaOperacao(num1, num2)); 
                break;
            default: 
            	System.out.println("Op��o inv�lida!");
        }
        
        scn.close();
	}
}
