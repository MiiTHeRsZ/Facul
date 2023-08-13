package lista;

/*
 *  Gusta
 */
public class Lista {
    private Elemento inicioContato, atualContato, aux, inicioProduto, atualProduto;
    private int quantElementosContatos = 0;
    /**
     * Aprimorando
     */

    private Elemento inicio, atual;
    private int id = 1;

    public void inserirContato(Object objeto) {
        if (inicioContato == null) {
            inicioContato = new Elemento(objeto, null, null);
            aux = inicioContato;
        } else {
            atualContato = new Elemento(objeto, null, aux);
            aux.setProx(atualContato);
            aux = atualContato;
        }
        ++quantElementosContatos;
    }

    public void exibirContato() {
        Elemento elementoContato = inicioContato;
        while (elementoContato != null) {
            System.out.println(elementoContato.getObjeto());
            elementoContato = elementoContato.getProx();
        }
    }

    public Object pesquisarPorIDContato(int id) {
        Elemento e = inicioContato;
        Contato c;
        while (e != null) {
            c = (Contato) e.getObjeto();
            if (id == c.getId()) {
                return c;
            }
            e.getProx();
        }

        return null;
    }

    /**
     * Produto
     */

    public void inserirProduto(Object objeto) {
        if (inicioProduto == null) {
            inicioProduto = new Elemento(objeto, null, null);
            aux = inicioProduto;
        } else {
            atualProduto = new Elemento(objeto, null, aux);
            aux.setProx(atualProduto);
            aux = atualProduto;
        }
    }

    public void exibirProduto() {
        Elemento elementoProduto = inicioProduto;
        while (elementoProduto != null) {
            System.out.println(elementoProduto.getObjeto());
            elementoProduto = elementoProduto.getProx();
        }
    }

    public Object pesquisarPorIDProduto(int id) {
        Elemento elementoProdutoPesquisar = inicioProduto;
        Produto produtoPesquisa;
        while (elementoProdutoPesquisar != null) {
            produtoPesquisa = (Produto) elementoProdutoPesquisar.getObjeto();
            if (id == produtoPesquisa.getId()) {
                return produtoPesquisa;
            }
            elementoProdutoPesquisar.getProx();
        }

        return null;
    }

    public void descontoProduto(String categoria, int porcentagem) {
        boolean verifica = false;
        Elemento elementoProdutoDesconto = inicioProduto;
        Produto produtoDesconto;
        double desconto;

        while (elementoProdutoDesconto != null) {
            produtoDesconto = (Produto) elementoProdutoDesconto.getObjeto();
            desconto = produtoDesconto.getPreco() / 100 * porcentagem;

            if (produtoDesconto.getCategoria().equalsIgnoreCase(categoria)) {
                produtoDesconto.setPreco(produtoDesconto.getPreco() - desconto);
                verifica = true;
            }
            elementoProdutoDesconto = elementoProdutoDesconto.getProx();
        }

        if (!verifica) {
            System.err.println("Categoria inválida!");
        } else {
            System.out.println("Produtos atualizados com o desconto");
        }
    }

    public void inserir(Object objeto) {
        Contato contato = (Contato) objeto;
        contato.setId(id++);
        if (inicio == null) {
            inicio = new Elemento(objeto, null, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null, aux);
            aux.setProx(atual);
            aux = atual;// Fica junto do atual
        }
    }

    public void exibir() {
        Elemento elemento = inicio;
        while (elemento != null) {
            System.out.println(elemento.getObjeto());
            elemento = elemento.getProx();
        }
    }

    public Elemento pesquisar(int id) {
        Elemento elemento = inicioContato;
        Contato contato;

        while (elemento != null) {
            contato = (Contato) elemento.getObjeto();
            if (id == contato.getId()) {
                return elemento;
            }
            elemento = elemento.getProx();
        }
        return null;
    }

    public void remover(int id) {
        Elemento elemento = pesquisar(id);
        if (elemento != null) {
            if (elemento == inicio) {
                inicio = elemento.getProx();
                elemento.setProx(null);
                inicio.setAnt(null);
            } else if (elemento == atual) {
                atual = elemento.getAnt();
                aux = atual;
                elemento.setAnt(null);
                atual.setProx(null);
            } else {
                elemento.getAnt().setProx(elemento.getProx());
                elemento.getProx().setAnt(elemento.getAnt());
                elemento.setProx(null);
                elemento.setAnt(null);
            }
        }
    }

    /**
     * Exercício
     * a) Elabore um método que retorne a quatidade de elementos da lista.
     * b) Um método para inserir em uma posição qualquer da lista. Não deve inserir no início e nem no fim.
     */

    public int getQuantElementosContatos() {
        return quantElementosContatos;
    }

    public void inserirNoMeio(Object objeto, int pos) {
        if (inicioContato == null) {
            inicioContato = new Elemento(objeto, null, null);
            aux = inicioContato;
        } else {
            if (0 < pos && pos < getQuantElementosContatos()){
                Elemento elemento = inicioContato, novoContato;

                for (int i = 1; i < pos ; i++) {
                    elemento = elemento.getProx();
                }

                novoContato = new Elemento(objeto, elemento.getProx(), elemento);
                elemento.setProx(novoContato);
                elemento.getProx().setAnt(novoContato);
            } else {
                atualContato = new Elemento(objeto, null, aux);
                aux.setProx(atualContato);
                aux = atualContato;
            }
        }
        ++quantElementosContatos;
    }
}
