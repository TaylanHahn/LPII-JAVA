package dominio;

public class Gerente {
  private String nome;
  private float salBase;
  
  public Gerente(String n, float sal) {
	  this.nome = n;
	  this.salBase = sal;
  }
  
  public String getNome() {
    return nome;
  }

  public float getSalBase() {
    return salBase;
  }
  
}//Gerente.
