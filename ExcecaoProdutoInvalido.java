public class ExcecaoProdutoInvalido extends Exception{
    public ExcecaoProdutoInvalido(){}
    public ExcecaoProdutoInvalido(String codigo){ super("O produto " + codigo + "não existe");

    }
}
