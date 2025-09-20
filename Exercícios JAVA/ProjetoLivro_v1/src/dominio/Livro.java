package dominio;

//atributo
public class Livro {
  private String codigo;
  private boolean disponivel = true; //Tem que inicializar com true.
  private Prateleira prateleira;     //Para implementar a associação Livro->(1)Prateleira

  // construtor
  public Livro(String c, Prateleira p) {
    //Associação obrigatória tem que testar.
    if (p != null) {
      this.codigo = c;
      this.prateleira = p;
    }
    else {
      throw new RuntimeException("Erro: prateleira null.");
    }
  }

  // metodo
  public String getCodigo() {
    return this.codigo;
  }

  public Boolean getDisponivel() {
    return this.disponivel;
  }

  public Prateleira getPrateleira() {
    return this.prateleira;
  }

  public void setDisponivel(boolean disp) {
    this.disponivel = disp;
  }
  //Nao implementar os setters()

}//Livro.