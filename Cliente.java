import java.util.ArrayList;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Cliente extends Pessoa{
    private ArrayList<Produto> produtos;

    public Cliente(String nome){
        super(nome);
        this.produtos = new ArrayList<Produto>();
    }
    public void adicionarProduto(Produto p){ this.produtos.add(p);}
    public void mostrarCarrinho(){
        for(Produto p: this.produtos){
            p.mostrar();
        }
    }
    public String getNome(){ return nome;}
    public void pagar(){
        double custo = 0;
        for(Produto p: this.produtos){
            custo += p.getValor();
            p.remover();
        }
    }
}
