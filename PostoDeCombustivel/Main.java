package PostoDeCombustivel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PostoDeCombustivel posto = new PostoDeCombustivel();
        int opcao = 0;

        while (opcao != 4) {
            posto.exibirMenu();
            try {
                opcao = Integer.parseInt(scanner.nextLine());

                if (opcao == 4) break;

                System.out.print("Digite a quantidade de combustível (em litros): ");
                double quantidade = Double.parseDouble(scanner.nextLine());

                if (quantidade <= 0) {
                    System.out.println("Quantidade inválida. Por favor, insira um valor positivo.");
                } else {
                    double valorTotal = posto.calcularValor(opcao, quantidade);
                    if (valorTotal > 0) {
                        System.out.printf("Valor total a ser pago: R$ %.2f%n", valorTotal);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        }

        scanner.close();
    }
}
