import java.util.Scanner;
public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        try (Scanner ler = new Scanner(System.in)) {
            int numeroConta, numeroAgencia, saldo;
            String nomeCliente, sobrenomeCliente, nomeCompleto;

            System.out.println("Bem vindo a sua Conta Bancaria\ndigite seus dados para realizar o cadastro:");

            System.out.println("Número da Conta: ");
            numeroConta = ler.nextInt();
            System.out.println("Agencia: ");
            numeroAgencia = ler.nextInt();
            System.out.println("Nome: ");
            nomeCliente = ler.next();
            System.out.println("Sobrenome: ");
            sobrenomeCliente = ler.next();
            System.out.println("Seu Saldo: ");
            saldo = ler.nextInt();

            nomeCompleto = nomeCliente + " " + sobrenomeCliente;

            System.out.println("Olá senhor(a) " + nomeCompleto + ", sua conta é " + numeroConta + ", o número da sua agencia é " + numeroAgencia + ", seu saldo atual é de " + saldo);
        }
    }
}
