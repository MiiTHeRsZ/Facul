package arvore;

public class Arvore {
    private Elemento raiz, atual;

    public Elemento getRaiz() {
        return raiz;
    }

    public void inserir(int valor) {
        if(raiz == null) {
            raiz = new Elemento(valor);
        } else {
            atual = new Elemento(valor);
            inserir(atual, raiz);
        }
    }

    private void inserir(Elemento atual, Elemento elemento) {
        if (atual.getValor() < elemento.getValor()){
            if (elemento.getEsquerdo() == null){
                elemento.setEsquerdo(atual);
                atual.setRaiz(elemento);
            } else {
                inserir(atual, elemento.getEsquerdo());
            }
        } else {
            if (elemento.getDireito() == null) {
                elemento.setDireito(atual);
                atual.setRaiz(elemento);
            } else {
                inserir(atual, elemento.getDireito());
            }
        }
    }

    public void preOrdem(Elemento elemento) {
        if (elemento != null) {
            System.out.println(elemento.getValor() + " ");
            preOrdem(elemento.getEsquerdo());
            preOrdem(elemento.getDireito());
        }
    }

    public void Ordem(Elemento elemento) {
        if(elemento != null) {
            Ordem(elemento.getEsquerdo());
            System.out.println(elemento.getValor() + " ");
            Ordem(elemento.getDireito());
        }
    }

    public void posOrdem(Elemento elemento) {
        if(elemento != null) {
            posOrdem(elemento.getEsquerdo());
            posOrdem(elemento.getDireito());
            System.out.println(elemento.getValor() + " ");
        }
    }
}
