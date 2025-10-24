package dominio;

public class EmprX extends Empr{

  public EmprX(String n) {
    super(n);
  }
  
  public float txCom() {
    float fat = fatTotal();
    float tx;
    if (fat <= 1000) {
      tx = 0.01f;
    }
    else if (fat <= 2000) {
      tx = 0.02f;
    }
    else {
      tx = 0.03f;
    }
    return tx;
  }
}
