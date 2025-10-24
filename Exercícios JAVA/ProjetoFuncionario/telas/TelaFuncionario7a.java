package telas;

import java.util.Scanner;
import java.text.DecimalFormat;

import dominio.FuncionarioAbstrato;
import dominio.FuncionarioComissionado;
import dominio.FuncionarioFixo;
import dominio.FuncionarioHorista;

public class TelaFuncionario7a {
	private DecimalFormat df;
	Scanner in;
	
	public TelaFuncionario7a() {
    df  = new DecimalFormat(",##0.00");
	}
		
	public void mostrarDados(FuncionarioAbstrato f) {
	
		System.out.println();
		System.out.println("**********************************************");
		if (f instanceof FuncionarioFixo) {
		  System.out.println("Dados do Funcionario Fixo");
		}
		else if (f instanceof FuncionarioHorista) {
			System.out.println("Dados do Funcionario Horista");
		}
		else if (f instanceof FuncionarioComissionado) {
			System.out.println("Dados do Funcionario Comisssionado");
		}
		System.out.println("**********************************************");
		
		System.out.print("Nome: ");
		System.out.println(f.getNome());
		
		System.out.print("Sexo: ");
		System.out.println(f.getSexo());
		
		System.out.print("CPF: ");
		System.out.println(f.getCpf());

		System.out.println("-------------------------------");
		if (f instanceof FuncionarioFixo) {
			System.out.print("Salario Fixo      = ");
			System.out.printf("%10s\n", df.format(((FuncionarioFixo) f).getSalario()));
		}
		else if (f instanceof FuncionarioHorista) {
			System.out.print("Salario por Hora  = ");
			System.out.printf("%10s\n", df.format(((FuncionarioHorista) f).getSalarioPorHora()));
			System.out.print("Horas Trabalhadas = ");
			System.out.printf("%10s\n", df.format(((FuncionarioHorista) f).getHorasTrabalhadas()));
		}
		else if (f instanceof FuncionarioComissionado) {
			System.out.print("Valor das Vendas  = ");
			System.out.printf("%10s\n", df.format(((FuncionarioComissionado) f).getValorVendas()));
			System.out.print("Porc. Comissao    = ");
			System.out.printf("%10s\n", df.format(((FuncionarioComissionado) f).getPorcentagemComissao()));
			System.out.print("Valor da Comissao = ");
			System.out.printf("%10s\n", df.format(((FuncionarioComissionado) f).valorComissao()));
			System.out.print("Salario Base      = ");
			System.out.printf("%10s\n", df.format(((FuncionarioComissionado) f).getSalarioBase()));
		}
		System.out.print("Salario Bruto     = ");
		System.out.printf("%10s\n", df.format(f.salarioBruto()));
		
		System.out.print("INSS              = ");
		System.out.printf("%10s\n", df.format(f.valorINSS()));
		System.out.println("-------------------------------");
		
		System.out.print("Salario Base IR   = ");
		System.out.printf("%10s\n", df.format(f.salarioBaseIR()));
		
		System.out.print("IR                = ");
		System.out.printf("%10s\n", df.format(f.valorIR()));
		System.out.println("-------------------------------");
		
		System.out.print("Salario Liquido   = ");
		System.out.printf("%10s\n", df.format(f.salarioLiquido()));
		System.out.println("-------------------------------");
		
    System.out.println("Endereco:");
    if (f.getEndereco() != null) {
      System.out.println("Rua         : " + f.getEndereco().getRua());
      System.out.println("Numero      : " + f.getEndereco().getNumero());
      System.out.println("Complemento : " + f.getEndereco().getComplemento());
      System.out.println("Bairro      : " + f.getEndereco().getBairro());
    }
    else {
      System.out.println("Endereço não definido.");
    }
    
	}//mostrarDados()

}//TelaFuncionario7a.