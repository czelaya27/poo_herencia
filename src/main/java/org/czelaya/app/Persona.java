package org.czelaya.app;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String email;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, int edad) {
        this(nombre, apellido);
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " " + getApellido() +
                ", Edad: " + getEdad() +
                ", Dirección: " + getDireccion() +
                ", Email: " + getEmail() +
                "\nSaludo: " + saludar();
    }

    public String saludar(){
        return "Hola, que tal?\n";
    }
}
