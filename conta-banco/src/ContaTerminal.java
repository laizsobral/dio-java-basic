import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite seu nome e sobrenome");
        String nome = scanner.next();
        String sobrenome = scanner.next();
    
        System.out.println("Por favor, digite o número da agência ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite sua conta");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite seu saldo");
        double valorsaldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + " "+sobrenome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + valorsaldo + " já está disponível para saque.");
    }
}
