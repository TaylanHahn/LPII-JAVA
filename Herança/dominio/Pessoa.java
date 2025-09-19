package dominio;

public class Pessoa {
  private String   nome;
  private String   cpf;
  private Endereco endereco;

  public Pessoa(String nome, String cpf, Endereco endereco) {
    setNome(nome);
    setCpf(cpf);
    setEndereco(endereco);
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
if (nome == null) {
    new RuntimeException("Erro Pessoa: nome nao pode ser null");
  }
  else if (nome.equals("")) {
    new RuntimeException("Erro Pessoa: nome nao pode ser vazio");
  }
  else {
    this.nome = nome;
  }
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	if (cpf == null) {
	    new RuntimeException("Erro Pessoa: cpf nao pode ser null");
	  }
	  else if (cpf.length() != 14) {
	    new RuntimeException("Erro Pessoa: cpf deve possuir exatamente 14 caracteres");
	  }
	  else {
	    this.cpf = cpf;
	  }
}

public Endereco getEndereco() {
	return endereco;
}

public void setEndereco(Endereco endereco) {
	if (endereco != null )
		this.endereco = endereco;
	else
		throw new RuntimeException("Erro Pessoa: endereco nao pode ser null");
}

@Override
public String toString() {
	return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + "]";
}

//Este método foi criado somente para demonstração,
//lembrando que este não é o melhor local para implementação de um método 
//relativo à interface de usuário (tela).
  public void mostraDados() { 
    System.out.println("Nome       : " + nome);
    System.out.println("CPF        : " + cpf);
    System.out.println("------------");
    //Delegando a responsabilidade de mostrar os dados do endereco 
    //para o objeto endereco.
     endereco.mostraDados();
  }//mostraDados()
  
}//Pessoa.