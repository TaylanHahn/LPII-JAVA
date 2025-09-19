package dominio;

public class Professor extends Pessoa {
  private String formacao;
  private int    cargaHoraria;
  
  public Professor(String nome, String cpf, Endereco endereco) {
	super(nome, cpf, endereco);
  }

  public Professor(String nome, String cpf, Endereco endereco, String f) {
	    this(nome, cpf, endereco);
		setFormacao(f);
  }

  public Professor(String nome, String cpf, Endereco endereco, String f, int ch) {
		this(nome, cpf, endereco, f);
		setCargaHoraria(ch);	
  }

  //--- Titulo ---
  public String getFormacao() {
    return formacao;
  }
  
  public void setFormacao(String t) {
    formacao = t;
  }
  
  //--- Carga Horaria ---
  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int ch) {
    cargaHoraria = ch;
  }
  
  //--- toString() ---
  public String toString() {
    return super.toString() + " Professor [formacao=" + this.getFormacao() + ", cargaHoraria=" + this.getCargaHoraria() +"]";
  }

  //Sobrescrita de método (overriden).
  //Este método já existe na superclasse Pessoa, mas foi re-implementado (sobrescrito) aqui.
  //
  //Este método foi criado somente para demonstração,
  //lembrando que este não é o melhor local para implementação de um método 
  //relativo à interface de usuário (tela).
  public void mostraDados() {
    System.out.println("============================================");
    super.mostraDados(); //Invoca o método mostraDados() da superclasse Pessoa.
    System.out.println("------------");
    System.out.println("Formacao   : " + formacao);
    System.out.println("Carga Hor. : " + cargaHoraria);
    System.out.println("============================================");
  }
  
}//Professor.