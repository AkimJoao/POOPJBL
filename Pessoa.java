public abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void pagar(){
        System.out.println("Uma pessoa realizou a ação pagar!");
    }
    public abstract String getNome();
}
