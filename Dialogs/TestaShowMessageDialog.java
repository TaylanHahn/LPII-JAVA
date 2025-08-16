import javax.swing.JOptionPane;

public class TestaShowMessageDialog {

  public static void main(String[] args) {
    //Primeiro formato.
    JOptionPane.showMessageDialog(null, "Minha Mensagem");
    
    //Segundo formato.
    JOptionPane.showMessageDialog(null, "mensagem de erro",           "Titulo", JOptionPane.ERROR_MESSAGE);
    JOptionPane.showMessageDialog(null, "mensagem de informação",     "Titulo", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "mensagem de atenção",        "Titulo", JOptionPane.WARNING_MESSAGE);      
    JOptionPane.showMessageDialog(null, "mensagem de questionamento", "Titulo", JOptionPane.QUESTION_MESSAGE);      
    JOptionPane.showMessageDialog(null, "mensagem plana",             "Titulo", JOptionPane.PLAIN_MESSAGE);

    String[] v = {"Abacaxi","Laranja","Maçã"};
    JOptionPane.showMessageDialog(null, v);
    
    float f = 5;
    int i = 0;
    
    f = Float.parseFloat("5.8");
    JOptionPane.showMessageDialog(null, f);
    
  }//main()

}//TestaShowMessageDialog.