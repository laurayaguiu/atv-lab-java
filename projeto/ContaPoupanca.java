public class ContaPoupanca extends Conta {
    ContaPoupanca ( int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular, 0.0);
    }

    public boolean sacar(double valor){
        if (saldo >= valor) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return super.toString().replace("Conta:", "Conta Poupança:");
    }
}