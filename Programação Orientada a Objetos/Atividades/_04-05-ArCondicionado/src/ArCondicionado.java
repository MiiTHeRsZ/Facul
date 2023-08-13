public class ArCondicionado {
    private boolean status = false;
    private int temperatura;
    private int intensidade;
    private boolean oscilacao;

    public ArCondicionado() {
    }

    public ArCondicionado(int temperatura, int intensidade, boolean oscilacao) {
        this.status = !status;
        this.temperatura = temperatura;
        this.intensidade = intensidade;
        this.oscilacao = oscilacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus() {
        this.status = !status;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }

    public boolean isOscilacao() {
        return oscilacao;
    }

    public void setOscilacao() {
        this.oscilacao = !oscilacao;
    }

    @Override
    public String toString() {
        return "O ar condicionado está " + (status ? "ligado" : "deligado") + ", e permanece na temperatura de " + temperatura + "ºC, na intensidade " + intensidade + " e com oscilacao " + (oscilacao ? "ligada." : "desligada.");
    }
}
