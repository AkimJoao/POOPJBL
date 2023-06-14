public class Funcionario extends Pessoa{
    private String cadastro;
    private double salario;
    private String funcao;

    public Funcionario(String nome, String cadastro, double salario, String funcao){
        super(nome);
        this.cadastro = cadastro;
        this.salario = salario;
        this.funcao = funcao;
    }
    public String getNome(){ return nome;}
    public void pagar(){
        System.out.println("O "+ this.funcao + this.nome + " recebeu R$" + this.salario + "\n");
    }
}
