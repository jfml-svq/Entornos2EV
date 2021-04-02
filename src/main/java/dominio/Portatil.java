package dominio;

import java.util.Objects;

public class Portatil extends ComponentesDefault{

       private int pulgadas;

    public Portatil(String procesador, float herzios, int ram, int capacidad, int pulgadas) {
        super(procesador, herzios, ram, capacidad);
        this.pulgadas = pulgadas;
    }

    public Portatil() {

    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Procesador marca = " + procesador + " con " + herzios + " GHz"+ ", Ram de "
                + ram + "gb, Disco duro con capacidad de "
                + capacidad + "gb y con pantalla de " + pulgadas + " pulgadas.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Portatil)) return false;
        Portatil portatil = (Portatil) o;
        return Float.compare(portatil.herzios, herzios) == 0
                && ram == portatil.ram
                && capacidad == portatil.capacidad
                && pulgadas == portatil.pulgadas
                && procesador.equals(portatil.procesador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(procesador, herzios, ram, capacidad, pulgadas);
    }
}
