package dominio;

public abstract class Apto {
	private int numero;
	private int andar;
	private float area;
	private boolean alugado;
	
	//0,2 ponto
	private Edificio edificio;

	//0,2 ponto
	public abstract float precoExtra();
	
	//0,3 ponto
	public Apto(int numero, int andar, float area, Edificio edificio) {
		if (edificio == null) {
			throw new RuntimeException();
		}
		
		this.numero = numero;
		this.andar = andar;
		this.area = area;
		this.edificio = edificio;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getAndar() {
		return this.andar;
	}
	
	public float getArea() {
		return this.area;
	}
	
	public boolean isAlugado() {
		return this.alugado;
	}
	
	//0,2 ponto
	public Edificio getEdificio() {
		return this.edificio;
	}
	
	//0,3 ponto
	public float precoFinal() {
		float precoBase = 10 * this.area;
		float precoExtra = precoExtra();
		
		return precoBase + precoExtra;
	}
	
	public void setAlugado(boolean b) {
		this.alugado = b;
	}	
	
}//Final classe Apto.
