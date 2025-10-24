package conjuntos;
import java.util.SortedSet;
import java.util.TreeSet;

import dominio.Cliente;

public class TestaSortedSetCliente {
  public static void main(String[] args) {
    SortedSet<Cliente> s = new TreeSet<Cliente>();
    SortedSet<Cliente> sc;
    
    Cliente c1, c2, c3, c4, c5, c6;
    c2 = new Cliente(2, "Ana",     30, 60f);
    c3 = new Cliente(3, "Ana",     30, 70f);
    c1 = new Cliente(1, "Ana",     30, 50f);
    c4 = new Cliente(4, "Joao",    30, 60f);
    c6 = new Cliente(6, "Pedro",   34, 75f);
    c5 = new Cliente(5, "Marcelo", 20, 69f);
    
    //Insere clientes no conjunto s.
    s.add(c2);
    s.add(c3);
    s.add(c1);
    s.add(c4);
    s.add(c6);
    s.add(c5);
    System.out.println("s:  " + s);
    System.out.println();
    
    Cliente c;
    c = s.first();
    System.out.println("First: " + c);
    
    c = s.last();
    System.out.println("Last: " + c);
    
    System.out.println();

    //retorna uma vis�o do conjunto s.
    sc = s.subSet(c2, c5);
    System.out.println("sc: " + sc);
    
    //Modifica c2 e adiciona um cliente no subconjunto sc (CUIDADO!!!):
    c2.setNome("Joao Silva");
    sc.add(new Cliente(7, "Laura", 40, 60));
    
    //Erros.
    //c2.setNome("Z� Silva");
    //sc.add(new Cliente(7, "Zila", 40, 60));
    
    System.out.println();    
    System.out.println("s : " + s);
    System.out.println("sc: " + sc);
  }
  
}//TestaSortedSetCliente.