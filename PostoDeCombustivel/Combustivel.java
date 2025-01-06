package PostoDeCombustivel;

public class Combustivel {
    private String nome;
    private double preco;

    public Combustivel(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double calcularValor(double quantidade) {
        return quantidade * preco;
    }
}
