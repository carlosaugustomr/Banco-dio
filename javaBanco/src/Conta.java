/**
 *
 */
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO=1;
    private static int SEQUENCIAL=1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
