package dominio;

public class Titular extends Cliente{

  public Titular(String nome) {
    super(nome);
  }

  public float desconto(){
    return 0.5f;
  }

}//Titular.