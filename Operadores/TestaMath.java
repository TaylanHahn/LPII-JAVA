public class TestaMath {
  public static void main(String[] args) {
    int i;
    double d;
    float x, f;

    x = 10;
	  
    d = Math.sqrt(x);
    f = (float) Math.sqrt(x);
	  
    System.out.println(d);
    System.out.println(f);
 
    System.out.println("E              = " + Math.E);
    System.out.println("PI             = " + Math.PI);
    System.out.println("pow(x,3)       = " + Math.pow(x, 3));
    System.out.println("random  0 a  1 = " + Math.random());
    System.out.println("random  0 a 10 = " + Math.random() * 10);
    System.out.println("random 50 a 60 = " + (Math.random() * 10 + 50));
  
    d = Math.sqrt(10); 
    i = (int)Math.round(d);
    System.out.println("round          = " + i);

  }//main()

}//TestaMath.