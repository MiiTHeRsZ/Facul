public class Matematica {
    public static void main(String[] args) {
        Matematica.mostrarCalculo(new Soma(), 5, 5);
        Matematica.mostrarCalculo(new Subtracao(), 5, 2);
        Matematica.mostrarCalculo(new Multiplicacao(), 5, 3);
        Matematica.mostrarCalculo(new Divisao(), 5, 5);
    }

    public static void mostrarCalculo (OperacaoMatematica operacao,double x, double y) {
        System.out.println("O resultado da " + operacao.getClass().getName() + " é: " + operacao.calcular(x, y));

    }
}