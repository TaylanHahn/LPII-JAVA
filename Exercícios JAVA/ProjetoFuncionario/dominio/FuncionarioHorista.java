package dominio;

import java.util.Date;


public class FuncionarioHorista extends FuncionarioAbstrato {

	private double horasTrabalhadas;
	private double salarioPorHora;
	
	public FuncionarioHorista(String nome, char sexo, String cpf, Date dataNasc, Endereco endereco, double salario_por_hora, double horas_trab){
		super(nome, sexo, cpf, dataNasc, endereco);
		setSalarioPorHora(salario_por_hora);
		setHorasTrabalhadas(horas_trab);
	}
	
	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

	public double salarioBruto(){
		return horasTrabalhadas * salarioPorHora;
	}
	
}//FuncionarioHorista.