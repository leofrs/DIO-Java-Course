import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite sua agência:");
        String agencia = scanner.nextLine();
        System.out.println("Digite o número da sua agência:");
        String agenciaNumeroString = scanner.nextLine();
        
        float agenciaNumero = Float.parseFloat(agenciaNumeroString);
        int saldo = 1000;

        System.out.println("Olá " + nome + " obrigado por criar sua conta em nosso banco, sua agêncai é: " + agencia + " "+ agenciaNumero + " seu saldo de " + "R$ " + saldo );
        scanner.close();
    }
}
