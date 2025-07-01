import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        String agencia;
        String nomeCliente;
        double saldo = 0;

        // Exibir as mensagens para o nosso usuário
        System.out.println("Digite o número da sua conta: ");
        numero = scanner.nextInt();

        System.out.println("Digite a agencia: ");
        agencia = scanner.next();

        System.out.println("Digite o seu nome completo: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o seu saldo: ");
        saldo = scanner.nextDouble();

        // Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");

        scanner.close();
    }
}
