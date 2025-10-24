package dominio;
public class Endereco {
  private String rua;
  private int    numero;
  private String complemento;
  private String bairro;
  
  //----- Construtor -----
  public Endereco() {
    rua         = "---";
    numero      = 0;
    complemento = "---";
    bairro      = "---";
  }
  
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

  public boolean equals(Object o){
    if (o == null)
      return false;
      
    if (! (o instanceof Endereco))
      return false;

    if (o == this)
      return true;

    Endereco e = (Endereco)o;
    
    if ( this.getRua().equals(e.getRua()) &&
         this.getNumero() == e.getNumero() &&
         this.getComplemento().equals(e.getComplemento()) &&
         this.getBairro().equals(e.getBairro())
       )
      return true;
    else
      return false;
  }
  
}//Endereco.