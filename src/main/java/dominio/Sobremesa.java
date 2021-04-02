package dominio;

public class Sobremesa {

    private String procesador;
    private float herzios;
    private int ram;
    private int capacidad;
    private String placaBase;

    public Sobremesa(String procesador, float herzios, int ram, int capacidad, String placaBase) {
        this.procesador = procesador;
        this.herzios = herzios;
        this.ram = ram;
        this.capacidad = capacidad;
        this.placaBase = placaBase;
    }


    public Sobremesa(){
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

    public String getPlacaBase() {
        return placaBase;
    }

    public void setPlacaBase(String placaBase) {
        this.placaBase = placaBase;
    }


    @Override
    public String toString() {
        return "Procesador marca = " + procesador + " con " + herzios + " GHz"+ ", Ram de "
                + ram + "gb, Disco duro con capacidad de "
                + capacidad + "gb y Placa Base marca = " + placaBase + ".";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

}
