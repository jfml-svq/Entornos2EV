package dominio;

public class ComponentesDefault {

    protected String procesador;
    protected float herzios;
    protected int ram;
    protected int capacidad;


    public ComponentesDefault(String procesador, float herzios, int ram, int capacidad) {
        this.procesador = procesador;
        this.herzios = herzios;
        this.ram = ram;
        this.capacidad = capacidad;
    }

    public ComponentesDefault() {

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
}
