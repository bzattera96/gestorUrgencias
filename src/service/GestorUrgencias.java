package service;

import domain.ClasifTriage;
import domain.Persona;
import domain.Urgencia;
import util.TriageComparator;

import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.util.Queue;

public class GestorUrgencias {
    private long consecUrgencias;
    private Queue<Urgencia> urgencias;
    private Persona medicoTurno;

    public GestorUrgencias(Persona medicoTurno) {
        this.medicoTurno = medicoTurno;
        this.urgencias = new PriorityQueue<>(new TriageComparator()); //le digo qué uso para comparar
    }

    public void setMedicoTurno(Persona medicoTurno) {
        this.medicoTurno = medicoTurno;
    }

    public void registrarUrgencia(Persona paciente, String sintomas, ClasifTriage prioridad) {
        Urgencia auxiliar = new Urgencia(consecUrgencias, LocalDateTime.now(), medicoTurno, paciente, sintomas, prioridad);
        urgencias.add(auxiliar); //se ejecuta el TriageComparator
        consecUrgencias++;
    }

    public Urgencia asignarUrgencia() {
        Urgencia urgenciaAsign = urgencias.poll();
        urgenciaAsign.setFechaAsign(LocalDateTime.now());
        return urgenciaAsign;
    }

    public void imprimirUrgencias() {
        System.out.println(urgencias);
    }
}