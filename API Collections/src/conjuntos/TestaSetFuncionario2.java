package conjuntos;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import dominio.Funcionario;

/* Exemplo para demonstrar conjuntos (interface Set).
 * Um Set n�o permite elementos repetidos.
 * Alguns sets permitem o elemento null, outros n�o.
 * Os elementos s�o testados segundo os m�todos 
 * hashCode(), equals() ou compareTo() dependendo da implementa��o.
 */
public class TestaSetFuncionario2 {
  public static void main(String[] args) {
    
    //A classe Funcionario sobrescreve os m�todos hashCode() e equals(),
    //os quais s�o executados com base nos atributos nome e idade.
    //O m�todo compareTo() tamb�m utiliza nome e idade. 
    //Portanto, objetos Funcionario ser�o considerados iguais se possu�rem
    //o mesmo nome e a mesma idade.
    
    //HashSet utiliza o m�todo hashCode().
    //Se retornar um hashCode() diferente dos j� existentes, o elemento � adicionado.
    //Se retornar um hashCode() igual, ent�o � chamado o m�todo equals().
    //A ordem dos elementos n�o � garantida.
    Set<Funcionario> set1 = new HashSet<Funcionario>();
    set1.add(new Funcionario(1, "A", 50, 80f));
    set1.add(new Funcionario(2, "B", 50, 80f));
    set1.add(new Funcionario(3, "B", 50, 80f)); //Elemento repetido.
    set1.add(new Funcionario(4, "B", 50, 81f)); //Elemento repetido.
    set1.add(new Funcionario(5, "B", 51, 80f));
    set1.add(new Funcionario(6, "B", 51, 81f)); //Elemento repetido.
    set1.add(null); //Aceita elemento null.
    System.out.println(set1);
    //[null, 5 B 51 80.0 , 2 B 50 80.0 , 1 A 50 80.0 ]
    
    //LinkedHashSet � igual ao HashSet, com a diferen�a 
    //quem mant�m a ordem em que os elementos foram inseridos.
    Set<Funcionario> set2 = new LinkedHashSet<Funcionario>();
    set2.add(new Funcionario(1, "A", 50, 80f));
    set2.add(new Funcionario(2, "B", 50, 80f));
    set2.add(new Funcionario(3, "B", 50, 80f)); //Elemento repetido.
    set2.add(new Funcionario(4, "B", 50, 81f)); //Elemento repetido.
    set2.add(new Funcionario(5, "B", 51, 80f));
    set2.add(new Funcionario(6, "B", 51, 81f)); //Elemento repetido.
    set2.add(null); //Aceita elemento null.
    System.out.println(set2);
    //[1 A 50 80.0 , 2 B 50 80.0 , 5 B 51 80.0 , null]
    
    //TreeSet utiliza o m�todo compareTo() para comparar os objetos.
    //Necessita que os elementos implementem a interface Comparable.
    //Elementos s�o ordenados.
    Set<Funcionario> set3 = new TreeSet<Funcionario>();    
    set3.add(new Funcionario(1, "A", 50, 80f));
    set3.add(new Funcionario(2, "B", 50, 80f)); 
    set3.add(new Funcionario(3, "B", 50, 80f)); //Elemento repetido.
    set3.add(new Funcionario(4, "B", 50, 81f)); //Elemento repetido.
    set3.add(new Funcionario(5, "B", 51, 80f));
    set3.add(new Funcionario(6, "B", 51, 81f)); //Elemento repetido.
    //set3.add(null); //Nao aceita elemento null.
    System.out.println(set3);
    //[1 A 50 80.0 , 2 B 50 80.0 , 5 B 51 80.0 ]

  }//main()
}//TestaSetFuncionario2.