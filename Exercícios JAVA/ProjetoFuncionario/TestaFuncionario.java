package ProjetoFuncionario;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1;
        f1 = new Funcionario("João Silva", 'M', "123.456.789-99", 10000.00 );
        // Para testar se funciona, apenas alterar os valores acima :)

        System.out.println("--------------------------------------");
        System.out.println("Dados do Funcionario");
        System.out.println("--------------------------------------");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("CPF: " + f1.getCPF());
        System.out.println("Sexo: " + f1.getSexo());
        System.out.println(".................................");
        System.out.println("Salario Bruto: R$ " + f1.getSalarioBruto());
        System.out.println("Taxa do INSS: " + f1.txINSS());
        System.out.println("Valor INSS: R$ " + f1.valorINSS());
        System.out.println("Salario Liquido: R$ " + f1.salarioLiquido());
        System.out.println("--------------------------------------");
    }
}