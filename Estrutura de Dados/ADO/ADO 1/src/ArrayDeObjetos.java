/**
 * @author Gustavo Leme 1142470135
 *
 * */
import java.util.Random;

public class ArrayDeObjetos {
    /** Lista de Livros */
    private static Livro[] listaDeLivros = new Livro[5];
    private static int indiceDeLivros = 0;

    private static int quantidadeDeLivros() {
        return listaDeLivros.length - 1;
    }

    /* *
     * Gera um ID aleatório
     *
     * @author Gustavo feat. Ian
     */
    private static int geraId() {
        boolean verificarId;
        int id;

        do {
            verificarId = true;
            id = new Random().nextInt(999) + 1;

            for (Livro livro : listaDeLivros) {
                if (livro != null) {
                    if (livro.getId() == id) {
                        verificarId = false;
                        break;
                    }
                }
            }
        } while (!verificarId);

        return id;
    }

    /** Inserção de Livro */
    public static void inserirLivro(Livro livro) {
        if (indiceDeLivros == listaDeLivros.length)
            listaDeLivros = alocarMaisLivros();
        livro.setId(geraId());
        listaDeLivros[indiceDeLivros++] = livro;

        ordenarLivros(0, quantidadeDeLivros());
    }

    /** Alocação de mais espaço para novos livros */
    private static Livro[] alocarMaisLivros() {
        Livro[] novo = new Livro[(int) (listaDeLivros.length * 1.5)];
        System.arraycopy(listaDeLivros, 0, novo, 0, listaDeLivros.length);
        return novo;
    }

    /** Remover livro pelo ID */
    public static boolean removerLivro(int id) {
        boolean verificaId = false;

        for (Livro livro : listaDeLivros) {
            if (livro != null) {
                if (livro.getId() == id) {
                    Livro[] novaListaDeLivros = new Livro[indiceDeLivros];

                    for (int i = 0, j = 0; i < indiceDeLivros; i++) {
                        if (listaDeLivros[i].getId() != id) novaListaDeLivros[j++] = listaDeLivros[i];
                    }

                    listaDeLivros = novaListaDeLivros;
                    verificaId = true;

                    break;
                }
            }
        }

        if (verificaId) {
            return true;
        } else {
            return false;
        }
    }

    /** Ordena a lista de livros */
    private static void ordenarLivros(int inicio, int fim) {
        if (inicio < fim) {
            int pivo = separarLivrosParaOrdenar(inicio, fim);
            ordenarLivros(inicio, pivo - 1);
            ordenarLivros(pivo + 1, fim);
        }
    }

    /** Auxilia na ordenação de livros */
    private static int separarLivrosParaOrdenar(int inicio, int fim) {
        Livro pivo = listaDeLivros[inicio];
        int i = inicio + 1;
        int j = fim;
        while (i <= j) {
            if (listaDeLivros[j] != null) {
                if (listaDeLivros[i].getTitulo().compareToIgnoreCase(pivo.getTitulo()) <= 0) {
                    i++;
                } else if (listaDeLivros[j].getTitulo().compareToIgnoreCase(pivo.getTitulo()) > 0) {
                    j--;
                } else {
                    trocarLivrosParaOrdenar(i, j);
                    i++;
                    j--;
                }
            } else {
                j--;
            }
        }
        trocarLivrosParaOrdenar(inicio, j);
        return j;
    }

    /** Auxilia na ordenação de livros */
    private static void trocarLivrosParaOrdenar(int i, int j) {
        Livro trocarLivro = listaDeLivros[i];
        listaDeLivros[i] = listaDeLivros[j];
        listaDeLivros[j] = trocarLivro;
    }

    /** Mostar lista de livros */
    public static void mostarLivros() {
        for (Livro livro : listaDeLivros) {
            if (livro != null)
                System.out.println(livro);
        }
    }

    /** Pesquisar por livros - busca binária */
    public static Livro pesquisarLivro (String titulo) {
        int inicio = 0, fim = quantidadeDeLivros(), meio;
        ordenarLivros(inicio, fim);

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            int comparaTitulos = listaDeLivros[meio].getTitulo().compareToIgnoreCase(titulo);
            if (comparaTitulos == 0) {
                return listaDeLivros[meio];
            } else if (comparaTitulos < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return null;
    }
}
