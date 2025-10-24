package conjuntos;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestaSortedSetInteger {
  public static void main(String[] args) {
    SortedSet<Integer> s = new TreeSet<Integer>();
    SortedSet<Integer> hs;
    SortedSet<Integer> ts;
    SortedSet<Integer> ss;
   
    s.add(10);
    s.add(20);
    s.add(30);
    s.add(20);
    s.add(80);
    s.add(20);
    s.add(70);
    s.add(60);
    s.add(40);
    s.add(50);

    System.out.println(s); //[10, 20, 30, 40, 50, 60, 70, 80]
    
    hs = s.headSet(40);    
    ts = s.tailSet(40);    
    ss = s.subSet(20, 60); 
    
    System.out.println();
    System.out.println("headSet(40)   : " + hs);//[10, 20, 30]
    System.out.println("tailSet(40)   : " + ts);//[40, 50, 60, 70, 80]
    System.out.println("subSet(20, 60): " + ss);//[20, 30, 40, 50]
    System.out.println("first()       : " + s.first());//10
    System.out.println("last()        : " + s.last()); //80
  }
}
