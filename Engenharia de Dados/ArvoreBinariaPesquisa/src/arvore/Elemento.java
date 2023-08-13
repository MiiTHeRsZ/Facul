package arvore;

public class Elemento {
    private Elemento raiz, direito, esquerdo;
    private int valor;

    public Elemento(int n) {
        this.valor = n;
    }

    public Elemento getRaiz() {
        return raiz;
    }

    public void setRaiz(Elemento raiz) {
        this.raiz = raiz;
    }

    public Elemento getDireito() {
        return direito;
    }

    public void setDireito(Elemento direito) {
        this.direito = direito;
    }

    public Elemento getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(Elemento esquerdo) {
        this.esquerdo = esquerdo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
