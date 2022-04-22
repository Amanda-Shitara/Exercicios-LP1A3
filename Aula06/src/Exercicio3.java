import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase = scn.nextLine();
		
		Map<String, Integer> mapa = new HashMap<String, Integer>();
		
		String[] palavras = frase.split(" ");
		for (String palavra : palavras) {
			if (mapa.containsKey(palavra))
				mapa.put(palavra, mapa.get(palavra) + 1);
			else
				mapa.put(palavra, 1);
		}
		System.out.println(mapa);
		scn.close();
	}

}
