import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercicio1_2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<String> abaixo_media = new ArrayList<String>();
		String nome;
		int nota1, nota2;
		double media, media_turma = 0;
		int aprov = 0, rec = 0, reprov = 0;
		System.out.print("Digite o nome do aluno: ");
		nome = scn.next();
				
		while (!nome.equals("fim")) {
			System.out.print("Digite primeira nota parcial (de 0 a 100): ");
			nota1 = scn.nextInt();
			System.out.print("Digite segunda nota parcial (de 0 a 100): ");
			nota2 = scn.nextInt();
			
			media = (double) (nota1 + nota2)/2;
			media_turma += media;
			
			Aluno al = new Aluno(nome, nota1, nota2, media);
			alunos.add(al);
			
			System.out.print("Digite o nome do aluno: ");
			nome = scn.next();
		}
		System.out.println();
		
		for (int i = 0; i < alunos.size(); i++) {
			System.out.printf("[%s, %d, %d]\n", alunos.get(i).nome, alunos.get(i).nota1, alunos.get(i).nota2);
			if (alunos.get(i).media >= 60)
				aprov++;
			else if (alunos.get(i).media >= 40 && alunos.get(i).media < 60)
				rec++;
			else
				reprov++;
			
			if (alunos.get(i).media < media_turma/alunos.size())
				abaixo_media.add(alunos.get(i).nome);
		}
		System.out.println("Média da turma: " + media_turma/alunos.size());
		System.out.println("Alunos aprovados: " + aprov);
		System.out.println("Alunos de recuperação: " + rec);
		System.out.println("Alunos reprovados: " + reprov);
		
		System.out.println("\nAlunos com notas abaixo da média da turma:");
		System.out.println(abaixo_media);
		
		String data;
		Map<String, String> datas = new HashMap<String, String>();
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println("Aluno: " + alunos.get(i).nome);
			System.out.println("Digite a data de nascimento: ");
			data = scn.next();
			
			datas.put(alunos.get(i).nome, data);
		}
		System.out.println(datas);
		
		System.out.println("Digite um nome: ");
		nome = scn.next();
		for (int i = 0; i < datas.size(); i++) {
			if (nome.equals(alunos.get(i).nome))
				System.out.println("Data de nascimento: " + datas.get(nome));
			else if (i == datas.size()-1)
				System.out.println("Aluno não encontrado");
		}	
		scn.close();

	}
}

class Aluno {
	int nota1, nota2;
	double media;
	String nome;
	
	Aluno(String nome, int nota1, int nota2, double media) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
	}
	
}
