package dominio;

import java.util.Objects;

public class Sobremesa extends ComponentesDefault {


    private String placaBase;

    public Sobremesa(String procesador, float herzios, int ram, int capacidad, String placaBase) {

        super(procesador, herzios, ram, capacidad);
        this.placaBase = placaBase;
    }


    public Sobremesa(){
        super();
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sobremesa)) return false;
        Sobremesa sobremesa = (Sobremesa) o;
        return Float.compare(sobremesa.herzios, herzios) == 0
                && ram == sobremesa.ram
                && capacidad == sobremesa.capacidad
                && placaBase == sobremesa.placaBase
                && procesador.equals(sobremesa.procesador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(procesador, herzios, ram, capacidad, placaBase);
    }
}
