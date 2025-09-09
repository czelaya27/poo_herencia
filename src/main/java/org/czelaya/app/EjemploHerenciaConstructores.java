package org.czelaya.app;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Cristian", "Zelaya", 20);
        alumno.setDireccion("Calle Chiquita");
        alumno.setEmail("criszelaya@hotmail.com");
        alumno.setInstitucion("INFRAVENZ");
        alumno.setNotaMatematica(10);
        alumno.setNotaHistoria(9);
        alumno.setNotaIngles(8);

        System.out.println("===== Alumno Constructor =====");
        System.out.println(alumno);

        Profesor profesor = new Profesor("Stefhani", "Lopez", "Programación");
        profesor.setDireccion("Pasaquina");
        profesor.setEdad(25);
        profesor.setEmail("fanylopez@gmail.com");

        System.out.println("\n===== Profesor Constructor =====");
        System.out.println(profesor);

        Persona persona = new Persona("Juan", "Perez", 22);
        persona.setDireccion("Calle 123");
        persona.setEmail("ejemplopersona@gmail.com");

        System.out.println("\n===== Persona Constructor =====");
        System.out.println(persona);

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("David", "Zelaya", "El Salvador");
        alumnoInternacional.setEdad(7);
        alumnoInternacional.setDireccion("Calle Chiquita 503");
        alumnoInternacional.setNotaEspaniol(9);

        System.out.println("\n===== Alumno Internacional Constructor =====");
        System.out.println(alumnoInternacional);

        System.out.println("===========================================================");

        imprimir(persona);
        imprimir(alumno);
        imprimir(alumnoInternacional);
        imprimir(profesor);    }

    public static void imprimir(Persona persona){
        System.out.println("Imprimiendo datos en comun del tipo Persona:");
        System.out.println("Nombre: "+ persona.getNombre() + " " + persona.getApellido() +
                ", Edad: " + persona.getEdad() + ", Email: " +persona.getEmail());
        System.out.println("===========================================================");
        if(persona instanceof Alumno){
            System.out.println("Imprimiendo datos del tipo Alumno:");
            System.out.println("Intitucion: "+ ((Alumno) persona).getInstitucion());
            System.out.println("Nota Matematica: "+ ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Historia: "+ ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Ingles: "+ ((Alumno) persona).getNotaIngles());
            System.out.println("===========================================================");
            if(persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo datos del tipo Alumno Internacional:");
                System.out.println("Pais: "+ ((AlumnoInternacional) persona).getPais());
                System.out.println("Nota Espaniol: "+ ((AlumnoInternacional) persona).getNotaEspaniol());
                System.out.println("===========================================================");
            }
        }
        if (persona instanceof Profesor) {
            System.out.println("Imprimiendo datos del tipo Profesor:");
            System.out.println("Asignatura: "+ ((Profesor) persona).getAsignatura());
        }
    }
}