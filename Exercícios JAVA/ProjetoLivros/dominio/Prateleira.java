package dominio;

public class Prateleira {

  // atributo
  private int numero;
  private Armario armario; //Para implementar a associação Prateleira->(1)Armario.

  //construtor
  public Prateleira(int numero, Armario a){
    this.numero=numero;
    //Associação obrigatória tem que testar.
    if (a != null) {
      this.armario = a;
    }
    else {
      throw new RuntimeException("Erro: armario nulo");
    }
  }

  // metodo
  public int getNumero() {
    return numero;
  }

  public Armario getArmario() {
    return armario;
  }

  //Nao implementar os setters().

}//Prateleira.