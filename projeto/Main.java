public class Main {
    public static void main (String [] args) {
        //3 clientes
        Cliente c1 = new Cliente ("Laura", "49253284846");
        Cliente c2 = new Cliente ("Janaian", "02872472606");
        Cliente c3 = new Cliente ("Elton", "4925242841");

        //objetos
        Conta conta1 = new Conta (107, 002, c1, 1000.99);
        ContaCorrente conta2 = new ContaCorrente(108, 003, c2, 100.99);
        ContaPoupanca conta3 = new ContaPoupanca(109, 004, c3);

        //exibir
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);

        //depositos
        if (conta1.depositar(100)) {
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Depósito não realizado");
        }

        if (conta2.depositar(300)) {
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Depósito não realizado");
        }

        if (conta3.depositar(-55)) {
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Depósito não realizado");
        }

        //informações  atualizadas
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);

        //saques
        if (conta2.sacar(30)) {
            System.out.println("Saque da conta corrente realizado com sucesso");
        } else {
            System.out.println("Saque da conta corrente não realizado");
        }

        if (conta3.sacar(1500)) {
            System.out.println("Saque da conta corrente realizado com sucesso");
        } else {
            System.out.println("Saque da conta corrente não realizado");
        }
        
        //informações  atualizadas
        
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);
    }
    
}