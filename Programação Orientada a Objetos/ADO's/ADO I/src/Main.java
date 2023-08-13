import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String arquivoPib = "pib.txt";
        String arquivoRegioes = "regioes.txt";
        String arquivoFinal = "saida.txt";

        ArrayList<PibPorEstado> alppe = leitorPib(arquivoPib);
        ArrayList<PibPorRegiao> alppr = leitorRegioes(arquivoRegioes, alppe);

        escritorSaida(arquivoFinal, arquivoRegioes, alppe, alppr);
    }

    private static ArrayList<PibPorEstado> leitorPib(String arquivoPib) {
        ArrayList<PibPorEstado> alppe = new ArrayList<PibPorEstado>();
        DecimalFormat df = new DecimalFormat("#.##");
        String linha = null;

        try {
            FileReader fr = new FileReader(arquivoPib);
            BufferedReader br = new BufferedReader(fr);

            double pibTotal = 0.0;
            String[] separador = new String[2];

            while ((linha = br.readLine()) != null) {
                PibPorEstado ppe = new PibPorEstado();

                separador = linha.split(";");
                double pibEstado = Double.parseDouble(separador[1]);
                pibTotal += pibEstado;

                ppe.setEstado(separador[0]);
                ppe.setPibPorEstado(pibEstado);

                alppe.add(ppe);
            }

            for (PibPorEstado ippe : alppe) {
                double pibEstado = Double.parseDouble((df.format(ippe.getPibPorEstado() * 100 / pibTotal)).replace(',', '.'));
                ippe.setPibPorEstado(pibEstado);

                System.out.println(ippe.getEstado() + " - " + pibEstado + "%");
            }

            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo inexistente: '" + arquivoPib + "'");
        } catch (IOException ex) {
            System.out.println("Erro lendo o arquivo '" + arquivoPib + "'");
        }

        return alppe;
    }

    private static ArrayList<PibPorRegiao> leitorRegioes(String arquivoRegioes, ArrayList<PibPorEstado> alppe) {
        ArrayList<PibPorRegiao> alppr = new ArrayList<PibPorRegiao>();
        String linha = null;

        try {
            FileReader fr = new FileReader(arquivoRegioes);
            BufferedReader br = new BufferedReader(fr);

            String regiao = null;
            double pibRegiao = 0.0;
            int cont = 0;

            while ((linha = br.readLine()) != null) {
                if (linha.isEmpty()) {
                    PibPorRegiao ppr = new PibPorRegiao();

                    ppr.setRegiao(regiao);
                    ppr.setPibPorRegiao(pibRegiao);
                    regiao = null;
                    pibRegiao = 0.0;
                    cont = 0;
                    alppr.add(ppr);
                } else {
                    if (cont == 0) {
                        regiao = linha;
                        cont++;
                    } else {
                        for (PibPorEstado ippe : alppe) {
                            if (ippe.getEstado().equalsIgnoreCase(linha)) {
                                pibRegiao += ippe.getPibPorEstado();
                                break;
                            }
                        }
                    }
                }
            }

            br.close();

            PibPorRegiao ppr = new PibPorRegiao();

            ppr.setRegiao(regiao);
            ppr.setPibPorRegiao(pibRegiao);
            alppr.add(ppr);
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo inexistente: '" + arquivoRegioes + "'");
        } catch (IOException ex) {
            System.out.println("Erro lendo o arquivo '" + arquivoRegioes + "'");
        }

        return alppr;
    }

    private static void escritorSaida(String arquivoFinal, String arquivoRegioes, ArrayList<PibPorEstado> alppe, ArrayList<PibPorRegiao> alppr) {
        try {
            FileWriter fw = new FileWriter(arquivoFinal);
            BufferedWriter bw = new BufferedWriter(fw);
            FileReader fr = new FileReader(arquivoRegioes);
            BufferedReader br = new BufferedReader(fr);

            String linha = null;

            boolean verifyFirstLine = false;
            while ((linha = br.readLine()) != null) {
                boolean verifyRegion = false;
                for (PibPorRegiao ippr : alppr) {
                    if (ippr.getRegiao().equalsIgnoreCase(linha)) {
                        if (verifyFirstLine) {
                            bw.newLine();
                        }
                        bw.write(ippr.getRegiao() + " - PIB regional: " + ippr.getPibPorRegiao() + "%");
                        bw.newLine();
                        verifyFirstLine = true;
                        verifyRegion = true;
                        break;
                    }
                }

                if (!verifyRegion) {
                    for (PibPorEstado ippe : alppe) {
                        if (ippe.getEstado().equalsIgnoreCase(linha)) {
                            bw.write(ippe.getEstado() + " - PIB: " + ippe.getPibPorEstado() + "%");
                            bw.newLine();
                            break;
                        }
                    }
                }
            }

            br.close();
            bw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo(s) inexistente(s): '" + arquivoRegioes + "' e/ou '" + arquivoRegioes + "'");
        } catch (IOException ex) {
            System.out.println("Erro lendo o(s) arquivo(s): '" + arquivoRegioes + "' e/ou '" + arquivoRegioes + "'");
        }
    }
}