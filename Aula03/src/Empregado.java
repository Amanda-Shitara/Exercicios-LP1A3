
public class Empregado extends Pessoa {
	private int codigoSetor;
	protected int salarioBase;
	protected int imposto;
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public int getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}
	public int getImposto() {
		return imposto;
	}
	public void setImposto(int imposto) {
		this.imposto = imposto;
	}
	
	public Empregado (String nome, String endereco, String telefone, 
			int codigoSetor, int salarioBase, int imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	public void calcularSalario() {
		this.salarioBase -= this.salarioBase*this.imposto/100;
	}
	
}
/*
class Test
{
    public static void main(String args[])
    {
    	//Scanner scn = new Scanner(System.in);
		String nome = "abc";
		String endereco = "Rua X";
		String telefone = "111-111";
		
		int codigoSetor = 1;
		int salarioBase = 1000;
		int imposto = 10;
		
    	Empregado emp = new Empregado(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
  
        emp.calcularSalario();
        System.out.println("Novo Salario: "+emp.getSalarioBase());
    }
}
*/
 