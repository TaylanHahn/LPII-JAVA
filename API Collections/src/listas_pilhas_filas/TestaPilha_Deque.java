package listas_pilhas_filas;
import java.util.Deque;
import java.util.ArrayDeque;

public class TestaPilha_Deque {
  public static void main(String[] args) {
    //Cria uma pilha de Strings.
    //Deque<String>pilha = new LinkedList<String>();
    Deque<String>pilha = new ArrayDeque<String>();
    String s;
    
    System.out.print("Pilha: ");
    System.out.println(pilha.toString());
    pilha.push("A");
    System.out.print("Pilha: ");
    System.out.println(pilha.toString());
    pilha.push("B");
    System.out.print("Pilha: ");
    System.out.println(pilha.toString());
    pilha.push("C");
    System.out.print("Pilha: ");
    System.out.println(pilha.toString());
    pilha.push("D");
    System.out.print("Pilha: ");
    System.out.println(pilha.toString());
    pilha.push("E");
    System.out.print("Pilha: ");
    System.out.println(pilha.toString());
    pilha.push("F");
    System.out.print("Pilha: ");
    System.out.println(pilha.toString());
    
    s = pilha.pop();    
    System.out.println("Elemento retirado da pilha: " + s);
    System.out.print("Pilha: ");
    System.out.println(pilha.toString());
    
    s = pilha.pop();    
    System.out.println("Elemento retirado da pilha: " + s);    
    System.out.print("Pilha: ");
    System.out.println(pilha.toString());
    
    System.out.println("--- Cuidado: permite adicionar na base da pilha ---");
    pilha.addLast("AA");
    System.out.print("Pilha: ");
    System.out.println(pilha.toString());

    System.out.println("--- Cuidado: permite remover um objeto qualquer (C) ---");    
    pilha.remove("C");
    System.out.print("Pilha: ");
    System.out.println(pilha.toString());
    
  } 
}//TestaPilha_Deque.