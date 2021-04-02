package constructores;

import dominio.Sobremesa;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CrearSobremesa {

    static ArrayList<Sobremesa> sobremesas = new ArrayList();
    public static void leerSobremesas(){

        Scanner entrada = new Scanner(System.in);


        //Declaración de variables para leer los datos de los ordenadores
        String procesador;
        float herzios;
        String ram;
        String capacidad;
        String placaBase;

        //Variable auxiliar que contendrá la referencia a cada sobremesa nuevo.
        Sobremesa datos;
        int i, N;

        //se pide por teclado el número de ordenadores a leer
        do {
            System.out.print("Número de ordenadores? ");
            N = entrada.nextInt();
        } while (N < 0);
        entrada.nextLine(); //limpiar el intro

        //lectura de N sobremesas
        for (i = 1; i <= N; i++) {
            //leer datos de cada coche
            System.out.println("Sobremesa " + i);
            System.out.print("Procesador: ");
            procesador = entrada.nextLine();
            System.out.print("Herzios: ");
            herzios = entrada.nextFloat();
            entrada.nextLine();
            System.out.print("Placa base: ");
            placaBase = entrada.nextLine();
            System.out.print("Ram: ");
            ram = entrada.nextLine();
            System.out.print("Capacidad: ");
            capacidad = entrada.nextLine();

            /*entrada.nextLine(); //limpiar el intro*/

            datos = new Sobremesa(); //Se crea un objeto Coche y se asigna su referencia a datos

            //se asignan valores a los atributos del nuevo objeto
            datos.setProcesador(procesador);
            datos.setHerzios(herzios);
            datos.setRam(parseInt(ram));
            datos.setCapacidad(parseInt(capacidad));
            datos.setPlacaBase(placaBase);

            //se añade el objeto al final del array
            sobremesas.add(datos);
        }
    } //fin método CrearSobremesa()


    public static void mostrarCoches(){
        System.out.println("Sobremesa/s creado/s:");
        for(int i = 0; i< sobremesas.size(); i++)
            System.out.println(sobremesas.get(i));  //se invoca el método toString de la clase Sobremesa
    }

}
