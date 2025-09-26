package animais;

/*==================== Classe Cao ====================*/
public class Cao extends Animal {
  
  //Construtor da Classe.
  public Cao(String n) {
    super(n); //Chama construtor da superclasse.
  }

  //Sobrepondo (overriding) ou sobrescrevendo o método fala.
  public void fala() {
    latir(); latir(); latir(); latir();
    System.out.println(); //Para efetuar uma troca de linha.
  }

  //Método específico da classe Cao.
  public void latir() {
    System.out.print("au,");
  }
  
}//Cao.