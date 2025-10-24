package dominio;

import java.util.Date;


public class FuncionarioFixo extends FuncionarioAbstrato {

	private double salario;
	
	public FuncionarioFixo(String nome, char sexo, String cpf, Date dataNasc, Endereco endereco, double salario){
		super(nome, sexo, cpf, dataNasc, endereco);
		setSalario(salario);
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double salarioBruto() {
		return salario;
	}
}
