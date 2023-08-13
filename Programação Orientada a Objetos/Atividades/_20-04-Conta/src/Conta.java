public class Conta {
    int numero;
    int numeroCliente;
    double saldo;
    String dataDeAbertura;
    int codigoGerente;
    double limite;

    void saqueConta(double saldo) {
        this.saldo -= saldo;
    }

    void depositoConta(double saldo) {
        this.saldo += saldo;
    }

    double getSaldoConta() {
        return this.saldo + this.limite;
    }

    Conta() {
        this.numero = 23;
        this.numeroCliente = 56;
        this.saldo = 3500.34;
        this.dataDeAbertura = "10-05-2012";
        this.codigoGerente = 12;
        this.limite = 500;
    }
}
