package org.czelaya.app;

public class Alumno extends Persona{
    private String institucion;
    private double notaMatematica;
    private double notaHistoria;
    private double notaIngles;

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public double getNotaIngles() {
        return notaIngles;
    }

    public void setNotaIngles(double notaIngles) {
        this.notaIngles = notaIngles;
    }

    public String toString() {
        return super.toString() + "\nInstitución: " + getInstitucion() + ", Nota Matemática: " + getNotaMatematica() +
                ", Nota Historia: " + getNotaHistoria() + ", Nota Ingles: " + getNotaIngles();
    }
}
