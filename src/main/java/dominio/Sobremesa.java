package dominio;

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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return getClass() == obj.getClass();
    }

}
