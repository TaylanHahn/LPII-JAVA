package listas_pilhas_filas;
import java.util.ArrayDeque;
import java.util.Queue;

public class TestaFila {
  public static void main(String[] args) {
    //Cria uma Fila de Strings.
    //Queue<String>fila = new PriorityQueue<String>();
    //Queue<String>fila = new LinkedList<String>();
    Queue<String>fila = new ArrayDeque<String>();
    String s;
    
    System.out.print("Fila: ");
    System.out.println(fila.toString());
    fila.add("A");
    System.out.print("Fila: ");
    System.out.println(fila.toString());
    fila.add("B");
    System.out.print("Fila: ");
    System.out.println(fila.toString());
    fila.add("C");
    System.out.print("Fila: ");
    System.out.println(fila.toString());
    fila.add("D");
    System.out.print("Fila: ");
    System.out.println(fila.toString());
    fila.add("E");
    System.out.print("Fila: ");
    System.out.println(fila.toString());
    fila.add("F");
    System.out.print("Fila: ");
    System.out.println(fila.toString());
    
    s = fila.remove();    
    System.out.println("Elemento retirado da Fila: " + s);
    System.out.print("Fila: ");
    System.out.println(fila.toString());
    
    s = fila.remove();    
    System.out.println("Elemento retirado da Fila: " + s);    
    System.out.print("Fila: ");
    System.out.println(fila.toString());
   
  } 
}//TestaFila.