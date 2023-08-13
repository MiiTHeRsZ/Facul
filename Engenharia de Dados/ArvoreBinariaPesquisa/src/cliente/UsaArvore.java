package cliente;

import arvore.Arvore;

public class UsaArvore {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        arvore.inserir(40);
        arvore.inserir(32);
        arvore.inserir(15);
        arvore.inserir(36);
        arvore.inserir(50);
        arvore.inserir(60);

        System.out.println("---Pré Ordem---");

        arvore.preOrdem(arvore.getRaiz());

        System.out.println("---Ordem---");

        arvore.Ordem(arvore.getRaiz());

        System.out.println("---Pós Ordem---");

        arvore.posOrdem(arvore.getRaiz());
    }
}
