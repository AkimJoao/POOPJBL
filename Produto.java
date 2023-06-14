public class Produto {
    private String tipo;
    private String marca;
    private double valor;
    private int estoque;
    private String codigo;

    public Produto(String tipo, String marca, double valor, int estoque, String codigo){
        this.tipo = tipo;
        this.marca = marca;
        this.valor = valor;
        this.estoque = estoque;
        this.codigo = codigo;
    }
    public void mostrar(){
        System.out.println("\n");
        System.out.println("Produto: " + this.tipo + "\n");
        System.out.println("R$ " + this.valor + "\n");
    }
    public String getCodigo(){ return codigo;}
    public double getValor(){ return valor;}
    public void remover(){
        this.estoque -= 1;
    }
    public void repor(int quantidade){
        this.estoque += quantidade;
    }
    public int getEstoque(){ return this.estoque;}
}
