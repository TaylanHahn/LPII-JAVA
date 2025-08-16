import javax.swing.JOptionPane;

public class TestaShowConfirmDialog {

  public static void main(String[] args) {
    int i;

    //Primeiro formato.
    i = JOptionPane.showConfirmDialog(null, "Mensagem"); //YES NO CANCEL
    
    //Segundo formato.
    i = JOptionPane.showConfirmDialog(null, "Mensagem", "Titulo", JOptionPane.DEFAULT_OPTION); //OK
    i = JOptionPane.showConfirmDialog(null, "Mensagem", "Titulo", JOptionPane.OK_CANCEL_OPTION);    
    i = JOptionPane.showConfirmDialog(null, "Mensagem", "Titulo", JOptionPane.YES_NO_OPTION);
    i = JOptionPane.showConfirmDialog(null, "Mensagem", "Titulo", JOptionPane.YES_NO_CANCEL_OPTION);
    
    //Terceiro formato.
    i = JOptionPane.showConfirmDialog(null, "Pressione um botão.", "Titulo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
    
    //Testando o botão clicado. 
    if (i == JOptionPane.OK_OPTION) {
        System.out.println("Voce escolheu YES.");
    }
    else if (i == JOptionPane.NO_OPTION) {
        System.out.println("Voce escolheu NO.");
    }
    else if (i == JOptionPane.CANCEL_OPTION){
      System.out.println("Voce escolheu Cancel.");
    }
    else {
      System.out.println("Voce nao escolheu nenhum botão.");
    }
    
    //Testando o botão clicado.
    switch (i) {
      //YES e OK são iguais
      //case JOptionPane.YES_OPTION:    
      case JOptionPane.OK_OPTION:
           System.out.println("Botão OK ou YES pressionado");
           JOptionPane.showMessageDialog(null, "Botão OK ou YES pressionado");
           break;
      case JOptionPane.NO_OPTION:
           System.out.println("Botão NO pressionado");
           JOptionPane.showMessageDialog(null, "Botão NO pressionado");
           break;        
      case JOptionPane.CANCEL_OPTION:
           System.out.println("Botão CANCEL pressionado");
           JOptionPane.showMessageDialog(null, "Botão CANCEL pressionado");
           break;
      case JOptionPane.CLOSED_OPTION:
           System.out.println("Nenhum botão pressionado");
           JOptionPane.showMessageDialog(null, "Nenhum botão pressionado");
           break;                          
      default:
           System.out.println("Nenhuma das opções");
           JOptionPane.showMessageDialog(null, "Nenhuma das opções");      
    }
  }//main()

}//TestaShowConfirmDialog.