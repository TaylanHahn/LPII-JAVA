package dominio;

public abstract class Apto {
    private int num;
    private int andar;
    private float area;
    private boolean alugado;

    //0,2 ponto
    private Inquilino inquilino;

    //0,2 ponto
    public abstract float precoExtra(); 

    public Apto(int num, int andar, float area) {
        this.num = num;
        this.andar = andar;
        this.area = area;
        this.inquilino = null;
        this.alugado = false;
    }

    public int getNum() {
        return num;
    }

    public int getAndar() {
        return andar;
    }

    public float getArea() {
        return area;
    }

    public boolean isAlugado() {
        return this.alugado;
    }

    //0,2 ponto
    public Inquilino getInquilino() {
        return this.inquilino;
    }

    //0,4 ponto
    public void aluga(Inquilino i) {
    	if (!this.alugado) { //não exigi esse teste.
          this.inquilino = i;
          this.alugado = true;
    	}
    }

    //0,4 ponto
    public void desaluga() {
        this.inquilino = null;
        this.alugado = false;
    }

    //0,3 ponto
    public float precoFinal() {
        return 10 * getArea() + precoExtra();
    }
    
}//Fim Classe Apto.