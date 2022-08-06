import domain.*;
import service.GestorUrgencias;

import java.time.LocalDateTime;
import java.util.Date;

public class App {
    public static final void main(String[] args) {

        Persona medico1 = new Medico(TipoId.PASAPORTE, "M123456", "Brenda", "Zattera", LocalDateTime.of(1991, 1, 7, 0, 0), 1231231213);
        Persona paciente1 = new Paciente(TipoId.DNI, "39668644", "Juan Carlos", "Fernandez", LocalDateTime.of(1996, 4, 27, 1, 1), "Profesor", "Pami");
        Persona paciente2 = new Paciente(TipoId.DNI, "39789644", "Maria", "Pérez", LocalDateTime.of(1945, 8, 31, 4, 1), "Desarrolladora", "Swiss Medical");

        GestorUrgencias gestor1 = new GestorUrgencias(medico1);
        gestor1.registrarUrgencia(paciente2, "Dolor de cabeza", ClasifTriage.VERDE);
        gestor1.registrarUrgencia(paciente1, "Falta de aire", ClasifTriage.AMARILLO);
        System.out.println(gestor1.asignarUrgencia());

        gestor1.imprimirUrgencias();
    }
}