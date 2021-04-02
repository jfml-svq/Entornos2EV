package dominio;

public class Consola extends ComponentesDefault {


    private int pulgadas;
    private boolean stick;

    public Consola(String procesador, float herzios, int ram, int capacidad, int pulgadas, boolean stick) {
        super(procesador, herzios, ram, capacidad);
        this.pulgadas = pulgadas;
        this.stick = stick;
    }


    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isStick() {
        return stick;
    }

    public void setStick(boolean stick) {
        this.stick = stick;
    }
}

