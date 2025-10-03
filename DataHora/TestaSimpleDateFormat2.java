
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestaSimpleDateFormat2 {

  public static void main(String[] args) {
    String s1, s2, s3, s_aux;
    Date d1, d2, d3, d4;
    SimpleDateFormat sdf1, sdf2, sdf3;    

    sdf1 = new SimpleDateFormat();             //Formato default do local.
    sdf2 = new SimpleDateFormat("dd/MM/yyyy"); //Formato especificado.
    sdf3 = new SimpleDateFormat("dd/MM");      //Formato especificado.

    //Pega a data/hora atual.
    d1 = new Date();
    d3 = d2 = d1 ;
    s1 = d1.toString();
    System.out.println("d1.toString()  : " + s1);

    s1 = sdf1.format(d1);
    System.out.println("sdf1.format(d1): " + s1);

    s2 = sdf2.format(d2);
    System.out.println("sdf2.format(d2): " + s2);

    s3 = sdf3.format(d3);
    System.out.println("sdf3.format(d3): " + s3);

    System.out.println();	  

    try {
      s_aux = "27/03/2008";
      d4 = sdf2.parse(s_aux);
      System.out.println("d1.toString()  : " + d4);
    }
    catch (ParseException e) {
      System.out.println(e.getMessage());
    }

  }//main
}//class
