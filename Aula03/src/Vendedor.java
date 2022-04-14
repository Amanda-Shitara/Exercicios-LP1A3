
public class Vendedor extends Empregado {
	private int valorVendas;
	private int comissao;
	private int novoSalario;
	
	public int getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(int valorVendas) {
		this.valorVendas = valorVendas;
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
	
	public Vendedor (String nome, String endereco, String telefone, 
			int codigoSetor, int salarioBase, int imposto, int valorVendas, int comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	public void calcularSalario(int novoSalario) {
		this.novoSalario = novoSalario;
		this.comissao = this.valorVendas*this.comissao/100;
		this.novoSalario += this.comissao;
	}
	

}
