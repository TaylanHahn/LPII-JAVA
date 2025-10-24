package dominio;

public class Cao extends Animal{

	public Cao(String nome, float peso, Regiao regiao){
		super(nome, peso, regiao);
	}
	
	public float velocidade(){
		return getPeso() * 2f;
	}
	
}//Cao.