import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;

//Nova API datetime, introduzida no Java 8.
//Tem precisão de nanosegundos.
public class TestaLocalDate1_criando {

  public static void main(String[] args) {
    LocalDate d;
    LocalTime t;
    LocalDateTime dt;
    int diaDoMes;
    DayOfWeek diaDaSemana;
    Month mes;

    //Cria um objeto com a data e hora atual.
    dt = LocalDateTime.now();
    System.out.println(dt);

    //Cria um objeto com data/hora 30 de dezembro de 2021, 15h55.
    dt = LocalDateTime.of(2021, 12, 30, 15, 55);
    System.out.println(dt);

    //Cria um objeto com data/hora 30 de dezembro de 2021, 15h55.
    dt = LocalDateTime.of(2021, Month.DECEMBER, 30, 15, 55);
    System.out.println(dt);

    //Cria um objeto com data/hora 30 de dezembro de 2021, 15h55m30s.
    dt = LocalDateTime.of(2021, 12, 30, 15, 55, 30);
    System.out.println(dt);

    //347 nanossegundos
    dt = LocalDateTime.of(2021, 12, 30, 15, 55, 30, 347);
    System.out.println(dt);

    //347 microssegundos
    dt = LocalDateTime.of(2021, 12, 30, 15, 55, 30, 347000);
    System.out.println(dt);

    //347 milissegundos
    dt = LocalDateTime.of(2021, 12, 30, 15, 55, 30, 347000000);
    System.out.println(dt);

    //Cria um objeto com a data atual.
    d = LocalDate.now();

    //Cria um objeto com a hora atual.
    t = LocalTime.now();

    //Combina (concatena) a data e a hora.
    dt = LocalDateTime.of(d, t);
    System.out.println(dt);

    diaDoMes = dt.getDayOfMonth();

  }

}//TestaLocalDateTime