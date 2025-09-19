package dominio;

public class Endereco {
  private String rua;
  private int    numero;
  private String complemento;
  private String bairro;
  
  public Endereco(String r, int n, String c, String b) {
    rua         = r;
    numero      = n;
    complemento = c;
    bairro      = b;
  }  
  
  //--- Rua ---
  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  //--- Numero ---
  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  //--- Complemento ---
  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  //--- Bairro ---
  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  //--- toString() ---
  public String toString(){
    return this.rua + "," + this.numero + "," + this.complemento + "," + this.bairro;  
  }
  
  //--- mostraDados() ---
  //Este m�todo foi criado somente para demonstra��o,
  //lembrando que este n�o � o melhor local para implementa��o de um m�todo 
  //de acesso � interface (tela).
  public void mostraDados(){
    System.out.println("Rua        : " + rua); 
    System.out.println("Numero     : " + numero);
    System.out.println("Compl.     : " + complemento);
    System.out.println("Bairro     : " + bairro);
  }
  
}//Endereco.