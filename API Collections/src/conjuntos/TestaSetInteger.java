package conjuntos;
import java.util.HashSet;
import java.util.Set;

public class TestaSetInteger {
  public static void main(String[] args) {
    Set<Integer> s = new HashSet<Integer>();
    
    s.add(10);
    s.add(20);
    s.add(30);
    s.add(20);
    s.add(100);
    s.add(20);
    s.add(110);
    s.add(20);

    System.out.println(s);//[100, 20, 110, 10, 30]
    
    if (s.contains(30)) {
      System.out.println("Sim, tem o valor 30");
    }
    else {
      System.out.println("Nao tem o valor 30");
    }

    if (s.contains(200)) {
      System.out.println("Sim, tem o valor 200");
    }
    else {
      System.out.println("Nao tem o valor 200");
    }
  }
  
}//TestaSetInteger.