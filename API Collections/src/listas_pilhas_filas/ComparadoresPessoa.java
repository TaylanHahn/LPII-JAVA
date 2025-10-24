package listas_pilhas_filas;

import java.util.Comparator;

import dominio.Pessoa;

public class ComparadoresPessoa {

  public static class Idade implements Comparator<Pessoa> {
  	public int compare(Pessoa p1, Pessoa p2) {
	  	if (p1.getIdade() < p2.getIdade())
		  	return -1;
		  else if (p1.getIdade() > p2.getIdade())
			  return 1;
		  else return 0;
	  }
  }
  
  public static class Peso implements Comparator<Pessoa> {
    public int compare(Pessoa p1, Pessoa p2) {
      if (p1.getPeso() < p2.getPeso())
        return -1;
      else if (p1.getPeso() > p2.getPeso())
        return 1;
      else return 0;
    }
  }
  
}