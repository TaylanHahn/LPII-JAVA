package composicao1b;

public class Residencia implements Cloneable {

  private String rua;
  private int numero;

  public Residencia(String rua, int numero) {
    setRua(rua);
    setNumero(numero);
  }

  public Object clone() {
    try {
      return super.clone();
    } catch (CloneNotSupportedException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
      return null;
    }
  }

  public String getRua() {
    return this.rua;
  }

  public void setRua(String rua) {
    if (rua==null) {
      //Lancando um excecao.
      throw new RuntimeException("Erro Residencia: rua não pode ser null");
    }
    else if (rua.equals("")) {
      //Lancando um excecao.
      throw new RuntimeException("Erro Residencia: rua não pode ser vazio");
    }
    else {
      this.rua = rua;
    }
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  @Override
  public String toString() {
    return "Residencia [rua=" + this.rua + ", numero=" + this.numero + "]";
  }

}//Residencia.