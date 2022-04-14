
public class Operario extends Empregado {
	private int valorProducao;
	private int comissao;
	private int novoSalario;
	
	public int getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(int valorProducao) {
		this.valorProducao = valorProducao;
	}
	public int getComissao() {
		return comissao;
	}
	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	public int getNovoSalario() {
		return novoSalario;
	}
	public void setNovoSalario(int novoSalario) {
		this.novoSalario = novoSalario;
	}
	
	public Operario (String nome, String endereco, String telefone, 
			int codigoSetor, int salarioBase, int imposto, int valorProducao, int comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	public void calcularSalario(int novoSalario) {
		this.novoSalario = novoSalario;
		this.comissao = this.valorProducao*this.comissao/100;
		this.novoSalario += this.comissao;
	}

}
