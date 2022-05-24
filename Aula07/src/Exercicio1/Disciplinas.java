package Exercicio1;

import java.io.Serializable;

public class Disciplinas implements Serializable {
	
	private String nome;
	private int codigo;
	private int cargaHoraria;
	
	public Disciplinas(String nome, int codigo, int cargaHoraria) {
		this.nome = nome;
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
}
