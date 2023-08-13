
package cliente;

/*
*  Gusta
*/
import lista.*;

public class UsaLista {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserirContato(new Contato("Gustavo", "123-333"));
        lista.inserirContato(new Contato("Leonardo", "844-234"));
        lista.inserirContato(new Contato("Henrick", "944-232"));
        lista.inserirContato(new Contato("Lucas", "454-232"));

        /*int pesquisaPorId = 1;

        if(lista.pesquisar(pesquisaPorId) != null) {
            System.out.println(lista.pesquisar(pesquisaPorId).getObjeto());
        } else {
            System.out.println("Não encontrado!");
        }*/

        lista.inserirNoMeio(new Contato("Taw", "123-456"), 2);

        //System.out.println(lista.getQuantElementosContatos());

        lista.exibirContato();

        /*lista.inserirProduto(new Produto("H20", "Bebida", 4.5));
        lista.inserirProduto(new Produto("Doritos", "Salgadinho", 15.0));
        lista.inserirProduto(new Produto("Guaraná Jesus", "Bebida", 2.5));
        lista.inserirProduto(new Produto("Pringles", "Salgadinho", 13.5));

        lista.exibirProduto();

        lista.descontoProduto("Bebida", 12);

        lista.exibirProduto();*/
    }
}
