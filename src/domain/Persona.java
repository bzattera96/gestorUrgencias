package domain;

import java.time.LocalDateTime;

public abstract class Persona {
    protected TipoId tipoId;
    protected String numId;
    protected String nombre;
    protected String apellido;
    protected LocalDateTime fechaNac;

    protected Persona(TipoId tipoId, String numId, String nombre, String apellido, LocalDateTime fechaNac) {
        this.tipoId = tipoId;
        this.numId = numId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    public TipoId getTipoId() {
        return tipoId;
    }

    public void setTipoId(TipoId tipoId) {
        this.tipoId = tipoId;
    }

    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDateTime getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDateTime fechaNac) {
        this.fechaNac = fechaNac;
    }
}