package listas_pilhas_filas;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestaListIterator{
  public static void main(String[] args) {
    List<Integer> lista = new ArrayList<Integer>();
    Integer i;
    ListIterator<Integer> it;
  
    lista.add(10);
    lista.add(20);
    lista.add(30);
    lista.add(25);
    lista.add(15);    

    System.out.println("--------------------");
    for (Integer ii: lista)
      System.out.println(ii.toString());
    
    System.out.println("----- imprimindo os dois primeiros objetos -----");
    it = lista.listIterator();
    i = it.next();
    System.out.println(i);
    i = it.next();
    System.out.println(i);
    it.add(40);

    System.out.println("----- while (it.hasNext()) -----");
    for (Integer ii: lista)
  	  System.out.println(ii.toString());
    
    it = lista.listIterator();
    it.next();
    it.next();
    it.remove();

    System.out.println("----- it.remove() -----");
    for (Integer ii: lista)
      System.out.println(ii.toString());
    
  }
}
