package animais;

/*==================== Classe Cao ====================*/
public class Cao extends Animal {
  
  //Construtor da Classe.
  public Cao(String n) {
    super(n); //Chama construtor da superclasse.
  }

  //Implementação do método abstrato declarado na superclasse (Animal).
  public void fala() {
    latir(); latir(); latir(); latir();
    System.out.println(); //Para efetuar uma troca de linha.
  }

  //Método específico da classe Cao.
  public void latir() {
    System.out.print("au,");
  }
  
}//Cao.