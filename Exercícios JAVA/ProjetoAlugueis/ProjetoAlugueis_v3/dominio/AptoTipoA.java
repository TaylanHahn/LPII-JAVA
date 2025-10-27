package dominio;

//0,2 ponto
public class AptoTipoA extends Apto {
	public AptoTipoA(int numero, int andar, float area, Edificio edificio) {
		super(numero, andar, area, edificio);
	}
	
	public float precoExtra() {
		int andar = getAndar();
		
		return 100 * andar;
	}
	
}//Final classe AptoTipoA.
