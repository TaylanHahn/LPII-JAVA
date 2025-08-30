package ProjetoFuncionario;

// >> CLASSE Funcionario
public class Funcionario {
    private String nome;
    private char sexo;
    private String cpf;
    private double salarioBruto;

// >> CONSTRUTORES
    public Funcionario(){
        this.nome = "";
        this.sexo = ' ';
        this.cpf = "";
        this.salarioBruto = 0;
    }

    public Funcionario(String n, char s, String cpf, double sal){
        this.nome = n;
        this.sexo = s;
        this.cpf = cpf;
        this.salarioBruto = sal;
    }

// >> MÉTODOS
    // Taxa do INSS - Faço a verificação de cada condicional
    public double txINSS(){
        if (salarioBruto < 0){
            throw new RuntimeException("Erro: Insira um salário bruto positivo.");
        } else if(salarioBruto <= 1000.00){
            return 0.08;
        } else if(salarioBruto <= 2000.00){
            return 0.09;
        } else if(salarioBruto <= 3000.00){
            return 0.10;
        } else {
            return 0.11;
        }
    }

    // Valor do INSS - Calculo o valor do INSS a ser pago
    public double valorINSS(){
        double tetoINSS = 900.00; // Defini o teto
        double aliquota = txINSS(); // Armazenei a taxa em uma variável

        double valorCalculado = salarioBruto * aliquota;

        // Verifico se entra no caso do teto máximo ou não
        if(valorCalculado >= tetoINSS){
            return tetoINSS;
        } else {
            return valorCalculado;
        }
    }

    // Calcula o valor do salario liquido
    public double salarioLiquido(){
        double liquido = salarioBruto - valorINSS() - valorIR();
        return liquido;
    }

     // Salário Base IR
     public double salarioBaseIR(){
        double salarioBase = salarioBruto - valorINSS();
        return salarioBase;
    }

    // Taxa do Imposto de Renda
    public double txIR(){
        if (salarioBaseIR() <= 1000.00){
            return 0.00;
        } else if(salarioBaseIR() > 1000.00 || salarioBaseIR() <= 3000.00){
            return 0.10;
        } else if(salarioBaseIR() > 3000.00 || salarioBaseIR() <= 5000.00){
            return 0.20;
        } else if(salarioBaseIR() > 5000.00){
            return 0.30;
        } else {
            throw new RuntimeException("Erro na verificação da taxa de IR.");
        }
    }

    // Valor do Imposto de Renda
    public double valorIR(){
        double valorImpostoRenda = (salarioBaseIR() * txINSS()) / 100;
        return valorImpostoRenda;
    }

   


// >> SETTERS E GETTERS
    // SET nome
    public void setNome(String n){
        this.nome = n;
    }
    // GET nome
    public String getNome(){
        return nome;
    }


    // SET sexo
    public void setSexo(char s){
        this.sexo = s;
    }
    // GET sexo
    public char getSexo(){
        return sexo;
    }


    // SET cpf
    public void setCPF(String cpf){
        this.cpf = "";
    }
    // GET cpf
    public String getCPF(){
        return cpf;
    }


    // SET salarioBruto
    public void setSalarioBruto(double s){
        this.salarioBruto = 0;
    }
    // GET salarioBruto
    public double getSalarioBruto(){
        return salarioBruto;
    }
        
}