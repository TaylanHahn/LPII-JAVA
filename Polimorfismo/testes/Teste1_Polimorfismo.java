package testes;
import animais.Animal;
import animais.Cao;
import animais.Gato;

/*
 * Exemplo para mostrar polimorfismo e ligação tardia de método.
 * 
 */

public class Teste1_Polimorfismo {
  public static void main(String[] args) {
    Animal a1;
    Cao    c1;
    Gato   g1;

    System.out.println("========== c1 ==========");
    c1 = new Cao("Rex");
    c1.falaNome();
    c1.fala();
    c1.conversa();
    c1.latir();
    
    System.out.println("========== g1 ==========");
    g1 = new Gato("Mimi");
    g1.falaNome();
    g1.fala();
    g1.conversa();
    g1.miar();

    //Uma variável de um tipo mais geral (superclasse) pode receber diretamente
    //um objeto de uma classe mais específica (subclasse).
    //Exemplos:
    //Uma variável do tipo Animal pode receber um objeto do tipo Cao ou Gato.
    
    //Polimorfismo (poli=vários, morfus=forma): a1 assume diversas formas (comportamentos),
    //hora se comporta como Cao e hora se comporta como Gato. 

    System.out.println("========== a1 = c1 ==========");
    //a1 recebe c1, ou seja, a1 referencia (aponta para) o objeto c1, que é um Cao.
    a1 = c1;
    //Ligação tardia de método:
    //O objeto a1 foi declarado um Animal.
    //A classe Animal possui o método fala(), mas no momento da execução 
    //é chamado o método fala() da classe Cao.
    a1.fala();
    a1.conversa();
    
    System.out.println("========== a1 = g1 ==========");
    //a1 recebe g1, ou seja, a1 referencia (aponta para) Gato g1.
    a1 = g1;
    a1.fala();
    a1.conversa();
    
    System.out.println("========== a1 = new Cao(\"Kiko\") ==========");
    //Idem (instanciar e atribuir).
    a1 = new Cao("Kiko");
    a1.conversa();
   
  }//main()

}//Teste1_Polimorfismo.