import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Conta conta = new Conta();

        Scanner scanner = new Scanner(System.in).useLocale(java.util.Locale.US);

        conta.adicionaNumero(scanner);

        conta.adicionaAgencia(scanner);

        conta.adicionaNome(scanner);

        conta.adicionaSaldo(scanner);

        scanner.close();

        System.out.printf(
                "\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque\n",
                conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());

    }
}