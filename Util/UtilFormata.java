import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;

public class UtilFormata {

  //-----------------------------------  
  public static String paraString(int i){
    return Integer.toString(i);
  }//paraString()  

  //-----------------------------------  
  public static String paraString(float f){
    return NumberFormat.getInstance().format(f);
  }//paraString()

  //-----------------------------------  
  public static String paraString(double d){
    return NumberFormat.getInstance().format(d);    
  }//paraString()

  //-----------------------------------  
  public static String paraString(Date d){
    DateFormat df = DateFormat.getDateInstance();
    String s = df.format(d);
    return s;
  }//paraString()
  
  //-----------------------------------  
  public static int paraInt(String s){
    return Integer.parseInt(s);
  }//paraInt()
  
  //-----------------------------------  
  public static float paraFloat(String s){
    float f;
    try {
      //usa o caracter do sistema do usuário como separador (ponto, virgula, etc...).    	
      f = NumberFormat.getInstance().parse(s).floatValue();
    }
    catch (Exception e) {
      //System.out.println("Erro: Numero inteiro invalido!");
      throw new RuntimeException("Erro: Numero float invalido!");
    }    
    return f;
  }//paraFloat()

  //-----------------------------------  
  public static double paraDouble(String s){
    double d;
    try {
      //usa o caracter do sistema do usuário como separador (ponto, virgula, etc...).     
      d = NumberFormat.getInstance().parse(s).doubleValue();
    }
    catch (Exception e) {
      //System.out.println("Erro: Numero double invalido!");
      throw new RuntimeException("Erro: Numero double invalido!");
    }    
    return d;
  }//paraDouble()

  //-----------------------------------  
  public static Date paraDate(String s){
    DateFormat df = DateFormat.getDateInstance();
    Date d;
    try {
      d = df.parse(s);
    } catch (ParseException e) {
      //e.printStackTrace();
      //System.out.println("Erro: Data inválida!");
      throw new RuntimeException("Erro: Data inválida!");
    }
    return d;
  }//paraDate()
  
}//UtilFormata.