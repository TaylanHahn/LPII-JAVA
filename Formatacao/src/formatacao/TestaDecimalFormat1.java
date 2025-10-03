package formatacao;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class TestaDecimalFormat1 {

  public static void main(String[] args) throws ParseException {
    double r;
    String s;    
    DecimalFormat df;

    //NumberFormat f = NumberFormat.getInstance();
    //if (f instanceof DecimalFormat) {
    //    df = (DecimalFormat) f;
    //    df.applyPattern("#,##0.00");
    //}
    //else {
    //    df = new DecimalFormat("#,##0.00");
    //}
    
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

    //Transforma de String para double.
    r = df.parse(s).doubleValue();
    //r = (Float)(df.parse(s));
    System.out.println(r);      
  }//main
  
}//TestaDecimalFormat1.