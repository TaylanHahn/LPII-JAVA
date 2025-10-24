package conjuntos;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import dominio.Animal;

/* Exemplo para demonstrar conjuntos (interface Set).
 * Um Set n�o permite elementos repetidos.
 * Alguns sets permitem o elemento null, outros n�o.
 * Os elementos s�o testados segundo os m�todos 
 * hashCode(), equals() ou compareTo() dependendo da implementa��o.
 */
public class TestaSetAnimal {
  public static void main(String[] args) {
    
    //A classe Animal herda o m�todo hashCode() mas n�o o sobrescreve.
    //Logo, o hashCode() � calculado em fun��o do endereco do objeto na mem�ria.
    //Portanto, � bem prov�vel que cada objeto seja considerado diferente um do outro
    //e todos sejam adicionados ao conjunto.
    //O correto � sobrescrever os m�todos hashCode() e equals(). 
    
    //HashSet utiliza o m�todo hashCode().
    //Se retornar um hashCode() diferente dos j� existentes, o elemento � adicionado.
    //Se retornar um hashCode() igual, ent�o � chamado o m�todo equals().
    //A ordem dos elementos n�o � garantida.
    Set<Animal> set1 = new HashSet<Animal>();
    set1.add(new Animal(1, "A", 1));
    set1.add(new Animal(2, "B", 1));
    set1.add(new Animal(3, "B", 2));
    set1.add(new Animal(4, "B", 2));
    set1.add(null); //Aceita elemento null.
    System.out.println(set1);
    //[null, 2 B 1.0, 3 B 2.0, 1 A 1.0, 4 B 2.0]
    
    //LinkedHashSet � igual ao HashSet, com a diferen�a 
    //quem mant�m a ordem em que os elementos foram inseridos.
    Set<Animal> set2 = new LinkedHashSet<Animal>();
    set2.add(new Animal(1, "A", 1));
    set2.add(new Animal(2, "B", 1));
    set2.add(new Animal(3, "B", 2));
    set2.add(new Animal(4, "B", 2));
    set2.add(null); //Aceita elemento null.
    System.out.println(set2);
    //[1 A 1.0, 2 B 1.0, 3 B 2.0, 4 B 2.0, null]
    
  }//main()
}//TestaSetAnimal.