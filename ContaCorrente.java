public class ContaCorrente extends Conta{
    private double limiteChequeEspecial;

    ContaCorrente (int agencia, int numero, Cliente titular, double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
        super(agencia, numero, titular, saldo);
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public boolean sacar( double valor ) {

    }

    @Override
    public String toString() {}
}