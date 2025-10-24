package conjuntos;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import dominio.Pessoa;

/* Exemplo para demonstrar conjuntos (interface Set).
 * Um Set n�o permite elementos repetidos.
 * Alguns sets permitem o elemento null, outros n�o.
 * Os elementos s�o testados segundo os m�todos 
 * hashCode(), equals() ou compareTo() dependendo da implementa��o.
 */
public class TestaSetPessoa {
  public static void main(String[] args) {
    
    //A classe Pessoa sobrescreve os m�todos hashCode() e equals().
    //Tamb�m implementa o m�todo compareTo().
    //Entretanto, esses m�todos n�o est�o consistentes (veja a classe).
    //O hashCode() da Pessoa � calculado em fun��o do nome.
    //O equals() da Pessoa � calculado em fun��o do nome e idade.
    //O compareTo() � calculado em fun��o do nome, idade e peso.
    //Veja seus efeitos colaterais a seguir.
    
    //HashSet utiliza o m�todo hashCode().
    //Se retornar um hashCode() diferente dos j� existentes, o elemento � adicionado.
    //Se retornar um hashCode() igual, ent�o � chamado o m�todo equals().
    //A ordem dos elementos n�o � garantida.
    Set<Pessoa> set1 = new HashSet<Pessoa>();
    set1.add(new Pessoa(1, "A", 50, 80f));
    set1.add(new Pessoa(2, "B", 50, 80f));
    set1.add(new Pessoa(3, "B", 50, 80f)); //Este elemento j� existe.
    set1.add(new Pessoa(4, "B", 50, 81f)); //Este elemento j� existe.
    set1.add(new Pessoa(5, "B", 51, 80f));
    set1.add(new Pessoa(6, "B", 51, 81f)); //Este elemento j� existe.
    set1.add(null); //Aceita elemento null.
    System.out.println(set1);
    //[null, 1 A 50 80.0 , 5 B 51 80.0 , 2 B 50 80.0 ]
    
    //LinkedHashSet � igual ao HashSet, com a diferen�a 
    //quem mant�m a ordem em que os elementos foram inseridos.
    Set<Pessoa> set2 = new LinkedHashSet<Pessoa>();
    set2.add(new Pessoa(1, "A", 50, 80f));
    set2.add(new Pessoa(2, "B", 50, 80f));
    set2.add(new Pessoa(3, "B", 50, 80f)); //Este elemento j� existe.
    set2.add(new Pessoa(4, "B", 50, 81f)); //Este elemento j� existe.
    set2.add(new Pessoa(5, "B", 51, 80f));
    set2.add(new Pessoa(6, "B", 51, 81f)); //Este elemento j� existe.
    set2.add(null); //Aceita elemento null.
    System.out.println(set2);
    //[1 A 50 80.0 , 2 B 50 80.0 , 5 B 51 80.0 , null]
    
    //TreeSet utiliza o m�todo compareTo() para comparar os objetos.
    //Necessita que os elementos implementem a interface Comparable.
    //Elementos s�o ordenados.
    //N�o aceita elemento null.
    Set<Pessoa> set3 = new TreeSet<Pessoa>();    
    set3.add(new Pessoa(1, "A", 50, 80f));
    set3.add(new Pessoa(2, "B", 50, 80f));
    set3.add(new Pessoa(3, "B", 50, 80f)); //Este elemento j� existe.
    set3.add(new Pessoa(4, "B", 51, 80f));
    set3.add(new Pessoa(5, "B", 50, 81f));
    set3.add(new Pessoa(6, "B", 51, 81f));
    //set3.add(null); //Nao aceita elemento null.
    System.out.println(set3);
    //[1 A 50 80.0 , 2 B 50 80.0 , 5 B 50 81.0 , 4 B 51 80.0 , 6 B 51 81.0 ]

  }//main()
}//TestaSetPessoa.