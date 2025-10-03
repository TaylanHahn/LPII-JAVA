import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;

public class TestaLocalDate2_get {

  public static void main(String[] args) {
    LocalDateTime dt;
    DayOfWeek diaDaSemana;
    Month mes;
    int i;
    long l;
    
    //Cria um objeto com data/hora 30 de dezembro de 2021, 15h55.
    dt = LocalDateTime.of(2021, 12, 30, 15, 55, 2);
    System.out.println(dt);

    i = dt.getYear();
    System.out.println("getYear()    = " + i);

    i = dt.getMonthValue();
    System.out.println("getMonthValue() = " + i);

    i = dt.getDayOfMonth();
    System.out.println("getDayOfMonth() = " + i);

    i = dt.getHour();
    System.out.println("getHour()       = " + i);
    
    i = dt.getMinute();
    System.out.println("getMinute()     = " + i);
    
    i = dt.getDayOfYear();
    System.out.println("getDayOfYear    = " + i);

    i = dt.get(ChronoField.YEAR);
    System.out.println("YEAR = " + i);

    i = dt.get(ChronoField.MONTH_OF_YEAR);
    System.out.println("MONTH_OF_YEAR = " + i);

    i = dt.get(ChronoField.DAY_OF_MONTH);
    System.out.println("DAY_OF_MONTH = " + i);

    i = dt.get(ChronoField.HOUR_OF_DAY);
    System.out.println("HOUR_OF_DAY = " + i);
    
    i = dt.get(ChronoField.MINUTE_OF_HOUR);
    System.out.println("MINUTE_OF_HOUR = " + i);

    i = dt.get(ChronoField.DAY_OF_YEAR);
    System.out.println("DAY_OF_YEAR = " + i);

    i = dt.get(ChronoField.CLOCK_HOUR_OF_AMPM);
    System.out.println("CLOCK_HOUR_OF_AMPM = " + i);

    i = dt.get(ChronoField.HOUR_OF_AMPM);
    System.out.println("HOUR_OF_AMPM = " + i);

    l = dt.getLong(ChronoField.MILLI_OF_DAY);
    System.out.println("INSTANT_SECONDS = " + l);

    l = dt.getLong(ChronoField.MICRO_OF_DAY);
    System.out.println("INSTANT_SECONDS = " + l);

    mes         = dt.getMonth();
    System.out.println(mes.getValue());
    System.out.println(mes.name());
    System.out.println(mes.firstDayOfYear(false));
    
    
    
    diaDaSemana = dt.getDayOfWeek();

  }

}//TestaLocalDateTime2