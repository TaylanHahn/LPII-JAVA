package dominio;

public abstract class Animal {

	private String nome;
	private float peso;
	private Regiao regiao;

	public abstract float velocidade();

	public Animal(String nome, float peso, Regiao regiao){
		this.nome = nome;
		this.peso = peso;
		//Região obrigatória
		if (regiao != null) {
			this.regiao = regiao;
		}
		else {
			throw new RuntimeException("Erro: Regiao Nula.");
		}
	}

	public String getNome() {
		return nome;
	}

	public float getPeso() {
		return peso;
	}

	public Regiao getRegiao() {
		return regiao;
	}

	public float forca(){
		return this.peso * velocidade();
	}

}//Animal.