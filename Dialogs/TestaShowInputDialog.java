import javax.swing.JOptionPane;

public class TestaShowInputDialog {

  public static void main(String[] args) {
    String s1, s2, s3;
    
    //Primeiro formato.
    s1 = JOptionPane.showInputDialog("Mensagem");
    
    //Segundo formato.    
    s2 = JOptionPane.showInputDialog("Mensagem", "valor");
    
    //Terceiro formato.    
    s3 = JOptionPane.showInputDialog(null, "Mensagem", "Titulo", JOptionPane.INFORMATION_MESSAGE);

    JOptionPane.showMessageDialog(null, s1);
    JOptionPane.showMessageDialog(null, s2);
    JOptionPane.showMessageDialog(null, s3);
  }//main()

}//TestaShowInputDialog.