package Exercicio2;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("+------------------+");
		System.out.println("|       MENU       |");
		System.out.println("+------------------+");
		System.out.println("| 1) Soma          |");
        System.out.println("| 2) Subtração     |");
        System.out.println("| 3) Multiplicação |");
        System.out.println("| 4) Divisão       |");
        System.out.println("+------------------+");
        
        System.out.println("Selecione uma opção: ");
        int opcao = scn.nextInt();
        
        System.out.println("Digite o primeiro número: ");
        int num1 = scn.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scn.nextInt();
        
        OperacaoMatematica op;
        
        switch (opcao) {
            case 1: op = new Soma();
            	System.out.println("O resultado da SOMA é: " + op.calculaOperacao(num1, num2));
            	break;
            case 2: op = new Subtracao();
            	System.out.println("O resultado da SUBTRAÇÃO é: " + op.calculaOperacao(num1, num2));
                break;
            case 3: op = new Multiplicacao();
    			System.out.println("O resultado da MULTIPLICAÇÃO é: " + op.calculaOperacao(num1, num2));
                break;
            case 4: op = new Divisao();
            	System.out.println("O resultado da DIVISÃO é: " + op.calculaOperacao(num1, num2)); 
                break;
            default: 
            	System.out.println("Opção inválida!");
        }
        
        scn.close();
	}
}
