import java.util.Scanner; // Importa a classe Scanner para ler dados do usuário

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do teclado

        // Solicita e lê o número da Agência
        System.out.print("Por favor, digite o número da Agência: "); // Exibe uma mensagem pedindo o número da agência
        String agencia = scanner.nextLine(); // Lê a entrada do usuário e armazena na variável 'agencia'

        // Solicita e lê o número da Conta
        System.out.print("Agora, digite o número da Conta: "); // Exibe uma mensagem pedindo o número da conta
        int numero = scanner.nextInt(); // Lê a entrada do usuário (número da conta) e armazena em 'numero'
        scanner.nextLine(); // Limpa o buffer de entrada após a leitura do número da conta

        // Solicita e lê o nome do cliente
        System.out.print("Digite o nome do cliente: "); // Exibe uma mensagem pedindo o nome do cliente
        String nomeCliente = scanner.nextLine(); // Lê a entrada do usuário (nome do cliente) e armazena em 'nomeCliente'

        // Solicita e lê o saldo da conta
        System.out.print("Digite o saldo da conta: "); // Exibe uma mensagem pedindo o saldo da conta
        double saldo = scanner.nextDouble(); // Lê a entrada do usuário (saldo da conta) e armazena em 'saldo'

        // Exibe a mensagem com as informações da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close(); // Fecha o objeto Scanner para liberar recursos
    }
}
