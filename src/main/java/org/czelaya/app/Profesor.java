package org.czelaya.app;

public class Profesor extends Persona{
    private String asignatura;

    public String getAsignatura() {
        return asignatura;
    }

    public Profesor() {
    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        this(nombre, apellido);
        this.asignatura = asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAsignatura: " + getAsignatura();
    }

    public String saludar() {
        String saludar = super.saludar();
        return saludar + "Me llamo: " + getNombre() + " " + getApellido() + " y soy un profesor de " + getAsignatura();
    }
}
