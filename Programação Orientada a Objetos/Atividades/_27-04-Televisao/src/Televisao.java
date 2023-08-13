public class Televisao {
    private int volume;
    private int canal;

    

    public Televisao(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;

        System.out.println("Ligou no canal: " + getCanal() + ", no volume: " + getVolume());
    }

    public int getVolume() {
        return volume;
    }

    public void aumentarVolume() {
        this.volume += 1;

        System.out.println("Volume: " + getVolume());
    }

    public void diminuirVolume() {
        this.volume -= 1;

        System.out.println("Volume: " + getVolume());
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;

        System.out.println("Canal: " + getCanal());
    }

    public void aumentarCanal() {
        this.canal += 1;

        System.out.println("Canal: " + getCanal());
    }

    public void diminuirCanal() {
        this.canal -= 1;

        System.out.println("Canal: " + getCanal());
    }

}
