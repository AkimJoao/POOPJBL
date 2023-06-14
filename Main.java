public class Main {
    public static void main(String[] args) {
        Mercado Jacomar = new Mercado("Rua iapó, 002", 01);
        Jacomar.adicionarProduto(new Produto("Sabonete", "Dove", 7.45, 8, "005908"));
        Jacomar.mostrarEstoque();
        Cliente Joao = new Cliente("João");
    }
}