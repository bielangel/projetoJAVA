import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner contaNumero = new Scanner(System.in);
        System.out.println("Digite o numero da conta:" );
        int Numero = contaNumero.nextInt();

        Scanner contaAgencia = new Scanner(System.in);
        System.out.println("Digite a agência: ");
        String Agencia = contaAgencia.nextLine();

        Scanner nameNomeCliente = new Scanner(System.in);
        System.out.println("Digite o primeiro e ultimo nome do cliente:");
        String NomeCliente = nameNomeCliente.nextLine();

        Scanner contaSaldo = new Scanner(System.in);
        System.out.println("Deposite um valor em Real: R$");
        Double Saldo = contaSaldo.nextDouble();


        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + " , conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque");
    }
}