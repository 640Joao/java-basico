import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("--------------------\nCriação de Conta Bancária\n--------------------");

        System.out.print("Digite o número: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nDigite a agência: ");
        agencia = scanner.nextLine();

        System.out.print("\nDigite o seu nome completo: ");
        nomeCliente = scanner.nextLine();

        System.out.print("\nDigite o valor de depósito: ");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
         + ", conta " + numero + " e seu saldo é " + saldo + " já disponível para saque");
    }
}
