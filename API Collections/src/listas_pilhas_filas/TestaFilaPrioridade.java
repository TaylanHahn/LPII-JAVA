package listas_pilhas_filas;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class MeuComparador implements Comparator<Integer> {
  public int compare(Integer o1, Integer o2) {
    if (o1 >= 60)
      if (o2 >= 60)
        return 0;
      else
        return -1;
    else
      if (o2 >= 60)
        return 1;
      else
        return 0;
  }
}

public class TestaFilaPrioridade {
  public static void main(String[] args) {
    //Cria uma pilha de inteiros.
    MeuComparador comp = new MeuComparador();
    Queue<Integer>f = new PriorityQueue<Integer>(1, comp);
    Integer i;
    
    System.out.print("Fila: ");
    System.out.println(f.toString());
    f.add(0);
    System.out.print("Fila: ");
    System.out.println(f.toString());
    f.add(10);
    System.out.print("Fila: ");
    System.out.println(f.toString());
    f.add(70);
    System.out.print("Fila: ");
    System.out.println(f.toString());
    f.add(30);
    System.out.print("Fila: ");
    System.out.println(f.toString());
    f.add(80);
    System.out.print("Fila: ");
    System.out.println(f.toString());
    f.add(50);
    System.out.print("Fila: ");
    System.out.println(f.toString());
    
    i = f.remove();    
    System.out.println("Elemento retirado da Fila: " + i);
    System.out.print("Fila: ");
    System.out.println(f.toString());
    
    i = f.remove();    
    System.out.println("Elemento retirado da Fila: " + i);    
    System.out.print("Fila: ");
    System.out.println(f.toString());
   
  } 
}
