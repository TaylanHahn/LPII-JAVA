package dominio;

public class Endereco {
  String rua;
  int    numero;
  
  public Endereco(String r, int n){
    this.rua = r;
    this.numero = n;
  }
  
  public String toString(){
    return this.rua + " " + this.numero;
  }
  
}//Endereco.