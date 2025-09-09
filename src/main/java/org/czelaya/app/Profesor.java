package org.czelaya.app;

public class Profesor extends Persona{
    private String asignatura;

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAsignatura: " + getAsignatura();
    }
}
