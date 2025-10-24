package listas_pilhas_filas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import dominio.Pessoa;

public class TestaArrayList_sort2 {
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

    //Comparator c = Collections.reverseOrder();
    
    //Esta linha tem o mesmo efeito da linha acima.
    Comparator c = new MeuComparadorReverso(); 
    Collections.sort(lista, c);
    System.out.println("----- Implementando um comparador reverso natural -----");    
    for (Pessoa p2: lista) {
      System.out.println(p2.toString());
    }
    
  }//main()
}//TestaArrayList_Sort2.

class MeuComparadorReverso implements Comparator {
  public int compare(Object o1, Object o2) {
    Comparable c1=(Comparable)o1;
    Comparable c2=(Comparable)o2;
    if (c1.compareTo(c2) < 0)
      return 1;
    else if (c1.compareTo(c2) > 0)
      return -1;
    else 
      return 0;
  }//compare()
}//MeuComparadorReverso.