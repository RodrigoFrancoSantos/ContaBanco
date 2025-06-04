import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero da conta:");
        int conta = scanner.nextInt();

        System.out.println("Numero da Agencia:");
        int agencia = scanner.nextInt();

        scanner.nextLine();
        
        System.out.println("Seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu Saldo:");
        float saldo = scanner.nextFloat();

        System.out.println("Dados informados:");
        System.out.println("Conta: " + conta);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);

        scanner.close();
    }
}
