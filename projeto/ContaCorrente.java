public class ContaCorrente extends Conta{
    private double limiteChequeEspecial;

    public ContaCorrente(int agencia, int numero, Cliente titular, double limiteChequeEspecial) {
        super(agencia, numero, titular, 0.0);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public boolean sacar( double valor ) {
        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString().replace("Conta:", "Conta Corrente:") +
               String.format(", Limite do cheque especial: R$%.2f", limiteChequeEspecial);
    }
}