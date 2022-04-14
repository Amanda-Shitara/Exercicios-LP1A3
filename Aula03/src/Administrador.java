
public class Administrador extends Empregado {
	private int ajudaDeCusto;
	private int novoSalario;

	public int getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	public void setAjudaDeCusto(int ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	public int getNovoSalario() {
		return novoSalario;
	}
	public void setNovoSalario(int novoSalario) {
		this.novoSalario = novoSalario;
	}
	
	public Administrador (String nome, String endereco, String telefone, 
			int codigoSetor, int salarioBase, int imposto, int ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public void calcularSalario(int novoSalario) {
		this.novoSalario = novoSalario;
		this.novoSalario += this.ajudaDeCusto;
	}
	

}
