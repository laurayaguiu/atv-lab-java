/*
Relação de agregação com a class Cliente
Conta usa um OBJETO Cliente 
*/
public class Conta{
    private int agencia;
    private int numero;
    private  Cliente titular;
    protected double saldo;

    public Conta ( int agencia, int numero, Cliente titular, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0; 
        
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo
    }

    public boolean depositar(double valor) {

        if (valor > 0) {
            saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    /*
    Por padrão, toda classe em Java herda o método toString() da classe Object
    Aqui, titular é um objeto da classe Cliente.
    A classe Cliente define os métodos getNome() e getCpf().
    Como titular foi inicializado no construtor, a conta pode usar esses métodos para pegar informações do cliente
    */
    @Override
    public String toString() {
        return "Agência: %d, Conta: %d, Titular: %s, CPF: %s, Saldo: %.2f", agencia, numero, titular.getNome(), titular.getCpf(), saldo
    }
}