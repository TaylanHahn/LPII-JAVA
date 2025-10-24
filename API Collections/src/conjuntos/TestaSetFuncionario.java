package conjuntos;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import dominio.Funcionario;

/* Exemplo para demonstrar conjuntos (interface Set).
 * Um Set n�o permite elementos repetidos.
 * Alguns sets permitem o elemento null, outros n�o.
 * Os elementos s�o testados segundo os m�todos 
 * hashCode(), equals() ou compareTo() dependendo da implementa��o.
 */
public class TestaSetFuncionario {
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
    System.out.println(set1);
    //[null, 5 B 51 80.0 , 2 B 50 80.0 , 1 A 50 80.0 ]
    System.out.println();
    
    System.out.println("----- Dados Dos Funcionarios -----");
    for(Funcionario f: set1) {
        System.out.println("Codigo: " + f.getCodigo());
        System.out.println("Nome: " + f.getNome());
        System.out.println("Idade: " + f.getIdade());
        System.out.println("Peso: " + f.getPeso());
        System.out.println("---------------------------");
    }
    
    System.out.println();

    System.out.println("----- Dados Dos Funcionarios -----");
    Iterator<Funcionario> it = set1.iterator();
    while (it.hasNext()) {
      Funcionario f = it.next();
      System.out.println("Codigo: " + f.getCodigo());
      System.out.println("Nome: " + f.getNome());
      System.out.println("Idade: " + f.getIdade());
      System.out.println("Peso: " + f.getPeso());
      System.out.println("---------------------------");
    }
    System.out.println();
  }//main()
}//TestaSetFuncionario.