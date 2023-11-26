package org.iesalandalus.programacion.reyajedrez.modelo;

import java.util.Objects;

public class Posicion {
    private int fila;
    private char columna;

    public int getFila()
    {
        return fila;
    }
    private void setFila(int nuevaFila)
    {

        if(nuevaFila < 1 || nuevaFila > 8) //Lanza la exception si las fila no es correcta
        {
            throw new IllegalArgumentException("ERROR: Fila no válida.");
        }
        else
        {
            this.fila = nuevaFila;
        }
    }

    public char getColumna()
    {
        return columna;
    }
    private void setColumna(char nuevaColumna)
    {
        if (nuevaColumna == 'a' || nuevaColumna == 'b' || nuevaColumna == 'c' || nuevaColumna == 'd'|| 
                nuevaColumna == 'e'|| nuevaColumna == 'f' || nuevaColumna == 'g' || nuevaColumna == 'h') 
        {
            this.columna = nuevaColumna;
        } else {
            throw new IllegalArgumentException("ERROR: Columna no válida.");
        }

    }
    //llama a los metodos Set y pasa el nuevo valor
    public Posicion(int nuevaFila, char nuevaColumna)
    {
        if(nuevaFila < 1 || nuevaFila > 8 || !(nuevaColumna == 'a' || nuevaColumna == 'b' || nuevaColumna == 'c' || nuevaColumna == 'd'||
                nuevaColumna == 'e'|| nuevaColumna == 'f' || nuevaColumna == 'g' || nuevaColumna == 'h'))
        {
            throw new IllegalArgumentException("ERROR: No es posible copiar una posición nula.");
        }
        else
        {
            setFila(nuevaFila);
            setColumna(nuevaColumna);
        }

    }
    //Constructor copia
    public Posicion(Posicion posicion) {

        if(posicion == null) {
           // throw new IllegalArgumentException("ERROR: No es posible copiar una posición nula.");
            //En la tarea pide Illegal pero en los test salta NullPointer
            throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
        }
        else if(posicion.getFila() < 1 || posicion.getFila() > 8) //Lanza la exception si las fila no es correcta
        {
            throw new IllegalArgumentException("ERROR: Fila no válida.");
        }
        else if(!(posicion.getColumna() == 'a' || posicion.getColumna() == 'b' || posicion.getColumna() == 'c' || posicion.getColumna() == 'd'||
                posicion.getColumna() == 'e'|| posicion.getColumna() == 'f' || posicion.getColumna() == 'g' || posicion.getColumna() == 'h'))
        {
            throw new IllegalArgumentException("ERROR: Columna no válida.");
        }
        else
        {
            this.fila = posicion.fila;
            this.columna = posicion.columna;
        }

    }



    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Posicion otraPosicion = (Posicion) obj;
        return fila == otraPosicion.fila && columna == otraPosicion.columna;
    }
/*
    public String toString() {
        String str = "Fila: "+fila+" Columna: "+columna;
        return str;
    }
*/

    @Override
    public String toString() {
        return "fila=" + fila +
                ", columna=" + columna;
    }
}
