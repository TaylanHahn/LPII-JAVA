package testes;

import animais.Animal;
import animais.Cao;
import animais.Gato;

/*
  Exemplo para mostrar a utilização de "Type Cast" ou "Casting".
*/
public class Teste2_Casting {

  public static void main(String[] args) {  
    Object o1;
    Animal a1;
    Cao    c1;

    System.out.println("*********************************************************");
    System.out.println("************ Type casting (coerção de tipo) *************");
    System.out.println("*********************************************************");
    
    //Cria uma instância de Cao.
    c1 = new Cao("Rex");   

    //Uma variável de um tipo mais geral (superclasse) pode receber diretamente
    //um objeto de uma classe mais específica (subclasse).
    //Exemplos:
    //Uma variável do tipo Animal pode receber um objeto do tipo Cao ou Gato.
    a1 = c1;
    a1.fala();
    
    //Entretanto, não podemos chamar o método latir(), pois,
    //para o compilador, a1 é um Animal, e um Animal não tem o método latir().
    //Erro de compilação:
    //a1.latir();

    System.out.print("===== ((Cao)a1).latir() =====");
    //Nesse caso, precisamos fazer um Casting (coerção) ou "type casting".
    //Força o compilador a aceitar que a1 é do tipo Cao, ou seja,
    //diz para o compilador tratar objeto a1 como sendo do tipo Cao.
    ((Cao)a1) . latir();
    System.out.println();
  
    //Repetindo:
    //Cria outra instância de Cao.
    //Variável do tipo Animal pode receber um objeto do tipo Cao. 
    a1 = new Cao("K9000"); 
    //Para o compilador, a1 é um animal, e um animal não tem o método latir().
    //Erro de compilação:
    //a1.latir(); 

    //Casting (coerção) ou "type casting".
    System.out.print("===== ((Cao)a1).latir() =====");
    //Força o compilador a aceitar que a1 é do tipo Cao.
    //Trata objeto a1 como sendo do tipo Cao.
    ((Cao)a1) . latir();
    System.out.println();

    //Idem para a classe geral Object.
    //Uma variável do tipo Object pode receber um objeto do tipo Cao.
    //o1 recebe c1, ou seja, o1 referencia (aponta para) c1.
    o1 = c1;
    //No entanto, neste caso não será possível acessar os atributos ou chamar os métodos de Cao ou Animal 
    //diretamente no objeto o1, a não ser que se utilize o mecanismo da coerção (casting):
    //Erro de compilação: 
    //o1.getNome();
    //o1.falaNome();
    //o1.fala();
    //o1.latir();

    //Usando a coerção (casting): trata objeto o1 como sendo do tipo Cao.
    System.out.print("((Cao)o1).latir() = ");
    ((Cao)o1) . latir();
    System.out.println();
    
  }//main()
  
}//Teste2_Casting.