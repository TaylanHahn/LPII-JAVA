package animais;


/*==================== Classe Gato ====================*/
public class Gato extends Animal {
  
  //Construtor da Classe.
  public Gato(String n) {
    super(n); //Chama construtor da superclasse.
  }

  //Sobrepondo (overriding) ou sobrescrevendo o método fala.
  @Override
  public void fala() {
    miar(); miar(); miar();
    System.out.println(); //Para efetuar uma troca de linha.
  }
  
  //Método específico da classe Gato.
  public void miar() {
	  System.out.print("miau,");
  }
  
}//Gato.