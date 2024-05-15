import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(java.util.Locale.US);

        System.out.print("Por favor, digite o número da conta: ");
        int numConta = scanner.nextInt();

        System.out.print("Por favor, digite a agência: ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite seu nome: ");
        scanner.nextLine();
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite seu saldo inicial: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        Conta conta = new Conta(numConta, agencia, nome, saldo);

        System.out.println(
                "\nOlá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo de R$ " + conta.getSaldo()
                        + " já está disponível para saque\n");

    }
}