package dominio;

import java.util.Objects;

public class Consola extends ComponentesDefault {


    private int pulgadas;
    private boolean stick;

    public Consola(String procesador, float herzios, int ram, int capacidad, int pulgadas, boolean stick) {
        super(procesador, herzios, ram, capacidad);
        this.pulgadas = pulgadas;
        this.stick = stick;
    }

    public Consola() {

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

    @Override
    public String toString() {
        return "Procesador marca = " + procesador + " con " + herzios + " GHz"+ ", Ram de "
                + ram + "gb, Disco duro con capacidad de "
                + capacidad + "gb, con pantalla de " + pulgadas + " pulgadas " +
                " y stick ." + stick ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Consola)) return false;
        Consola consola = (Consola) o;
        return Float.compare(consola.herzios, herzios) == 0
                && ram == consola.ram
                && capacidad == consola.capacidad
                && pulgadas == consola.pulgadas
                && stick == consola.stick
                && procesador.equals(consola.procesador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(procesador, herzios, ram, capacidad, pulgadas, stick);
    }
}

