/**
 * @author Gustavo Leme 1142470135
 *
 * Elabore um projeto Java de uma classe Livro com os atributos: **id (int), autor, título
 * (ambos Strings) e preço (double). Escreva os métodos getters e setters, dois
 * construtores (no mínimo) e o método toString.
 * Na segunda classe, defina:
 * ● Um array de objetos (defina-o como array da classe);
 * ● Um método para inserir objetos (use a lógica para redimensionar o array);
 * ● Um método para remover por id, um objeto do array;
 * ● *Um método para ordenar os dados.
 * ● *Um método para realizar a busca binária por título, retorne todas as
 * informações relacionadas ao objeto pesquisado.
 * *Para realizar a busca binária, os dados devem estar ordenados. Utilize,
 * obrigatoriamente, o método quick sort ou merge sort na versão passada em aula.
 * **O id deve ser gerado aleatoriamente e não duplicado.
 * Na classe principal, instancie a classe Livro e escreva uma lógica permitindo que o
 * usuário selecione a operação desejada do programa, incluindo o seu encerramento.
 * */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** Inserção de livros */
        inserirLivros();

        /** Interação do usuário */
        interfaceUsuario();
    }

    /** Inserção de livros */
    private static void inserirLivros() {
        ArrayDeObjetos.inserirLivro(new Livro("William Schakspear", "Hamlet", 327.75));
        ArrayDeObjetos.inserirLivro(new Livro("Miguel De Cervantes", "Dom Quixote De La Mancha", 349.59));
        ArrayDeObjetos.inserirLivro(new Livro("R.J.Palacio", "Extraordinario", 112.15));
        ArrayDeObjetos.inserirLivro(new Livro("John Green", "A Culpa é Das Estrelas", 152.21));
        ArrayDeObjetos.inserirLivro(new Livro("William Schakspear", "Romeu e Julieta", 198.36));
        ArrayDeObjetos.inserirLivro(new Livro("Fitzgerald", "O Grande Gatsby", 91.89));
        ArrayDeObjetos.inserirLivro(new Livro("Robert Muchamore", "Zona de Conflito", 137.87));
        ArrayDeObjetos.inserirLivro(new Livro("Mary Shelly", "Frankenstein ", 175.28));
        ArrayDeObjetos.inserirLivro(new Livro("Antoine De Saint-Exupéry", "O Pequeno Príncipe", 233.64));
        ArrayDeObjetos.inserirLivro(new Livro("Franz Kafka", "O processo", 308.73));
        ArrayDeObjetos.inserirLivro(new Livro("Homero", "Odisseia", 69.97));
        ArrayDeObjetos.inserirLivro(new Livro("Esopo", "Fábulas de Esopo", 156.18));
    }

    /** Interface do usuário */
    private static void interfaceUsuario() {
        System.out.println("Digite o número corespondente a uma das opções\n");
        System.out.println("1 - Cadastrar livro");
        System.out.println("2 - Excluir livro");
        System.out.println("3 - Mostrar livros");
        System.out.println("4 - Procurar por livro");
        System.out.println("5 - Sair");
        System.out.print("Opção: ");

        Scanner scn = new Scanner(System.in);
        int opcao = scn.nextInt();

        System.out.println("---------------------------------\n4");

        escolhaDoUsuario(opcao);

        scn.close();
    }

    /** Escolhas do usuário */
    private static void escolhaDoUsuario(int opcao) {
        switch (opcao) {
            case 1:
                opcaoCadastrarLivro();
                break;
            case 2:
                opcaoExcluirLivro();
                break;
            case 3:
                opcaoMostrarLivros();
                break;
            case 4:
                opcaoProcurarPorLivro();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Opção inválida, digite apenas uma das alternativas!");
        }

        System.out.println("\n\n------------------------------------------------------------------\n");
        interfaceUsuario();
    }

    /** Inserção de livro */
    private static void opcaoCadastrarLivro() {
        System.out.println("Digite os dados do livro\n");

        Scanner scn = new Scanner(System.in);

        System.out.print("Autor: ");
        String autor = scn.nextLine();

        System.out.print("Título: ");
        String titulo = scn.nextLine();

        System.out.print("Preço: ");
        double preco = scn.nextDouble();

        scn.close();

        ArrayDeObjetos.inserirLivro(new Livro(autor, titulo, preco));
    }

    /** Remoção de livro */
    private static void opcaoExcluirLivro() {
        System.out.print("\nDigite o ID do livro que deseja excluir: ");
        Scanner scn = new Scanner(System.in);
        int id = scn.nextInt();

        if(ArrayDeObjetos.removerLivro(id)) {
            System.out.println("O livro foi excluído com sucesso!");
        } else {
            System.out.println("O ID do livro informado é inválido!");
        }
    }

    /** Visualização de livros */
    private static void opcaoMostrarLivros() {
        System.out.println();
        ArrayDeObjetos.mostarLivros();
    }

    /** Visualização de livro desejado */
    private static void opcaoProcurarPorLivro() {
        System.out.print("Por qual título está procurando? R: ");
        Scanner scn = new Scanner(System.in);
        String titulo = scn.nextLine();

        Livro busca = ArrayDeObjetos.pesquisarLivro(titulo);

        if (busca == null)
            System.out.println("Livro não encontrado!");
        else
            System.out.println(busca.toString());
    }
}