public class Main {
    public static void main(String[] args) {
        Conta_Corrente cc = new Conta_Corrente();
        cc.depositar(1200.20);
        cc.sacar(300);

        Conta_Poupanca cp = new Conta_Poupanca();
        cp.depositar(500.50);
        cp.sacar(25);

        Gerador_Extratos ge = new Gerador_Extratos();
        ge.gerarExtrato(cc);
        ge.gerarExtrato(cp);
    }
}