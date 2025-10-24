package dominio;

import java.util.Date;

public abstract class FuncionarioAbstrato {

	//Atributos de Classe
	private static double limiteINSS = 900;

	//Constantes (atributos de classe e final).  
	public static final char MASCULINO = 'M';
	public static final char FEMININO  = 'F';

	//Atributos de Instancia
	private String nome;
	private char sexo;
	private String cpf;
	private Date dataNascimento;
	private Endereco endereco;

	//Declaração de método abstrato.
	public abstract double salarioBruto();
	
	//---------------------------------
	//Métodos construtores
	//---------------------------------
	
	//Para facilitar os testes, foi implementado este construtor.
	public FuncionarioAbstrato() {
		this.nome = "";
		this.sexo = '-';
		this.cpf = "";
		this.dataNascimento = null;
	}

	//Outro construtor.
	public FuncionarioAbstrato(String nome, char sexo, String cpf, Date dataNasc, Endereco endereco){
		this.setNome(nome);
		this.setSexo(sexo);
		this.setCpf(cpf);
		this.setDataNascimento(dataNasc);
		this.setEndereco(endereco);
	}

	//---------------------------------
	//Métodos de instância
	//---------------------------------
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		if ((sexo==MASCULINO) || (sexo==FEMININO)) {
			this.sexo = sexo;
		}
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNasc) {
		this.dataNascimento = dataNasc;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double txINSS(){
		double txInss;
		if(this.salarioBruto() <= 1000){
			txInss = 0.08f;
		}else if(salarioBruto() <= 2000 ){
			txInss = 0.09f;
		}else if(salarioBruto() <= 3000){
			txInss = 0.10f;
		}else{
			txInss = 0.11f;
		}
		return txInss;
	}

	public double valorINSS(){
		double valorInss;
		valorInss = salarioBruto() * txINSS();
		if(valorInss > limiteINSS){
			valorInss = limiteINSS;
		}
		return valorInss;
	}
	
	public float txIR(){
		float txIR;
		if(salarioBaseIR() <= 1000){
			txIR = 0.0f; 
		}else if(this.salarioBaseIR() <= 3000 ){
			txIR = 0.1f;
		}else if(this.salarioBaseIR() <= 5000){
			txIR = 0.2f;
		}else{
			txIR = 0.3f;
		}
		return txIR;
	}
	
	public double salarioBaseIR(){
		double salarioBaseIR;
		salarioBaseIR = this.salarioBruto() - valorINSS();
		return salarioBaseIR;
	}
	
	public double valorIR(){
		double valorIR = salarioBaseIR() * txIR();
		return valorIR;
	}

	public double salarioLiquido(){
		double salarioLiquido;
		salarioLiquido = salarioBruto() - valorINSS() - valorIR();
		return salarioLiquido;
	}

}//FuncionarioAbstrato.