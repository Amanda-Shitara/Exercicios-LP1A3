package Exercicio1;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Digite o comprimento do quadrado: ");
		int comprimento = scn.nextInt();
		System.out.print("Digite a altura do quadrado: ");
		int altura = scn.nextInt();
		
		Area area = new Area();
		System.out.println("A área do quadrado é " + area.calculaArea(comprimento, altura));
		
		scn.close();
	}

}
