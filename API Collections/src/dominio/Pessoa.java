package dominio;

public class Pessoa implements Comparable<Pessoa> {
  private int    codigo;
  private String nome;
  private int    idade;
  private float  peso;

  public Pessoa(int c, String n, int i, float p) {
    this.codigo = c;
    this.nome  = n;
    this.idade = i;
    this.peso  = p;
  }

  public String toString() {
    return this.codigo + " " + this.nome + " " + this.idade + " " + this.peso + " ";
  }

  //Aten��o!!!
  //Este m�todo n�o est� compat�vel com equals() e hashCode()
  public int compareTo(Pessoa p) {
    //Compara por nome.
    if (this.nome.compareTo(p.getNome()) != 0)
      return this.nome.compareTo(p.getNome());
    else
      //Compara por idade.
      if (this.idade - p.getIdade() != 0)
        return this.idade - p.getIdade();
      else
        //Compara por peso.
        if (this.peso > p.getPeso())
          return 1;
        else if (this.peso < p.getPeso())
          return -1;
        else
          return 0;
  }
  
  //Aten��o!!!
  //Este m�todo n�o est� compat�vel com compareTo() e hashCode()
  public boolean equals(Object o) {
    Pessoa p = (Pessoa)o;
    return (this.nome.equals(p.getNome())) && 
           (this.idade == p.getIdade());
  }

  //Aten��o!!!
  //Este m�todo n�o est� compat�vel com compareTo() e equals()
  public int hashCode(){
    return this.nome.hashCode();
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
  
}//Pessoa.