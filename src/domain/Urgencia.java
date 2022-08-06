package domain;

import java.time.LocalDateTime;

public class Urgencia {
    private long num;
    private LocalDateTime fechaLlegada;
    private LocalDateTime fechaAsign;
    private Persona medicoClasif;
    private Persona paciente;
    private String sintomas;
    private ClasifTriage triage;

    public Urgencia(long num, LocalDateTime fechaLlegada, Persona medicoClasif, Persona paciente, String sintomas, ClasifTriage triage) {
        this.num = num;
        this.fechaLlegada = fechaLlegada;
        this.medicoClasif = medicoClasif;
        this.paciente = paciente;
        this.sintomas = sintomas;
        this.triage = triage;
    }

    public long getNum() {
        return num;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public LocalDateTime getFechaAsign() {
        return fechaAsign;
    }

    public Persona getMedicoClasif() {
        return medicoClasif;
    }

    public Persona getPaciente() {
        return paciente;
    }

    public String getSintomas() {
        return sintomas;
    }

    public ClasifTriage getTriage() {
        return triage;
    }

    public void setFechaAsign(LocalDateTime fechaAsign) {
        this.fechaAsign = fechaAsign;
    }

    @Override
    public String toString() {
        return "Urgencia: " + num + " -  fecha de llegada: " + fechaLlegada + " - triage: " + triage + " - médico: " + getMedicoClasif().getNombre() + " " + getMedicoClasif().getApellido() + " - paciente: " + getPaciente().getNombre() + " " + getPaciente().getApellido();
    }
}