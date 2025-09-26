package animais;

/*==================== Classe Animal ====================*/
public class Animal {
  private String nome;
    
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
  
  //Não é a forma mais adequada.
  //Deixar o método vazio também não é adequado.
  //O correto é declarar este método abstrato (será feito depois).
  public void fala() {
    System.out.println("---"); //Isso é inadequado.
  }
  
  public void conversa() {
    System.out.println("Ola!");
    falaNome();
    fala();
    System.out.println("Prazer em conhece-lo.");
  }
  
}//Animal.