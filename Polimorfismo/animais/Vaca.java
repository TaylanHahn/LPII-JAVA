package animais;


/*==================== Classe Vaca ====================*/
public class Vaca extends Animal {
  
  //Construtor da Classe.
  public Vaca(String n) {
    super(n); //Chama construtor da superclasse.
  }

  //Sobrepondo (overriding) ou sobrescrevendo o m�todo fala.
  @Override
  public void fala() {
    mugir(); mugir();
    System.out.println(); //Para efetuar uma troca de linha.
  }
  
  public void mugir() {
    System.out.print("mu,");
  }
  
}//Vaca.