package conjuntos;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TestaNavigableSet {
  public static void main(String[] args) {
    NavigableSet<Integer> s = new TreeSet<Integer>();
    Iterator it;
   
    s.add(10);
    s.add(20);
    s.add(30);
    s.add(40);
    s.add(50);
    s.add(60);
    s.add(70);
    System.out.println(s);//[10, 20, 30, 40, 50, 60, 70]

    System.out.println("lower(30)   : " + s.lower(30));  //menor = 20 
    System.out.println("ceiling(30) : " + s.ceiling(30));//menor ou igual = 30
    System.out.println("higher(30)  : " + s.higher(30)); //maior = 40
    System.out.println("floor(30)   : " + s.floor(30));  //maior ou igual = 30
    
    System.out.println("\n--- descendingIterator() ---");
    it = s.descendingIterator();
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }
  }
}
