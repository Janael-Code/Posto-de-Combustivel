package PostoDeCombustivel;

public class PostoDeCombustivel {
    private Combustivel gasolina;
    private Combustivel diesel;
    private Combustivel aviao;

    public PostoDeCombustivel() {
        gasolina = new Combustivel("Gasolina", 6.50);
        diesel = new Combustivel("Diesel", 5.50);
        aviao = new Combustivel("Combustível de Avião", 200.00);
    }

    public void exibirMenu() {
        System.out.println("Selecione o tipo de combustível:");
        System.out.println("1. " + gasolina.getNome() + " - R$ " + gasolina.getPreco() + " por litro");
        System.out.println("2. " + diesel.getNome() + " - R$ " + diesel.getPreco() + " por litro");
        System.out.println("3. " + aviao.getNome() + " - R$ " + aviao.getPreco() + " por litro");
        System.out.println("4. Sair");
    }

    public double calcularValor(int opcao, double quantidade) {
        double valorTotal = 0.0;
        switch (opcao) {
            case 1:
                valorTotal = gasolina.calcularValor(quantidade);
                break;
            case 2:
                valorTotal = diesel.calcularValor(quantidade);
                break;
            case 3:
                valorTotal = aviao.calcularValor(quantidade);
                break;
            case 4:
                System.out.println("Saindo... Obrigado pela visita.");
                break;
            default:
                System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                break;
        }
        return valorTotal;
    }
}
