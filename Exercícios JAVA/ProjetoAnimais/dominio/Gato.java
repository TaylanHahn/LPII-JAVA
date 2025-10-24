package dominio;

public class Gato extends Animal{

	public Gato(String nome, float peso, Regiao regiao){
		super(nome, peso, regiao);
	}
	
	public float velocidade(){
		float v = 0;
		if(getRegiao().getTempMedia() < 20){
			v = 30f;
		}
		else{
			v = 40f;
		}
		return v;
	}
	
}//Gato.