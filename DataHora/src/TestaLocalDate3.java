import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;

public class TestaLocalDate3 {

  public static void main(String[] args) {
    LocalDate d;
    LocalTime t;
    LocalDateTime dt;
    int diaDoMes;
    DayOfWeek diaDaSemana;
    Month mes;

    //Cria um objeto com data/hora 30 de dezembro de 2021, 15h55.
    dt = LocalDateTime.of(2021, 12, 30, 15, 55);
    System.out.println(dt);

    TemporalAdjuster ta = TemporalAdjusters.firstDayOfMonth();
    dt = dt.with(ta);
    System.out.println(dt);
    
    diaDaSemana = dt.getDayOfWeek();

  }

}//TestaLocalDateTime3