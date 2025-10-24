package listas_pilhas_filas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import dominio.Funcionario;

public class TestaOrdenamentoFuncionario {
  public static void main(String[] args) {
    List<Funcionario> lista = new ArrayList<Funcionario>();
    Funcionario f;
  
    f = new Funcionario(1, "Pedro", 34, 59);
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

    //Inverte uma lista.
    System.out.println("----- Collections.reverse(lista) -----");
    Collections.reverse(lista);
    for (Funcionario f2: lista) {
      System.out.println(f2);
    }

    //Ordena uma lista conforme a ordem natural dos seus elementos.
    System.out.println("----- Collections.sort(lista) -----");
    Collections.sort(lista);
    for (Funcionario f2: lista) {
      System.out.println(f2);
    }

    //Ordena uma lista utilizando um Comparator.
    System.out.println("----- Collections.sort(lista, comp_peso) -----");
    ComparadorFuncionarioPeso comp_peso = new ComparadorFuncionarioPeso();
    Collections.sort(lista, comp_peso);
    for (Funcionario f2: lista) {
      System.out.println(f2);
    }    
    
    //Obt�m um Comparator inverso da ordem natural.
    Comparator<Funcionario> comp_inverso = Collections.reverseOrder();
    //Ordena a lista utilizando esse comparador inverso da ordem natural.
    Collections.sort(lista, comp_inverso);
    System.out.println("----- comp_inverso = Collections.reverseOrder() e Collections.sort(lista, comp_inverso) -----");
    for (Funcionario f2: lista) {
      System.out.println(f2);
    }
    
    //Obt�m um Comparator inverso do Comparator comp_peso.
    comp_inverso = Collections.reverseOrder(comp_peso);
    //Ordena a lista usando esse comparador inverso do peso.
    Collections.sort(lista, comp_inverso);
    System.out.println("----- ComparadorPeso Invertido -----");    
    for (Funcionario f2: lista) {
      System.out.println(f2);
    } 
    
    f = Collections.max(lista);
    System.out.println("maior (ordem natural) = " + f);
    
    
    f = Collections.max(lista, comp_peso);
    System.out.println("maior peso = " + f);
    
  }//main()
}//TestaOrdenamento.