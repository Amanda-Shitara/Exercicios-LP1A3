
public class Pessoa {
	private String nome;
	private String endereco; 
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("Nome: " + this.nome);
	}
	public String getEndere�o() {
		return endereco;
	}
	public void setEndere�o(String endereco) {
		this.endereco = endereco;
		System.out.println("Endere�o: " + this.endereco);
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
		System.out.println("Telefone: " + this.telefone);
	}
	
	public Pessoa (String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

}