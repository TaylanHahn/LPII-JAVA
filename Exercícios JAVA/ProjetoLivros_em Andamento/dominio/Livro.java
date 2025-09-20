package ProjetoLivros.dominio;

public class Livro {
    private String codigo;
    private boolean disponivel;
    private Prateleira prateleira;

    public Livro(String cod, Prateleira p) {
        this.getCodigo();
        if(p != null){
            this.getPrateleira();
    }
    }

    public String getCodigo() {
        return codigo;
    }

   public void setDisponivel(boolean d){
        
   }

    public boolean getDisponivel() {
        return disponivel;
    }

    public Prateleira getPrateleira(){
        return prateleira;
    }

}
