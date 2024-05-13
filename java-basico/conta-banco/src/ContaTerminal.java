// 1 - importar a classe Scanner
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    // 2 - exibir as mensagens para o usuário
    System.out.println("1 - Por favor, digite o número da conta:");
    // 3 - obter, com a classe scanner, os valores digitados
    int numero = scanner.nextInt();

    System.out.println("2 - Por favor, digite o número da agência:");
    String agencia = scanner.next();

    System.out.println("3 - Por favor, digite o seu nome:");
    String nome = scanner.next();

    System.out.println("4 - Por favor, digite o seu saldo:");
    double saldo = scanner.nextDouble();

    // 4 - exibir a mensagem de confirmação da criação da conta
    System.out.println("Olá " + nome + ", obrigado por criar uma conta no nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +" já está disponível para saque");
  }
}