package ford;

import interfaces.ICarro;

public class FordSat implements ICarro {
  private float velocidade;

  public FordSat() {
    velocidade = 0;
  }
  
  public String marca() {
	  return "Ford - AutoSat";
  }
  
  public void acelera(){
    velocidade += 10;  // velocidade = velocidade + 10
    System.out.println(velocidade);
  }
  
  public void freia() {
    velocidade -= 10;  
    System.out.println(velocidade);    
  }

}//FordSat.
