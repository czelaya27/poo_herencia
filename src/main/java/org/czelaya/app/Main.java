package org.czelaya.app;

public class Main {
    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        alumno.setNombre("Cristian");
        alumno.setApellido("Zelaya");
        alumno.setEdad(20);
        alumno.setDireccion("Calle Chiquita 503");
        alumno.setEmail("criszel94@gmail.com");
        alumno.setInstitucion("Universidad Gerardo Barrios");
        alumno.setNotaMatematica(9.5);
        alumno.setNotaHistoria(8.5);
        alumno.setNotaIngles(7.5);

        System.out.println("===== Alumno =====");
        System.out.println(alumno);

        Profesor profesor = new Profesor();
        profesor.setNombre("Stefhani");
        profesor.setApellido("Lopez");
        profesor.setDireccion("Pasaquina");
        profesor.setEdad(25);
        profesor.setEmail("fanylopez@gmail.com");
        profesor.setAsignatura("Programación");

        System.out.println("\n===== Profesor =====");
        System.out.println(profesor);

        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEdad(22);
        persona.setDireccion("Calle 123");
        persona.setEmail("ejemplopersona@gmail.com");

        System.out.println("\n===== Persona =====");
        System.out.println(persona);

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("David");
        alumnoInternacional.setApellido("Zelaya");
        alumnoInternacional.setEdad(7);
        alumnoInternacional.setDireccion("Calle Chiquita 503");
        alumnoInternacional.setEmail("");
        //alumnoInternacional.setInstitucion("Universidad Gerardo Barrios");
        alumnoInternacional.setNotaEspaniol(9);
        alumnoInternacional.setPais("El Salvador");

        System.out.println("\n===== Alumno Internacional =====");
        System.out.println(alumnoInternacional);

    }
}