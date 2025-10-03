package wrappers;
import java.math.BigDecimal;

public class TestaBigDecimal2 {

  public static void main(String[] args) {
    //Não funciona se usar o construtor BigDecimal(0.001);
    BigDecimal b1 = new BigDecimal("0.001");
    BigDecimal b2 = new BigDecimal("0");
    
    for (int i=0; i<1000000; i++) {
      b2 = b2.add(b1);
    }
    System.out.println("b1 = " + b1);
    System.out.println("b2 = " + b2);
  }

}//ComparacaoBigDecimal2.