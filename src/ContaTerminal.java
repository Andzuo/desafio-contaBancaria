import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bem vindo ao MedeirosBank, por favor crie sua conta a baixo");
        System.out.println("1 - Digite o número da sua conta!");
        String numConta = s.nextLine();

        while (!isNumeric(numConta) || numConta.length() != 8) {
            System.out.println("O número da sua conta deve conter apenas números e 8 digitos");
            numConta = s.nextLine();
        }

        System.out.println("2 - Agora digite sua agencia");
        String agencia = s.nextLine();

        while (!isNumeric(agencia) || agencia.length() != 4) {
            System.out.println("Por favor, digite apenas números e sua agencia deve conter 4 digitos. Tente novamente:");
            agencia = s.nextLine();
        }

        System.out.println("2 - Ok! Agora nos informe o seu nome");
        String nome = s.nextLine();

        while (!isAlphabetic(nome)) {
            System.out.println("Por favor, digite apenas letras e espaços. Tente novamente:");
            nome = s.nextLine();
        }
        System.out.println("2 - Para finalizarmos qual o saldo que você possui hoje?");
        String saldo = s.nextLine();

        while (!isNumeric(saldo)) {
            System.out.println("Por favor, digite apenas números. Tente novamente:");
            saldo = s.nextLine();
        }

        System.out.println("Olá " + nome + " Tudo bem?" + "\nobrigado por criar uma conta em nosso banco!\nsua agência é: " + agencia +"\nconta: "+ numConta +"\nseu saldo: R$"+ saldo +"\njá está disponível para saque.");
    }
    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isAlphabetic(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
                return false;
            }
        }
        return true;
    }
}