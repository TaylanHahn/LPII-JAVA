package mapas;
import java.util.HashMap;
import java.util.Map;

import dominio.Pessoa;

public class TestaHashMap {
  public static void main(String[] args) {
    Map<Integer, Pessoa> m = new HashMap<Integer, Pessoa>();
    
    Pessoa p, p1, p2, p3;
    p1 = new Pessoa(1, "Pedro", 34, 75f);
    p2 = new Pessoa(2, "Maria", 25, 48f);
    p3 = new Pessoa(3, "Joao", 30, 60f);

    m.put(100, p1);
    m.put(200, p2);
    m.put(300, p3);

    System.out.println(m);
    
    p = m.get(200);
    System.out.println("200 = " + p);
  }
}
