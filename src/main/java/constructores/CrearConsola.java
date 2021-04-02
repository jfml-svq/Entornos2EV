package constructores;

import dominio.Consola;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CrearConsola {

    static ArrayList<Consola> consolas = new ArrayList();
    public static void leerConsolas(){

        Scanner entrada = new Scanner(System.in);


        //Declaración de variables para leer los datos de los Consolas
        String procesador;
        float herzios;
        String ram;
        String capacidad;
        String pulgadas;
        boolean stick;

        //Variable auxiliar que contendrá la referencia a cada consola nuevo.
        Consola datos;
        int i, N;

        //se pide por teclado el número de consolas a leer
        do {
            System.out.print("Número de Consolas? ");
            N = entrada.nextInt();
        } while (N < 0);
        entrada.nextLine(); //limpiar el intro

        //lectura de N consolas
        for (i = 1; i <= N; i++) {
            //leer datos de cada consola
            System.out.println("Consola nº: " + i);
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
            System.out.println("Stick?");
            stick = entrada.nextBoolean();

            /*entrada.nextLine(); //limpiar el intro*/

            datos = new Consola(); //Se crea un objeto consola y se asigna su referencia a datos

            //se asignan valores a los atributos del nuevo objeto
            datos.setProcesador(procesador);
            datos.setHerzios(herzios);
            datos.setRam(parseInt(ram));
            datos.setCapacidad(parseInt(capacidad));
            datos.setPulgadas(parseInt(pulgadas));
            datos.setStick(stick);

            //se añade el objeto al final del array
            consolas.add(datos);
        }
    } //fin método CrearConsola()


    public static void mostrarConsolas(){
        System.out.println("Consola/s creada/s:");
        for(int i = 0; i< consolas.size(); i++)
            System.out.println(consolas.get(i));  //se invoca el método toString de la clase consola
    }
}
