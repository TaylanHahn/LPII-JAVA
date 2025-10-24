package dominio;

public class Funcionario implements Comparable<Funcionario>{
  private int     codigo;
  private String  nome;
  private int     idade;
  private float   peso;

  public Funcionario(int c, String n, int i, float p) {
    this.codigo = c;
    this.nome  = n;
    this.idade = i;
    this.peso  = p;
  }

  public String toString() {
    return this.codigo + " " + this.nome + " " + this.idade + " " + this.peso + " ";
  }  
  
  //Funcion�rios s�o comparados primeiro por nome e em caso de empate por idade.
  public int compareTo(Funcionario f) {
    if (this.nome.compareTo(f.getNome()) != 0)
      return (this.nome.compareTo(f.getNome()));
    else
      return (this.idade - f.getIdade());
  }

  //N�o � necess�rio, mas recomendado para ficar consistente
  //com o m�todo compareTo().
  public boolean equals(Object o) {
    Funcionario p = (Funcionario)o;
    return this.nome.equals(p.getNome()) &&
           this.idade == p.getIdade();
  }

  //N�o � necess�rio, mas recomendado para ficar consistente
  //com o m�todo equals().
  public int hashCode(){
    return this.nome.hashCode() + Integer.valueOf(this.idade).hashCode();
    //return this.nome.hashCode() + ((Integer)(this.idade)).hashCode();
  }
  
  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

}//Funcionario.