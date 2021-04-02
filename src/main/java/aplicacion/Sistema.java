package aplicacion;

import constructores.CrearConsola;
import constructores.CrearPortatil;
import constructores.CrearSobremesa;

import java.util.Scanner;

public class Sistema {


    private CrearConsola crearConsola;
    private CrearPortatil crearPortatil;
    private CrearSobremesa crearSobremesa;
    private boolean salir = false;
    private Scanner entrada = new Scanner(System.in);
    private String selector;


    public void ejecutarAplicacion(){

        do {
            System.out.println("1: Crea uno o varios ordenadores de sobremesa:");
            System.out.println("2: Crea uno o varios ordenadores portatiles:");
            System.out.println("3: Crea una o varias consolas portatiles:");
            System.out.println("4: Muestra el/los Sobremesa/s creado/s:");
            System.out.println("5: Muestra el/los Portatil/es creado/s:");
            System.out.println("6: Muestra el/las Consolas creada/s:");
            System.out.println("0: Salir");
            System.out.println("Elija una opcion!");
            selector = entrada.nextLine();
            switch (selector) {
                case "0":
                    salir();
                    break;
                case "1":
                    crearSobremesa.leerSobremesas();
                    break;
                case "2":
                    crearPortatil.leerPortatiles();
                    break;
                case "3":
                    crearConsola.leerConsolas();
                    break;
                case "4":
                    System.out.println("Sobremesas introducidos:\n");
                    crearSobremesa.mostrarSobremesa();
                    break;
                case "5":
                    crearPortatil.mostrarPortatiles();
                    break;
                case "6":
                    crearConsola.mostrarConsolas();
                    break;
                default:
                    System.out.println("No existe esta opcion");
                    break;
            }
        } while (!salir);
    }

    public void salir(){
        this.salir = true;
    }
}

