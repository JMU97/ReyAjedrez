package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

    private Consola() {
        //Esto evita que se pueda hacer un new a la clase consola.
    }

    public static void mostrarMenu() {
        System.out.println("********** Menú **********");
        System.out.println("1. Crear rey por defecto");
        System.out.println("2. Crear rey eligiendo el color");
        System.out.println("3. Mover");
        System.out.println("4. Salir");
        System.out.println("**************************");
    }
    public static int elegirOpcionMenu () {
        int opcion;
        do {
            System.out.println("Elige una opcion: 1 - 2 - 3 - 4");
            opcion = Entrada.entero();
        } while (!(opcion == 1 || opcion == 2|| opcion == 3|| opcion == 4));
       return opcion;
    }
    public static Color elegirColor(){
        String opcion;
        do {
            System.out.println("Elige un color: BLANCO o NEGRO");
            opcion = Entrada.cadena().toUpperCase();
        } while (!(opcion.equals("BLANCO") || opcion.equals("NEGRO")));
        if(opcion.equals("BLANCO"))
        {
            return Color.BLANCO;
        }
        else{
            return Color.NEGRO;
        }
    }

    public static void mostrarMenuDirecciones(){
        Direccion[] direcciones = Direccion.values();
        int i = 0;
        for (Direccion direccion : direcciones) {
            i++;
            System.out.println(i +". "+ direccion);
        }
    }
    public static Direccion elegirDireccion(){
        int opcion;
        do {
            System.out.println("Elige una Direccion: 1 al 10");
            opcion = Entrada.entero();

        } while (!(opcion >= 1 && opcion <= 10));

        if(opcion == 1)
        {
            return Direccion.NORTE;
        }
        else if(opcion == 2)
        {
            return Direccion.NORESTE;
        }
        else if(opcion == 3)
        {
            return Direccion.ESTE;
        }
        else if(opcion == 4)
        {
            return Direccion.SURESTE;
        }
        else if(opcion == 5)
        {
            return Direccion.SUR;
        }
        else if(opcion == 6)
        {
            return Direccion.SUROESTE;
        }
        else if(opcion == 7)
        {
            return Direccion.OESTE;
        }
        else if(opcion == 8)
        {
            return Direccion.NOROESTE;
        }
        else if(opcion == 9)
        {
            return Direccion.ENROQUE_CORTO;
        }
        else{ //Opcion 10

            return Direccion.ENROQUE_LARGO;
        }
    }
    public static void despedirse()
    {
        System.out.println("Adios! Gracias por jugar");
    }


}
