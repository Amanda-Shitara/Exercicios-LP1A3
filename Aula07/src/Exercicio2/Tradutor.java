package Exercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tradutor {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		try {
			
			FileWriter fw = new FileWriter("teste.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			String linha;
			do {
				System.out.println("Digite uma linha do texto a ser traduzido: ");
				linha = scn.nextLine();
				bw.write(linha);
				bw.newLine();
			} while (linha.length()>0);
			bw.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			scn.close();
		}
		try {
			FileReader fr = new FileReader("teste.txt");
			BufferedReader br = new BufferedReader(fr);
			String linha;
			while ((linha = br.readLine()) != null) {
				linha = linha.replace("L", "U");
				linha = linha.replace("l", "u");
				linha = linha.replace("R", "");
				linha = linha.replace("r", "");
				System.out.println(linha);
			}
			br.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
