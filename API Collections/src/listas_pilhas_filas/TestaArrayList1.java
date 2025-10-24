package listas_pilhas_filas;
import java.util.ArrayList;
import java.util.List;

import dominio.Pessoa;

public class TestaArrayList1 {
  public static void main(String[] args) {
    List lista = new ArrayList();
    Object p;
    int i;
  
    //Instancia 3 Pessoas e adiciona-as na lista.
    p = new Pessoa(1, "Maria", 50, 54f);
    lista.add(p);
    p = new Pessoa(2, "Pedro", 40, 78f);
    lista.add(p);
    p = new Pessoa(3, "Joao", 60, 67f);
    lista.add(p);
        
    //Recupera todas as Pessoas da lista usando um la�o for:
    System.out.println("--------------------");
    for (i=0; i<lista.size(); i++) {
      p = lista.get(i);
      System.out.println(p.toString());
    }
    
    //Recupera todas as Pessoas da lista usando um la�o for especial (for each):
    //O objeto lista tem que ser um Array ou implementar a interface Iterable.
    System.out.println("--------------------");    
    for (Object p2: lista) {
      System.out.println(p2.toString());
    }
    
  }//main()
  
}//TestaArrayList1.