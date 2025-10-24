package dominio;

public class EmprA extends Empr {
  
  public EmprA(String n) {
    super(n);
  }
  
  public float txCom() {
    return getFiliais().size() / 100.0f;
  }

}
