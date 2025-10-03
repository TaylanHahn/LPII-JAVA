package formatacao;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TestaDecimalFormat2 {

  public static void main(String[] args) {
    double r;
    String s;    
    DecimalFormat df;

    df = new DecimalFormat("#,##0.00");
    //df = new DecimalFormat(",###.###");
    //df = new DecimalFormat("000,000,000,000.00");

    r = 1234567.1d;
    //r = 1234567.1234d;
    //r = 0.1234567d;
    
    System.out.println("df.toPattern() = " + df.toPattern());
    System.out.println("df.format(r)   = " + df.format(r));    
    System.out.println();
    
    //s = "21235678,987654321";     //ok
    s = "21.235.678,987654321"; //ok
    
    try {
      //Transforma de String para double.
      r = df.parse(s).doubleValue();
      //r = (Float)(df.parse(s));
      System.out.println(r);  
    }
    catch (ParseException e){
      System.out.println("O número está em formato incorreto: " + e.getMessage());
      //e.printStackTrace();
    }
  }//main
  
}//TestaDecimalFormat2.