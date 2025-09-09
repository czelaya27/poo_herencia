package org.czelaya.app;

public class AlumnoInternacional extends Alumno{

    private String pais;
    private double notaEspaniol;

    public AlumnoInternacional() {
    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        this(nombre, apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaEspaniol() {
        return notaEspaniol;
    }

    public void setNotaEspaniol(double notaEspaniol) {
        this.notaEspaniol = notaEspaniol;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPais: " + getPais() + ", Nota Español: " + getNotaEspaniol();
    }
}
