import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ContaTerminal {

    class Conta{
        private int num;
        private String agencia;
        private String nomeCliente;
        double saldo;

        public  Conta(int num, String agencia, String nomeCliente, double saldo) {
            this.num = num;
            this.agencia = agencia;
            this.nomeCliente = nomeCliente;
            this.saldo = saldo;
        }
        public int getNum() {
            return num;
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
    class GerenciadorDeConta {
        private List<Conta> contas;
    }
}
