
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestaDate2 {

  public static void main(String[] args) {
    String s;

    //Pega a data/hora atual.
    Date d1 = new Date();	  
    System.out.println("----------- Date() ----------------");
    System.out.println(d1); 
    System.out.println(d1.toString());
    System.out.println(d1.toLocaleString());
    System.out.println(d1.toGMTString());
    System.out.println();

    System.out.println("----- new Date(2008-1900, 3, 25, 23, 0, 0) ------");
    Date d2 = new Date(2008-1900, 3, 25, 23, 0, 0); //25 Abril 2008 23:00:00 (local) 
    System.out.println(d2);                 //Fri Apr 25 23:00:00 GMT-03:00 2008
    System.out.println(d2.toLocaleString());//25/04/2008 23:00:00
    System.out.println(d2.toGMTString());   //26 Apr 2008 02:00:00 GMT
    System.out.println();

    s = "03/26/2008"; //26 Mar 2008.
    System.out.println("--------- new Date(\"03/26/2008\") --------------");
    Date d3 = new Date(s); //a hora ser� inicializada com zero.
    System.out.println(d3);                 //Wed Mar 26 00:00:00 GMT-03:00 2008     
    System.out.println(d3.toLocaleString());//26/03/2008 00:00:00
    System.out.println(d3.toGMTString());   //26 Mar 2008 03:00:00 GMT
    System.out.println();

    System.out.println("-------- d2 = sdf.parse(\"27/03/2008\") ----------");
    s = "27/03/2008";
    //SimpleDateFormat df = new SimpleDateFormat(); //default locale.
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //<<<
    System.out.println(sdf.toString()); //java.text.SimpleDateFormat@d936eac0
    System.out.println(sdf.toPattern());         //dd/MM/yyyy
    System.out.println(sdf.toLocalizedPattern());//dd/MM/yyyy
    try {
      Date d4 = sdf.parse(s); //<<<
      //Date d4 = DateFormat.getDateInstance().parse(s);	    
      System.out.println(d4.toString());      //Thu Mar 27 00:00:00 GMT-03:00 2008
      System.out.println(d4.toLocaleString());//27/03/2008 00:00:00
      System.out.println(d4.toGMTString());   //27 Mar 2008 03:00:00 GMT
      System.out.println(sdf.format(d4));     //27/03/2008 <<<
      System.out.println(DateFormat.getDateInstance().format(d4)); //27/03/2008
    }
    catch (ParseException e) {
      System.out.println(e.getMessage());
    }
    //System.out.println(DateFormat.getDateInstance().getClass().getName());
  }//main()
  
}//TestaDate2.