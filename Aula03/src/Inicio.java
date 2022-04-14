import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String nome = "abc";
		String endereco = "Rua X";
		String telefone = "111-111";
		
		int valorCredito = 7000;
		int valorDivida = 2000;
		
		int codigoSetor = 0;
		int salarioBase = 0;
		int imposto = 0;
		int ajudaDeCusto = 0;
		
		int valorProducao = 1000;
		int valorVendas = 2000;
		int comissao = 0;

		Pessoa p = new Pessoa(nome, endereco, telefone);
		p = new Pessoa(nome, endereco, telefone);
		
		Fornecedor f = new Fornecedor(nome, endereco, telefone, valorCredito, valorDivida);
		f = new Fornecedor(nome, endereco, telefone, valorCredito, valorDivida);
		
		Empregado e = new Empregado(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		e = new Empregado(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		
		Administrador a = new Administrador(nome, endereco, telefone, codigoSetor, salarioBase, imposto, ajudaDeCusto);
		a = new Administrador(nome, endereco, telefone, codigoSetor, salarioBase, imposto, ajudaDeCusto);
		
		Operario o = new Operario(nome, endereco, telefone, codigoSetor, salarioBase, imposto, valorProducao, comissao);
		o = new Operario(nome, endereco, telefone, codigoSetor, salarioBase, imposto, valorProducao, comissao);
		
		Vendedor v = new Vendedor(nome, endereco, telefone, codigoSetor, salarioBase, imposto, valorVendas, comissao);
		v = new Vendedor(nome, endereco, telefone, codigoSetor, salarioBase, imposto, valorVendas, comissao);
		
		System.out.println("PESSOA");
		p.setNome(nome);
		p.setEndereço(endereco);
		p.setTelefone(telefone);
		
		System.out.println("\nFORNECEDOR");
		System.out.println("Saldo: " + f.obterSaldo(valorCredito, valorDivida));
		
		System.out.println("\nEMPREGADO");
		System.out.print("Insira código do setor: ");
	    e.setCodigoSetor(scn.nextInt());
		
		System.out.print("Insira o salário base: ");
	    e.setSalarioBase(scn.nextInt());
	    
	    System.out.print("Insira o percentual de imposto (%): ");
	    e.setImposto(scn.nextInt());
	    
	    e.calcularSalario();
	    System.out.println("Salario: "+e.getSalarioBase());
		
	    System.out.println("\nADMINISTRADOR");
	    System.out.print("Insira o valor das ajudas de custo: ");
	    a.setAjudaDeCusto(scn.nextInt());
		
		a.calcularSalario(e.getSalarioBase());
	    System.out.println("Novo Salario: "+a.getNovoSalario());
	    
	    System.out.println("\nOPERÁRIO");
	    System.out.print("Insira o percentual de comissão sobre produção (%): ");
	    o.setComissao(scn.nextInt());
	    
	    o.calcularSalario(e.getSalarioBase());
	    System.out.println("Novo Salario: "+o.getNovoSalario());
	    
	    System.out.println("\nVENDEDOR");
	    System.out.print("Insira o percentual de comissão de vendas (%): ");
	    v.setComissao(scn.nextInt());
	    
	    v.calcularSalario(e.getSalarioBase());
	    System.out.println("Novo Salario: "+v.getNovoSalario());
	    
	    scn.close();
	}
		
}
