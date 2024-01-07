public class Casa{
    private int janela;
    private int portas;
    private int comodos;

    public Casa(int janela, int portas, int comodos){
        this.janela = janela;
        this.portas = portas;
        this.comodos = comodos;
    }


    public int getJanela() {
        return this.janela;
    }

    public void setJanela(int janela) {
        this.janela = janela;
    }

    public int getPortas() {
        return this.portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getComodos() {
        return this.comodos;
    }

    public void setComodos(int comodos) {
        this.comodos = comodos;
    }
    
}