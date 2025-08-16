import java.util.Scanner;

/*
  Exemplo para demonstração de entrada pelo teclado
  utilizando a classe Scanner.
  
  Observação:
  Os métodos next(), nextInt(), nextFloat() ignoram 
todos os espacos, \n e \r. Entretanto, o \n, \r ou \r\n 
continua no buffer do Scanner.
  O método nexLine() le ate encontrar um \n, \r ou \r\n, 
retirando-o do buffer.
  Portanto, após executar um metodo next(), nextInt() ou nextFloat(), 
deveríamos chamar uma vez o método nextLine() 
para retirar do buffer o final de linha (\n, \r ou \r\n).
*/
    
public class TestaLeituraTecladoAvancado {
	
  public static void main(String[] args) {

    //Variaveis auxiliares
    String nome;   //nome
    char   sexo;   //sexo
    int    idade;  //idade    
    float  n1, n2; //nota 1 e nota 2.
    float  media;  //media.
    
    //Objeto para ler do teclado.
    Scanner t = new Scanner(System.in);

    //Le o nome do aluno.
    System.out.print("Digite o nome do aluno: ");
    nome = t.nextLine();
    
    //Le a idade do aluno.
    System.out.print("Digite a idade do aluno: ");
    idade = t.nextInt(); 
    //artificio para retirar do buffer os caracteres de nova linha \r\n
    t.nextLine(); 
    
    //Le o sexo do aluno.
    System.out.print("Digite o sexo do aluno: ");
    sexo = t.nextLine().charAt(0);
    
    //Le a nota 1 do aluno.
    System.out.print("Digite a nota 1 do aluno: ");
    n1 = t.nextFloat(); 
    //artificio para retirar do buffer os caracteres de nova linha \r\n
    t.nextLine(); 

    //Le a nota 2 do aluno.
    System.out.print("Digite a nota 2 do aluno: ");
    n2 = t.nextFloat(); 
    //artificio para retirar do buffer os caracteres de nova linha \r\n
    t.nextLine(); 

    media = (n1 + n2) / 2;
    
    System.out.println();
    System.out.println("Nome   = " + nome);
    System.out.println("Idade  = " + idade);
    System.out.println("Sexo   = " + sexo);
    System.out.println("Nota 1 = " + n1);
    System.out.println("Nota 2 = " + n2);
    System.out.println("Media  = " + media);
    System.out.println();

    System.out.format("Nome: %s - Idade: %d - Sexo: %c \n", nome, idade, sexo);
    System.out.format("Nota 1 = %10.2f \n", n1);
    System.out.format("Nota 2 = %10.2f \n", n2);
    System.out.format("Media  = %10.2f \n", media);
    System.out.println();       
  }//main()
  
}//TestaLeituraTecladoAvancado.