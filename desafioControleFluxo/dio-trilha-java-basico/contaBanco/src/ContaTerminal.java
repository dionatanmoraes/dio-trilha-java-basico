import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        ContaBancaria conta = new ContaBancaria();

        System.out.println("**********************************************");
        System.out.println("*                                            *");
        System.out.println("*        Bem-Vindo à Sua Conta!              *");
        System.out.println("*                                            *");
        System.out.println("**********************************************");

        // Exibe o saldo inicial da conta
        System.out.println("Saldo Inicial: R$" + conta.saldo);

        // Solicita ao usuário um valor para saque
        System.out.println("Digite um valor para saque: ");
        conta.valorSolicitado = scanner.nextDouble();
    
        // Realiza o saque do valor solicitado
        conta.sacar(conta.valorSolicitado);

        System.out.println("valor do Saque: R$" + conta.valorSolicitado);
        System.out.println("Valor do Saldo Atual: R$" + conta.saldo);

        System.out.println("**********************************************");
        System.out.println("*            Operação concluida !            *");
        System.out.println("**********************************************");
    }
}
