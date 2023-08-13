public class ControleRemoto {
    public static void main(String[] args) {
        Televisao televisao = new Televisao(50, 23);
        System.out.println(" ------ Canal ------ ");
        televisao.aumentarCanal();
        televisao.diminuirCanal();
        televisao.diminuirCanal();

        televisao.setCanal(80);
        televisao.aumentarCanal();
        televisao.aumentarCanal();
        televisao.aumentarCanal();
        televisao.aumentarCanal();
        televisao.diminuirCanal();

        televisao.setCanal(10);
        televisao.aumentarCanal();
        System.out.println(" ------ Volume ------ ");
        televisao.diminuirVolume();
        televisao.diminuirVolume();
        televisao.aumentarVolume();
        televisao.diminuirVolume();
        televisao.diminuirVolume();
    }
}