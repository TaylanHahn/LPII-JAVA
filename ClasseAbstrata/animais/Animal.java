package animais;

/*==================== Classe Animal (abstrata) ====================*/

//Declaração da classe abstrata, pois possui um método abstrato.
public abstract class Animal {
  private String nome;

  //Declaração de um método abstrato.
  //Deverá ser implementado (sobrescrito) pelas classes descendentes 
  //que forem concretas (não abstratas).
  public abstract void fala();

  //Método Construtor.
  public Animal(String n) {
    this.nome = n;
  } 
  
  public String getNome() {
    return this.nome;
  }

  public void falaNome() {
    System.out.println("Meu nome eh " + this.nome);
  }
  
  public void conversa() {
    System.out.println("Ola!");
    falaNome();
    fala();
    System.out.println("Prazer em conhece-lo.");
  }
  
}//Animal.