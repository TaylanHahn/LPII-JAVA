package listas_pilhas_filas;

import java.util.Comparator;

import dominio.Funcionario;

public class ComparadoresFuncionario {

  public static class Idade implements Comparator<Funcionario> {
  	public int compare(Funcionario f1, Funcionario f2) {
	  	if (f1.getIdade() < f2.getIdade())
		  	return -1;
		  else if (f1.getIdade() > f2.getIdade())
			  return 1;
		  else return 0;
	  }
  }
  
  public static class Peso implements Comparator<Funcionario> {
    public int compare(Funcionario f1, Funcionario f2) {
      if (f1.getPeso() < f2.getPeso())
        return -1;
      else if (f1.getPeso() > f2.getPeso())
        return 1;
      else return 0;
    }
  }
  
}