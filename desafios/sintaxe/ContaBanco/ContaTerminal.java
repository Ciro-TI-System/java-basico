import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero = solicitarNumeroDaConta(scanner);
            String agencia = solicitarNumeroDaAgencia(scanner);
            String nomeCliente = solicitarNomeDoCliente(scanner);
            double saldo = solicitarSaldo(scanner);

            exibirMensagemDeBoasVindas(numero, agencia, nomeCliente, saldo);
        } catch (Exception e) {
            System.out.println("Desculpe, ocorreu um erro ao processar sua entrada. Por favor, tente novamente.");
        }
    }

    private static int solicitarNumeroDaConta(Scanner scanner) {
        System.out.println("Por favor, digite o número da conta:");
        return scanner.nextInt();
    }

    private static String solicitarNumeroDaAgencia(Scanner scanner) {
        System.out.println("Por favor, digite o número da agência:");
        return scanner.next();
    }

    private static String solicitarNomeDoCliente(Scanner scanner) {
        System.out.println("Por favor, digite o nome do cliente:");
        return scanner.next();
    }

    private static double solicitarSaldo(Scanner scanner) {
        System.out.println("Por favor, digite o saldo:");
        return scanner.nextDouble();
    }

    private static void exibirMensagemDeBoasVindas(int numero, String agencia, String nomeCliente, double saldo) {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
