package pessoas;

public class Pessoa {
  /* Atributos com diversos especificadores de visibilidade:
  Visibilidade Tipo  Atributo//Descricao - Onde pode ser acessado */
  public     String  nome;   //Publico   - classe, pacote, subclasses, externo.
  protected  char    sexo;   //Protegido - classe, pacote, subclasses.
             int     idade;  //Padrao    - classe, pacote.
  private    int     codigo; //Privado   - classe.

  //Construtor da classe Pessoa  
  public Pessoa() {
  }
  
  //Outro construtor da classe Pessoa
  public Pessoa(String n, char s, int i, int cod) {
    this.nome   = n;
    this.sexo   = s;
    this.idade  = i;
    this.codigo = cod;   
  }

  //Um método para retornar o codigo da pessoa.
  public int getCodigo() {
    return this.codigo;
  }
  
  //Um método para imprimir na tela os valores dos atributos.
  public void tentaAcesso() {
    System.out.println(this.nome);   //public: todo mundo tem acesso.
    System.out.println(this.sexo);   //protected: pacote e sub-classes tem acesso.
    System.out.println(this.idade);  //default: o pacote pessoas tem acesso.
    System.out.println(this.codigo); //private: só a classe Pessoa tem acesso.
    
    //Um objeto Pessoa pode modificar qualquer atributo de outro objeto Pessoa.
    Pessoa p = new Pessoa();
    p.nome   = "Joao";
    p.sexo   = 'M';
    p.idade  = 30;
    p.codigo = 9; //<<<<<<
  }
  
  //Não pode ser diminuída a visibilidade nas subclasses.
  public void metodoPublico(){
    System.out.println("metodoPublico() de Pessoa.");
  }

  //Não pode ser diminuída a visibilidade nas subclasses.
  protected void metodoProtected(){
    System.out.println("metodoProtected() de Pessoa.");
  }
  
  //Não pode ser diminuída a visibilidade na subclasse Aluno, pois está no mesmo pacote.
  //Pode ser diminuída a visibilidade na subclasse Professor pois está em outro pacote.
  void metodoDefault(){    
    System.out.println("metodoDefault() de Pessoa.");
  }
  
  //Qualquer método pode ser aumentada a visibilidade.  
  private void metodoPrivado(){    
    System.out.println("metodoPrivado() de Pessoa.");
  }

  public void metodos(){
    metodoPublico();
    metodoProtected();
    metodoDefault();
    metodoPrivado();
  }
  
}//Pessoa.