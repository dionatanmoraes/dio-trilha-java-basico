public class ContaBancaria {

    double saldo = 25.0;
    double valorSolicitado = 18.0;
  
    // Método para realizar um saque
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
  }
  