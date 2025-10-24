package listas_pilhas_filas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import dominio.Pessoa;

public class TestaArrayList_sort {
  public static void main(String[] args) {
    List<Pessoa> lista = new ArrayList<Pessoa>();
    Pessoa p;
  
    p = new Pessoa(1, "Pedro", 34, 75f);
    lista.add(p);
    p = new Pessoa(2, "Maria", 25, 48f);
    lista.add(p);
    p = new Pessoa(3, "Joao", 30, 60f);
    lista.add(p);
    p = new Pessoa(4, "Maria", 20, 48f);
    lista.add(p);
    p = new Pessoa(5, "Ana", 40, 58f);
    lista.add(p);
    p = new Pessoa(6, "Maria", 20, 48f);
    lista.add(p);
        
    System.out.println("----- Lista original -----");    
    for (Pessoa p2: lista) {
      System.out.println(p2.toString());
    }

    Collections.reverse(lista);
    System.out.println("----- Collections.reverse(lista) -----");    
    for (Pessoa p2: lista) {
      System.out.println(p2.toString());
    }

    Comparator<Pessoa> c = Collections.reverseOrder();
    Collections.sort(lista, c);
    System.out.println("----- c = Collections.reverseOrder() e Collections.sort(lista, c) -----");    
    for (Pessoa p2: lista) {
      System.out.println(p2.toString());
    }
    
    Collections.sort(lista);
    System.out.println("----- Collections.sort(lista) -----");    
    for (Pessoa p2: lista) {
      System.out.println(p2.toString());
    }
    
    Comparator<Pessoa> cpi = new ComparadorPessoaIdade();
    Collections.sort(lista, cpi);
    System.out.println("----- ComparadorPessoaIdade -----");    
    for (Pessoa p2: lista) {
      System.out.println(p2.toString());
    }
    
    Comparator<Pessoa> cpi_inverso;
    cpi_inverso = Collections.reverseOrder(cpi);
    Collections.sort(lista, cpi_inverso);
    System.out.println("----- ComparadorPessoaIdade Invertido -----");    
    for (Pessoa p2: lista) {
      System.out.println(p2.toString());
    } 
    
    
  }//main()
}//TestaArrayList_sort.