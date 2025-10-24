package dominio;

import java.util.Date;

public class FuncionarioComissionado extends FuncionarioAbstrato{

	private double salarioBase;
	private double valorVendas;
	private double porcentagemComissao;

	public FuncionarioComissionado(String nome, char sexo, String cpf, Date dataNasc, Endereco endereco, double sal_base, double valor_vendas, double porcent){
		super(nome, sexo, cpf, dataNasc, endereco);
		setSalarioBase(sal_base);
		setValorVendas(valor_vendas);
		setPorcentagemComissao(porcent);
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getPorcentagemComissao() {
		return porcentagemComissao;
	}

	public void setPorcentagemComissao(double porcentagemComissao) {
		this.porcentagemComissao = porcentagemComissao;
	}
	
	public double valorComissao() {
		return valorVendas * porcentagemComissao;
	}
	
	public double salarioBruto() {
		return salarioBase + valorComissao();
	}

}//FuncionarioComissionado.