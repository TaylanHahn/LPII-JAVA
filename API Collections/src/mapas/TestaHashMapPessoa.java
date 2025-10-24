package mapas;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import dominio.Endereco;
import dominio.Pessoa;

public class TestaHashMapPessoa {
  public static void main(String[] args) {
    Map<Pessoa, Endereco> m = new HashMap<Pessoa, Endereco>();
    
    Pessoa p1, p2, p3, p4;
    p1 = new Pessoa(1, "Pedro", 34, 75f);
    p2 = new Pessoa(2, "Maria", 25, 48f);
    p3 = new Pessoa(3, "Joao", 30, 60f);
    p4 = new Pessoa(4, "Carla", 35, 55f);

    Endereco e, e1, e2, e3;
    
    e1 = new Endereco("abc", 200);
    e2 = new Endereco("xyz", 300);
    e3 = new Endereco("zzz", 400);
    
    m.put(p1, e1);
    m.put(p2, e2);
    m.put(p3, e1);

    //Imprime o mapa.
    System.out.println(m);
    
    //Recupera endereco de p1.
    System.out.println();
    System.out.println("----- Recupera o endereco de p1 -----");    
    System.out.println("----- e = m.get(p1) -----");
    e = m.get(p1);
    System.out.println(" e = " + e);
    
    System.out.println("m.containsKey(p1)   = " + m.containsKey(p1));
    System.out.println("m.containsValue(e1) = " + m.containsValue(e1));
    System.out.println("m.containsKey(p4)   = " + m.containsKey(p4));
    System.out.println("m.containsValue(e3) = " + m.containsValue(e3));

    System.out.println();
    
    System.out.println("Todas as pessoas do map:");
    Set<Pessoa> set_pessoas = m.keySet();
    for(Pessoa pp: set_pessoas) {
      System.out.println(pp);
    }
    System.out.println();
    
    System.out.println("Todos os enderecos do map:");
    Collection<Endereco> enderecos = m.values();
    for(Endereco ee: enderecos) {
      System.out.println(ee);
    }
    System.out.println();

    System.out.println("Todas as pessoas-endereco do map:");
    set_pessoas = m.keySet();
    for(Pessoa pp: set_pessoas) {
      System.out.println(pp + " => " + m.get(pp));
    }
    System.out.println();

    System.out.println("Todas as pessoas-endereco do map:");
    set_pessoas = m.keySet();
    Iterator<Pessoa> it_pessoa = set_pessoas.iterator();
    while (it_pessoa.hasNext()) {
      Pessoa pp = it_pessoa.next();
      System.out.println(pp + " => " + m.get(pp));
    }
    System.out.println();
    
    System.out.println("Utilizando m.entrySet() para obter um set<Map.Entry<>>");
    Set<Map.Entry<Pessoa, Endereco>> set_par_valor = m.entrySet();
    for (Map.Entry<Pessoa, Endereco> par_valor: set_par_valor) {
      System.out.println(par_valor.getKey() + " => " + par_valor.getValue());
    }
    System.out.println();

    System.out.println("Utilizando m.entrySet() para obter um set<Map.Entry<>>");
    Iterator<Map.Entry<Pessoa, Endereco>> it = set_par_valor.iterator();
    while (it.hasNext()) {
      Map.Entry<Pessoa, Endereco> par_valor = it.next();
      System.out.println(par_valor.getKey() + " => " + par_valor.getValue());
    }
    System.out.println();

    m.remove(p3);
    //Imprime o mapa.
    System.out.println(m);
  }//main()
  
}//TestaHashMapPessoa.