
import java.util.Calendar;
import java.util.Date;

public class TestaCalendar2 {

  public static void main(String[] args) {
    Calendar cal;
    Date d;

    //Cria uma inst�ncia de Calendar.
    cal = Calendar.getInstance();

    //Atribui a seguinte data: 20 de Dezembro de 2009.
    cal.set(2009, 11, 20, 0, 0, 0);
    d =cal.getTime();
    System.out.println(d);
    
    //5 fev 2010
    cal.set(2010, 1, 5, 0, 0, 0);
    System.out.println(d);
    d =cal.getTime();
    System.out.println(d);        
    
  }//main

}//TestaCalendar2.