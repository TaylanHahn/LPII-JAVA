package wrappers;
import java.math.BigInteger;

public class TestaBigInteger {

  public static void main(String[] args) {
    BigInteger big;
                 long l = 1000000000000000000L;
    System.out.println("L = " + l);
    big = new BigInteger("10000000000000000000000001");
    
    big = big.add(new BigInteger("1"));
    
    System.out.println(big);
  }

}//TestaBigInteger.