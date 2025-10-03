package formatacao;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TestaString {

  public static void main(String[] args) {
    double f1;
    DecimalFormat df = new DecimalFormat("###,###,###.##");
    String s1, s2, s3;

    s1 = "1235,67891234";

    try {
      f1 = df.parse(s1).doubleValue();
      s2 = df.format(f1);

      System.out.println(f1);      
      System.out.printf ("%10.2f \n", f1);      
      System.out.println(s2);  

      System.out.println();
      s3 = String.format("%10.2f", f1);      
      System.out.println(s3);      

    }
    catch (ParseException e){
      System.out.println(e.getMessage());
    }

    int i;
    s1 = "10";
    i = Integer.parseInt(s1);
    String.valueOf(i);
  }//main

}//TestaString.