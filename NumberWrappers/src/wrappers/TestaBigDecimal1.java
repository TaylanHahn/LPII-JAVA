package wrappers;
import java.math.BigDecimal;

public class TestaBigDecimal1 {

  public static void main(String[] args) {
    BigDecimal b1 = new BigDecimal(100);
    BigDecimal b2 = new BigDecimal("100.00");

    System.out.println("b1 = " + b1);
    System.out.println("b2 = " + b2);

    //N�mero de d�gitos ap�s a v�rgula.
    System.out.println("b1.scale() = " + b1.scale());
    System.out.println("b2.scale() = " + b2.scale());
    
    //N�mero de d�gitos do valor n�o escalado.
    System.out.println("b1.precision() = " + b1.precision());
    System.out.println("b2.precision() = " + b2.precision());
    
    System.out.println("b1.unscaledValue() = " + b1.unscaledValue());
    System.out.println("b2.unscaledValue() = " + b2.unscaledValue());

    System.out.println("b1.equals(b2) : " + b1.equals(b2)); //igualdade
    
    b1 = b1.setScale(2);
   
    System.out.println("b1.equals(b2) : " + b1.equals(b2)); //igualdade
    
    System.out.println("b1 = " + b1);
    System.out.println("b2 = " + b2);
  }

}//ComparacaoBigDecimal1.