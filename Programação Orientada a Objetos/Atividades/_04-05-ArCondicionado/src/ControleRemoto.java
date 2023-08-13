import java.util.Scanner;

public class ControleRemoto {
    public static void main(String[] args) throws InterruptedException {
        Scanner scn = new Scanner(System.in);

        int opcao, opcaoControle, opcaoOscilacao, temperatura, intensidade;
        boolean oscilacao, opcaoSaida = false;

        do {
            System.out.print("Deseja ligar o ar condicionado? (1 - Sim | 2 - Não | 0 - Sair)\nResposta: ");
            opcao = scn.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Qual a temperatura desejada?\nResposta: ");
                    temperatura = scn.nextInt();
                    System.out.println("------------------------------------------------------------");

                    System.out.println("------------------------------------------------------------");
                    System.out.print("Qual a intensidade? (1 - Fraca | 2 - Intermediária | 3 - Intensa)\nResposta: ");
                    intensidade = scn.nextInt();
                    System.out.println("------------------------------------------------------------");


                    do {
                        System.out.println("------------------------------------------------------------");
                        System.out.print("Deseja que a oscilação seja ligada? (1 - Sim | 2 - Não)\nResposta: ");
                        opcaoOscilacao = scn.nextInt();
                        System.out.println("------------------------------------------------------------");
                    } while (opcaoOscilacao != 1 && opcaoOscilacao != 2);

                    oscilacao = opcaoOscilacao == 1 ? true : false;

                    System.out.println("------------------------------------------------------------");
                    ArCondicionado arCondicionado = new ArCondicionado(temperatura, intensidade, oscilacao);
                    System.out.println(arCondicionado.toString());
                    System.out.println("------------------------------------------------------------");
                    do {
                        if(arCondicionado.isStatus()){
                            System.out.println("-----Opções-----");
                            System.out.print("1 - Mudar Temperatura\n2 - Mudar intensidade\n3 - Mudar oscilação\n4 - Desligar o ar condicionado\n0 - Sair\nResposta: ");
                            opcaoControle = scn.nextInt();
                            System.out.println("----------------");

                            switch (opcaoControle) {
                                case 1:
                                    System.out.println("-------------------------------");
                                    System.out.print("Para qual temperatura: \nResposta: ");
                                    opcaoControle = scn.nextInt();
                                    arCondicionado.setTemperatura(opcaoControle);
                                    System.out.println("-------------------------------");
                                    break;
                                case 2:
                                    System.out.println("-------------------------------");
                                    System.out.print("Qual a intensidade? (1 - Fraca | 2 - Intermediária | 3 - Intensa)\nResposta: ");
                                    opcaoControle = scn.nextInt();
                                    arCondicionado.setIntensidade(opcaoControle);
                                    System.out.println("-------------------------------");
                                    break;
                                case 3:
                                    arCondicionado.setOscilacao();
                                    break;
                                case 4:
                                    arCondicionado.setStatus();
                                    break;
                                case 0:
                                    System.exit(0);
                                default:
                                    System.err.println("\n\nOpção inválida! Atente-se as opções!\n");
                            }
                        } else {
                            System.out.print("Deseja ligar o ar condicionado? (1 - Sim | 2 - Não)");
                        }

                        System.out.println("------------------------------------------------------------");
                        if(arCondicionado.isStatus())
                            System.out.println(arCondicionado.toString());
                        else
                            System.out.println("O ar condicionado está desligado!");
                        System.out.println("------------------------------------------------------------");

                        System.out.println("-------------------------------");
                        System.out.print("Deseja voltar ao menu principal? (1 - Sim | 2 - Não)\nResposta: ");
                        opcaoSaida = (scn.nextInt() == 1 ? true : false);
                        System.out.println("-------------------------------");
                    } while (!opcaoSaida);
                    break;
                case 2:
                    System.out.println("Okay!");
                    Thread.sleep(3000);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("Resposta inválida! Atente-se as opções!");
            }
            System.out.println("-------------------------------");
            System.out.print("Deseja sair? (1 - Sim | 2 - Não)\nResposta: ");
            opcaoSaida = (scn.nextInt() == 1 ? true : false);
            System.out.println("-------------------------------");
        } while (!opcaoSaida);
    }
}