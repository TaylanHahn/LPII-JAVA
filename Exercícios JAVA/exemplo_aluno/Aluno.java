package exemplo_aluno; // necessário indicar o pacote "pasta"

public class Aluno {
    public String nome;
    public float nota1;
    private float nota2;

    // Criação de um construtor, onde só me permite instanciar a classe aluno, se eu passar no mínimo o nome.
    public Aluno(String n){
        if(n != null){
            throw new RuntimeException("Erro: Aluno sem nome");
        } else if (n.length() < 3){
            throw new RuntimeException("Erro: Nome Aluno com menos de 3 caracteres");
        } else {
            this.nome = n;
        } 
    }

    // Também só permite instanciar se eu passar nome, nota 1 e nota 2
    public Aluno(String n, float n1, float n2){
        if(n != null){
            this.nome = n;
            this.nota1 = n1;
            this.nota2 = n2;
        } else {
            throw new RuntimeException("Erro: Aluno sem nome");
        }
    }

    // método para 
    public float retornaNota2(){
        return this.nota2;
    }

    public void registraNota2(float n2){
        this.nota2 = n2;
        if (n2 >= 0 && n2<= 10){
            this.nota2 = n2;
        } else {
            throw new RuntimeException("Erro: nota inválida");
        }
    } // a nota2 está "protegida" por estar privada e com limitadores de valor

    public float media(){
        float m;
        m = (this.nota1 + this.nota2) / 2;
        return m;
    }
}
