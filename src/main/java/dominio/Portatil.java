package dominio;

public class Portatil {

    private String procesador;
    private float herzios;
    private int ram;
    private int capacidad;
    private int pulgadas;

    public Portatil(String procesador, float herzios, int ram, int capacidad, int pulgadas) {
        this.procesador = procesador;
        this.herzios = herzios;
        this.ram = ram;
        this.capacidad = capacidad;
        this.pulgadas = pulgadas;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public float getHerzios() {
        return herzios;
    }

    public void setHerzios(float herzios) {
        this.herzios = herzios;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
}
