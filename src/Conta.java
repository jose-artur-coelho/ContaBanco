import java.util.Scanner;

public class Conta {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public void adicionaNumero(Scanner scanner) {
        System.out.print("Por favor, digite o número da conta: ");
        this.numero = scanner.nextInt();

    }

    public void adicionaAgencia(Scanner scanner) {
        System.out.print("Por favor, digite a agência: ");
        this.agencia = scanner.next();
    }

    public void adicionaNome(Scanner scanner) {
        System.out.print("Por favor, digite o nome do cliente: ");
        scanner.nextLine();
        this.nomeCliente = scanner.nextLine();
    }

    public void adicionaSaldo(Scanner scanner) {
        System.out.print("Por favor, digite o saldo inicial: ");
        this.saldo = scanner.nextDouble();
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

}
