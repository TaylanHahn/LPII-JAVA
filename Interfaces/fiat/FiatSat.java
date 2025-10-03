package fiat;

import interfaces.ICarro;

public class FiatSat extends CarroFiat implements ICarro {
  private float vel;

  public FiatSat() {
    vel = 0;
  }
  
  public String marca() {
	  return "FiatSat";
  }

  public void acelera(){
    vel += 1;  
    System.out.println(vel);
    vel += 3;  
    System.out.println(vel);    
    vel += 5;  
    System.out.println(vel);    
    vel += 6;  
    System.out.println(vel);    
  }
  
  public void freia() {
    vel -= 6;
    System.out.println(vel);
    vel -= 5;
    System.out.println(vel);    
    vel -= 3;  
    System.out.println(vel);    
    vel -= 1;  
    System.out.println(vel);  
  }
    

}//CarroSat.
