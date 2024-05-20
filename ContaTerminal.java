import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número da agência
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        // Solicita o número da conta
        System.out.println("Por favor, digite o número da Conta !");
        int numero = Integer.parseInt(scanner.nextLine());

        // Solicita o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.nextLine();

        // Solicita o saldo da conta
        System.out.println("Por favor, digite o Saldo da Conta !");
        double saldo = Double.parseDouble(scanner.nextLine());

        // Exibe a mensagem de boas-vindas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
    
}
