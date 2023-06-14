import java.util.ArrayList;
public class Mercado {
    private String endereco;
    private int numero_loja;
    private ArrayList<Produto> produtos;

    public Mercado(String endereco, int numero_loja){
        this.endereco = endereco;
        this.numero_loja = numero_loja;
        this.produtos = new ArrayList<Produto>();
    }
    public void adicionarProduto(Produto p){this.produtos.add(p);}
    public void mostrarEstoque(){
        for(Produto p: this.produtos){
            p.mostrar();
        }
    }
    public boolean produtoExiste(String codigo) {
        for(Produto p: produtos){
            if(p.getCodigo() == codigo)
                return true;
        }
        return false;
    }
}
