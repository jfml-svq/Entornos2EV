package constructores;

import dominio.Portatil;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CrearPortatil {

    static ArrayList<Portatil> portatiles = new ArrayList();
    public static void leerPortatiles(){

        Scanner entrada = new Scanner(System.in);


        //Declaración de variables para leer los datos de los portatiles
        String procesador;
        float herzios;
        String ram;
        String capacidad;
        String pulgadas;

        //Variable auxiliar que contendrá la referencia a cada portatil nuevo.
        Portatil datos;
        int i, N;

        //se pide por teclado el número de portatiles a leer
        do {
            System.out.print("Número de portatiles? ");
            N = entrada.nextInt();
        } while (N < 0);
        entrada.nextLine(); //limpiar el intro

        //lectura de N portatiles
        for (i = 1; i <= N; i++) {
            //leer datos de cada portatil
            System.out.println("Portatil nº: " + i);
            System.out.print("Procesador: ");
            procesador = entrada.nextLine();
            System.out.print("Herzios: ");
            herzios = entrada.nextFloat();
            entrada.nextLine();
            System.out.print("Pulgadas: ");
            pulgadas = entrada.nextLine();
            System.out.print("Ram: ");
            ram = entrada.nextLine();
            System.out.print("Capacidad: ");
            capacidad = entrada.nextLine();

            /*entrada.nextLine(); //limpiar el intro*/

            datos = new Portatil(); //Se crea un objeto portatil y se asigna su referencia a datos

            //se asignan valores a los atributos del nuevo objeto
            datos.setProcesador(procesador);
            datos.setHerzios(herzios);
            datos.setRam(parseInt(ram));
            datos.setCapacidad(parseInt(capacidad));
            datos.setPulgadas(parseInt(pulgadas));

            //se añade el objeto al final del array
            portatiles.add(datos);
        }
    } //fin método CrearPortatil()


    public static void mostrarPortatiles(){
        System.out.println("Portatil/es creado/s:");
        for(int i = 0; i< portatiles.size(); i++)
            System.out.println(portatiles.get(i));  //se invoca el método toString de la clase portatil
    }
}
