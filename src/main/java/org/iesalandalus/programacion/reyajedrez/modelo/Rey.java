package org.iesalandalus.programacion.reyajedrez.modelo;


import java.util.Objects;

public class Rey {
    private static int totalMovimientos;
    private Color color;
    private static Posicion posicion;

    //GET color
    public Color getColor(){
        return color;
    }
    //SET color
    private void setColor(Color color) {
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }
    private void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    public int getTotalMovimientos() {
        return totalMovimientos;
    }
    private void setTotalMovimientos(int totalMovimientos) {
        this.totalMovimientos = totalMovimientos;
    }

    public Rey() {

        this.color = Color.BLANCO;
        posicion = new Posicion(1, 'e');
        totalMovimientos = 0;
    }

    public Rey(Color color) {
        this.color = color;
        if (color == Color.BLANCO) {
            this.posicion = new Posicion(1, 'e');
        } else {
            this.posicion = new Posicion(8, 'e');
        }
        this.totalMovimientos = 0;
    }


    public void mover(Direccion direccion) {

        if (direccion == null) {
            throw new NullPointerException("ERROR: La dirección no puede ser nula.");
        }
        switch (direccion) {
            case NORTE:
                if (posicion.getFila() <= 8 && posicion.getFila() >= 1) {
                    // Mueve hacia el norte

                    setPosicion(new Posicion(posicion.getFila()+1, posicion.getColumna() ));

                } else {
                    //throw new OperationNotSupportedException("El rey se sale del tablero hacia el norte.");
                }
                break;
            case NORESTE:
                if (posicion.getFila() <= 8 && posicion.getFila() >= 1 && posicion.getColumna() >= 'a' && posicion.getColumna() <= 'h') {
                    // Mueve hacia el norte + derecha
                    char mov = 'a';
                    if(posicion.getColumna() == 'a')
                    {
                        mov = 'b';
                    } else if (posicion.getColumna() == 'b') {
                        mov = 'c';
                    }
                    else if (posicion.getColumna() == 'c') {
                        mov = 'd';
                    }
                    else if (posicion.getColumna() == 'd') {
                        mov = 'e';
                    }
                    else if (posicion.getColumna() == 'e') {
                        mov = 'f';
                    }
                    else if (posicion.getColumna() == 'f') {
                        mov = 'g';
                    }
                    else if (posicion.getColumna() == 'g') {
                        mov = 'h';
                    }
                    setPosicion(new Posicion(posicion.getFila()+1, mov ));

                } else {
                    // throw new OperationNotSupportedException("El rey se sale del tablero hacia el norte.");
                }
                break;
            case ESTE:
                if (posicion.getFila() <= 8 && posicion.getFila() >= 1 && posicion.getColumna() >= 'a' && posicion.getColumna() <= 'h') {

                    // Mueve hacia la derecha
                    char mov = 'a';
                    if(posicion.getColumna() == 'a')
                    {
                        mov = 'b';
                    } else if (posicion.getColumna() == 'b') {
                        mov = 'c';
                    }
                    else if (posicion.getColumna() == 'c') {
                        mov = 'd';
                    }
                    else if (posicion.getColumna() == 'd') {
                        mov = 'e';
                    }
                    else if (posicion.getColumna() == 'e') {
                        mov = 'f';
                    }
                    else if (posicion.getColumna() == 'f') {
                        mov = 'g';
                    }
                    else if (posicion.getColumna() == 'g') {
                        mov = 'h';
                    }
                    setPosicion(new Posicion(posicion.getFila(), mov ));

                } else {
                    // throw new OperationNotSupportedException("El rey se sale del tablero hacia el norte.");
                }
                break;
                case SURESTE:
                    if (posicion.getFila() <= 8 && posicion.getFila() >= 1 && posicion.getColumna() >= 'a' && posicion.getColumna() <= 'h') {

                        // Mueve hacia abajo + derecha
                        char mov = 'a';
                        if(posicion.getColumna() == 'a')
                        {
                            mov = 'b';
                        } else if (posicion.getColumna() == 'b') {
                            mov = 'c';
                        }
                        else if (posicion.getColumna() == 'c') {
                            mov = 'd';
                        }
                        else if (posicion.getColumna() == 'd') {
                            mov = 'e';
                        }
                        else if (posicion.getColumna() == 'e') {
                            mov = 'f';
                        }
                        else if (posicion.getColumna() == 'f') {
                            mov = 'g';
                        }
                        else if (posicion.getColumna() == 'g') {
                            mov = 'h';
                        }
                        setPosicion(new Posicion(posicion.getFila()-1, mov ));

                    } else {
                        // throw new OperationNotSupportedException("El rey se sale del tablero hacia el norte.");
                    }
                    break;

            case SUR:
                if (posicion.getFila() <= 8 && posicion.getFila() >= 1 && posicion.getColumna() >= 'a' && posicion.getColumna() <= 'h') {
                    // Mueve hacia el sur
                    setPosicion(new Posicion(posicion.getFila()-1, posicion.getColumna() ));

                } else {
                    // throw new OperationNotSupportedException("El rey se sale del tablero hacia el norte.");
                }
                break;

            case SUROESTE:
                if (posicion.getFila() <= 8 && posicion.getFila() >= 1 && posicion.getColumna() >= 'a' && posicion.getColumna() <= 'h') {

                    // Mueve hacia abajo + izquierda
                    char mov = 'a';
                    if(posicion.getColumna() == 'h')
                    {
                        mov = 'g';
                    } else if (posicion.getColumna() == 'g') {
                        mov = 'f';
                    }
                    else if (posicion.getColumna() == 'f') {
                        mov = 'e';
                    }
                    else if (posicion.getColumna() == 'e') {
                        mov = 'd';
                    }
                    else if (posicion.getColumna() == 'd') {
                        mov = 'c';
                    }
                    else if (posicion.getColumna() == 'c') {
                        mov = 'b';
                    }
                    else if (posicion.getColumna() == 'b') {
                        mov = 'a';
                    }
                    setPosicion(new Posicion(posicion.getFila()-1, mov ));

                } else {
                    // throw new OperationNotSupportedException("El rey se sale del tablero hacia el norte.");
                }
                break;
            case OESTE:
                if (posicion.getFila() <= 8 && posicion.getFila() >= 1 && posicion.getColumna() >= 'a' && posicion.getColumna() <= 'h') {

                    // Mueve hacia la izquierda
                    char mov = 'a';
                    if(posicion.getColumna() == 'h')
                    {
                        mov = 'g';
                    } else if (posicion.getColumna() == 'g') {
                        mov = 'f';
                    }
                    else if (posicion.getColumna() == 'f') {
                        mov = 'e';
                    }
                    else if (posicion.getColumna() == 'e') {
                        mov = 'd';
                    }
                    else if (posicion.getColumna() == 'd') {
                        mov = 'c';
                    }
                    else if (posicion.getColumna() == 'c') {
                        mov = 'b';
                    }
                    else if (posicion.getColumna() == 'b') {
                        mov = 'a';
                    }
                    setPosicion(new Posicion(posicion.getFila(), mov ));

                } else {
                    // throw new OperationNotSupportedException("El rey se sale del tablero hacia el norte.");
                }
                break;
            case NOROESTE:
                if (posicion.getFila() <= 8 && posicion.getFila() >= 1 && posicion.getColumna() >= 'a' && posicion.getColumna() <= 'h') {

                    // Mueve hacia arriba + izquierda
                    char mov = 'a';
                    if(posicion.getColumna() == 'h')
                    {
                        mov = 'g';
                    } else if (posicion.getColumna() == 'g') {
                        mov = 'f';
                    }
                    else if (posicion.getColumna() == 'f') {
                        mov = 'e';
                    }
                    else if (posicion.getColumna() == 'e') {
                        mov = 'd';
                    }
                    else if (posicion.getColumna() == 'd') {
                        mov = 'c';
                    }
                    else if (posicion.getColumna() == 'c') {
                        mov = 'b';
                    }
                    else if (posicion.getColumna() == 'b') {
                        mov = 'a';
                    }
                    setPosicion(new Posicion(posicion.getFila()+1, mov ));

                } else {
                    // throw new OperationNotSupportedException("El rey se sale del tablero hacia el norte.");
                }
                break;
            case ENROQUE_CORTO:
                comprobarEnroqueCorto();
                break;
            case ENROQUE_LARGO:
                comprobarEnroqueLargo();


                break;


        }

        totalMovimientos++;
    }
    private void comprobarEnroqueCorto()
    {
        if(Objects.equals(color.toString(), "Blanco") && posicion.getFila()== 1 && posicion.getColumna() == 'e')
        {
            //corto a la derecha
            setPosicion(new Posicion(posicion.getFila(), 'g' ));
        } else if (Objects.equals(color.toString(), "Negro") && posicion.getFila()== 8 && posicion.getColumna() == 'e'){
            setPosicion(new Posicion(posicion.getFila(), 'g' ));
        }
    }
    private void comprobarEnroqueLargo()
    {
        if(Objects.equals(color.toString(), "Blanco") && posicion.getFila()== 1 && posicion.getColumna() == 'e')
        {
            setPosicion(new Posicion(posicion.getFila(), 'c' ));
        } else if (Objects.equals(color.toString(), "Negro") && posicion.getFila()== 8 && posicion.getColumna() == 'e'){
            setPosicion(new Posicion(posicion.getFila(), 'c' ));
        }

    }
    /*
    public String toString() {
        String str = "\n REY "+color+ " -> "+posicion +"\n";
        return str;
    }
     */

    @Override
    public String toString() {
        return "color="+color+", posicion=("+posicion+")";
    }
}
