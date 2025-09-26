package testes;
import animais.Animal;
import animais.Cao;
import animais.Gato;


public class Teste4_InstanceOf {
  public static void main(String[] args) {
    Animal a;

    System.out.println("--------------------------------------");    
    a = new Cao("Rex");
    a.conversa();

    System.out.println("--------------------------------------");    
    if (a instanceof Cao) {
      System.out.println("Eh um Cao.");
    }
    else {
      System.out.println("Nao eh um Cao.");
    }
    
    if (a instanceof Animal) {
      System.out.println("Eh um Animal.");
    }
    else {
      System.out.println("Nao eh um Animal.");
    }

    if (a instanceof Object) {
        System.out.println("Eh um Object.");
      }
      else {
        System.out.println("Nao eh um Object.");
    }
    
    if (a instanceof Gato) {
        System.out.println("Eh um Gato.");
      }
      else {
        System.out.println("Nao eh um Gato.");
    }

    System.out.println("a.getClass().getSimpletName() = " + a.getClass().getSimpleName());
    System.out.println("a.getClass().getName() = " + a.getClass().getName());

  }//main()

}//Teste4_InstanceOf.