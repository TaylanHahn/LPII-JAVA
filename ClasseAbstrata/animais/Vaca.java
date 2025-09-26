package animais;


/*==================== Classe Vaca ====================*/
public class Vaca extends Animal {
  
  //Construtor da Classe.
  public Vaca(String n) {
    super(n); //Chama construtor da superclasse.
  }

  //Implementação do método abstrato declarado na superclasse (Animal).
  public void fala() {
    mugir(); mugir();
    System.out.println(); //Para efetuar uma troca de linha.
  }
  
  public void mugir() {
    System.out.print("mu,");
  }
  
}//Vaca.