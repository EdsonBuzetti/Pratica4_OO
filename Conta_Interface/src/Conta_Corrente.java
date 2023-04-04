public class Conta_Corrente implements Conta {
    private double saldo;
    private final double taxaOperacao = 0.45;

    public void depositar(double valor){
        this.saldo += valor - taxaOperacao;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void sacar(double valor){
        this.saldo -= valor + taxaOperacao;
    }
}
