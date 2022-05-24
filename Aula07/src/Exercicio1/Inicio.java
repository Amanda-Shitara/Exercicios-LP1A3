package Exercicio1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Inicio {

	public static void main(String[] args) throws ClassNotFoundException {
		Disciplinas dis = new Disciplinas("LG1", 111, 100);
		try {
			FileOutputStream arq = new FileOutputStream("disciplina.dat");
			ObjectOutputStream objarq = new ObjectOutputStream(arq);
			objarq.writeObject(dis);
			objarq.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		Disciplinas dis1 = null;
		try {
			FileInputStream arq = new FileInputStream("disciplina.dat");
			ObjectInputStream objarq = new ObjectInputStream(arq);
			dis1 = (Disciplinas) objarq.readObject();
			System.out.println("Nome da Disciplina: " + dis1.getNome());
			System.out.println("Código: " + dis1.getCodigo());
			System.out.println("Carga Horária: " + dis1.getCargaHoraria());
			objarq.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	
	}
}
