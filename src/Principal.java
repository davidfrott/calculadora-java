import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nEscolha a operação:");
        System.out.println("1: Soma (+)");
        System.out.println("2: Subtração (-)");
        System.out.println("3: Multiplicação (*)");
        System.out.println("4: Divisão (/)");
        int opcao = scanner.nextInt();
        Operacao operacao = null;

        switch (opcao) {
            case 1:
                operacao = new Soma();
                break;
            case 2:
                operacao = new Subtracao();
                break;
            case 3:
                operacao = new Multiplicacao();
                break;
            case 4:
                operacao = new Divisao();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        if (operacao != null) {
            double resultado = operacao.calcular(num1, num2);

            if (Double.isNaN(resultado)) {
                System.out.println("Erro: Não é possível dividir por zero.");
            } else {
                System.out.println("O resultado é: " + resultado);
            }
        }

        scanner.close();
    }
}