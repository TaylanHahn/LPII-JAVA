
import java.util.Calendar;
import java.util.Date;

public class TestaCalendar1 {

  public static void main(String[] args) {
    Date d1;
    Calendar cal;
    int dia, mes, ano;

    //Pega a data/hora atual.
    d1 = new Date();
    //d1 = new Date("04/13/2009");
    System.out.println("d1.toString()  : " + d1.toString());

    //Cria uma inst�ncia de Calendar.
    cal = Calendar.getInstance();
    cal.setTime(d1);

    dia     = cal.get(Calendar.DATE);
    mes     = cal.get(Calendar.MONTH);
    mes++; //Ajusta o mes (incrementa 1)
    ano     = cal.get(Calendar.YEAR);

    System.out.println("Dia = " + dia);
    System.out.println("Mes = " + mes);
    System.out.println("Ano = " + ano);
    System.out.println();

    System.out.println("DATE                ="+cal.get(Calendar.DATE));
    System.out.println("DAY_OF_MONTH        ="+cal.get(Calendar.DAY_OF_MONTH));
    System.out.println("MONTH               ="+cal.get(Calendar.MONTH));
    System.out.println("YEAR                ="+cal.get(Calendar.YEAR));
    System.out.println();

    System.out.println("DAY_OF_YEAR         ="+cal.get(Calendar.DAY_OF_YEAR));
    System.out.println("DAY_OF_WEEK         ="+cal.get(Calendar.DAY_OF_WEEK) + " (1 = domingo, 2=segunda, ...) ");
    System.out.println("WEEK_OF_MONTH       ="+cal.get(Calendar.WEEK_OF_MONTH));        //Semana come�a segunda-feira.
    System.out.println("DAY_OF_WEEK_IN_MONTH="+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //Dia da semana no mes.
    System.out.println("WEEK_OF_YEAR        ="+cal.get(Calendar.WEEK_OF_YEAR));
    System.out.println();

    System.out.println("HOUR                ="+cal.get(Calendar.HOUR));
    System.out.println("MINUTE              ="+cal.get(Calendar.MINUTE));
    System.out.println("SECOND              ="+cal.get(Calendar.SECOND));
    System.out.println("MILLISECOND         ="+cal.get(Calendar.MILLISECOND));
    System.out.println("HOUR_OF_DAY         ="+cal.get(Calendar.HOUR_OF_DAY));
    System.out.println();

    //daylight savings offset in milliseconds
    System.out.println("DST_OFFSET          ="+cal.get(Calendar.DST_OFFSET));

    //raw offset from GMT in milliseconds
    System.out.println("ZONE_OFFSET         ="+cal.get(Calendar.ZONE_OFFSET));

    //AC ou DC
    System.out.println("ERA                 ="+cal.get(Calendar.ERA));

    System.out.println("FIELD_COUNT         ="+Calendar.FIELD_COUNT);

    cal.set(Calendar.YEAR, 2000);
    
    System.out.println(cal);
    
    System.out.println(d1);
  }//main

}//TestaCalendar.