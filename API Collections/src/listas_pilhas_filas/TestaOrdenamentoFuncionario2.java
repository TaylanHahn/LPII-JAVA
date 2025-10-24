package listas_pilhas_filas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import listas_pilhas_filas.ComparadorPessoaIdade.Teste;
import dominio.Funcionario;

public class TestaOrdenamentoFuncionario2 {
  public static void main(String[] args) {
    List<Funcionario> lista = new ArrayList<Funcionario>();
    Funcionario f;
  
    f = new Funcionario(1, "Pedro", 34, 75f);
    lista.add(f);
    f = new Funcionario(2, "Maria", 25, 48f);
    lista.add(f);
    f = new Funcionario(3, "Joao", 30, 60f);
    lista.add(f);
    f = new Funcionario(4, "Maria", 20, 48f);
    lista.add(f);
    f = new Funcionario(5, "Ana", 40, 58f);
    lista.add(f);
    f = new Funcionario(6, "Maria", 20, 49f);
    lista.add(f);
        
    System.out.println("----- Lista original -----");    
    for (Funcionario f2: lista) {
      System.out.println(f2);
    }

    System.out.println("----- Collections.sort(lista) Peso -----");
    ComparadoresFuncionario.Peso comp = new ComparadoresFuncionario.Peso();
    Collections.sort(lista, comp);
    for (Funcionario f2: lista) {
      System.out.println(f2);
    }       

  }//main()
}//TestaOrdenamentoFuncionario2.