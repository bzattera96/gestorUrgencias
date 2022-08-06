package domain;

public enum ClasifTriage {
    AZUL(1), //le puedo definir atributos y constructor. EL LISTADO VA AL PRINCIPIO.
    ROJO(2),
    AMARILLO(3),
    VERDE(4),
    BLANCO(5);

    private int prioridad;

    ClasifTriage(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }
}
