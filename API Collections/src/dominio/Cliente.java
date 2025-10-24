package dominio;

public class Cliente implements Comparable<Cliente>{
  private int     codigo;
  private String  nome;
  private int     idade;
  private float   peso;

  public Cliente(int c, String n, int i, float p) {
    this.codigo = c;
    this.nome  = n;
    this.idade = i;
    this.peso  = p;
  }

  public String toString() {
    return this.codigo + " " + this.nome + " " + this.idade + " " + this.peso + " ";
  }  
  
  //Clientes s�o comparados primeiro por nome,
  //em caso de empate por idade e em caso de empate por peso.
  public int compareTo(Cliente c) {
    if (this.nome.compareTo(c.getNome()) != 0)
      return (this.nome.compareTo(c.getNome()));
    else if (this.idade - c.getIdade() != 0)
      return this.idade - c.getIdade();
    else if (this.peso > c.peso)
      return 1;
    else if (this.peso < c.peso)
      return -1;
    else 
      return 0;     
  }

  //N�o � necess�rio, mas recomendado para ficar consistente
  //com o m�todo compareTo().
  public boolean equals(Object o) {
    Cliente c = (Cliente)o;
    return this.nome.equals(c.getNome()) &&
           this.idade == c.getIdade()    &&
           this.peso == c.getPeso();
  }

  //N�o � necess�rio, mas recomendado para ficar consistente
  //com o m�todo equals().
  public int hashCode(){
    return this.nome.hashCode() + Integer.valueOf(this.idade).hashCode() + Float.valueOf(this.peso).hashCode();
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

}//Cliente.