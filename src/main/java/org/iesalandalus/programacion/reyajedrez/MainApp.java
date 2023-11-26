package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

public class MainApp {
    ;
    public static void main(String[] args) {


        do {
            Consola.mostrarMenu();
            int opcion = Consola.elegirOpcionMenu();
            ejecutarOpcion(opcion);
        }while(!salir);

    }
        static Rey rey;
        static boolean salir = false;

        private static void ejecutarOpcion(int opcion){
            if(opcion==1)
            {
                //Crea el rey por defecto
                crearReyDefecto();
                return;
            } else if (opcion==2) {
                //elegir un color y crear el rey
                Color color = Consola.elegirColor();
                crearReyColor(color);
            }else if (opcion==3) {
                if (rey == null)
                {
                    System.out.println("Debes crear un REY primero!!");
                }
                else{
                    mover();
                }
            }
            else if (opcion==4){
                //salir
                Consola.despedirse();
                salir = true;
            }
        }

        private static void crearReyDefecto(){
             rey = new Rey();
            mostrarRey();
        }
        private static void crearReyColor(Color color){

             rey = new Rey(color);
            mostrarRey();
        }
        private static void mover(){
            //elegir direccion y moverse
            Consola.mostrarMenuDirecciones();
            Direccion direc = Consola.elegirDireccion();
            rey.mover(direc);
            mostrarRey();
        }
        private static void mostrarRey(){

            System.out.println(rey.toString());
        }


}
