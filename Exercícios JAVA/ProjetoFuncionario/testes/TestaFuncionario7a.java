package testes;

import telas.TelaFuncionario7a;
import dominio.Endereco;
import dominio.FuncionarioAbstrato;
import dominio.FuncionarioComissionado;
import dominio.FuncionarioFixo;
import dominio.FuncionarioHorista;

public class TestaFuncionario7a {

	public static void main(String[] args) {
	    FuncionarioAbstrato f1, f2, f3;
		  
		  Endereco e;
		  
		  e= new Endereco("Rua Abc", 100, "", "Centro");
			f1 = new FuncionarioFixo("Joao", 'M', "111.111.111-11", null, e, 1000);
			
			e= new Endereco("Rua Xyz", 200, "apto 201", "Sul");
			f2 = new FuncionarioComissionado("Maria", 'F', "222.222.222-22", null, e, 1000, 20000, 0.1f);
			
      //e= new Endereco("Rua Numero 1", 100, "Casa 4", "Norte");
      e = null; //Passando um Endereco null para testar.
      f3 = new FuncionarioHorista("Carla", 'F', "333.333.333-33", null, e, 100, 50);

	    TelaFuncionario7a tela = new TelaFuncionario7a();
			tela.mostrarDados(f1);
			tela.mostrarDados(f2);
			tela.mostrarDados(f3);

	}//main()

}//TestaFuncionario7a.