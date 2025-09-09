package org.czelaya.app;

public class Alumno extends Persona{
    private String institucion;
    private double notaMatematica;
    private double notaHistoria;
    private double notaIngles;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion) {
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion, double notaMatematica,
                  double notaHistoria, double notaIngles) {
        this(nombre, apellido, edad, institucion);
        this.notaMatematica = notaMatematica;
        this.notaHistoria = notaHistoria;
        this.notaIngles = notaIngles;
    }

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
