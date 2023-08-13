public class Main {
    public static void main(String[] args) {
        Conta contax = new Conta();
        contax.numero = 171955;
        contax.numeroCliente = 1347;
        contax.saldo = 1000;
        contax.dataDeAbertura = "12/04/2012";
        contax.codigoGerente = 771;
        contax.limite = 1000.00;
        contax.depositoConta(2000);
        contax.depositoConta(2000);
        contax.saqueConta(500);
        contax.saqueConta(500);
        System.out.println("O saldo atual é: " + contax.getSaldoConta());
    }
}