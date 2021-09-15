package com.upc.excepciones;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("u202025648","Luis",17);
        try {
            alumno.validaEdad();
            System.out.println("Bienvenido Alumno " + alumno.getNombre()+ "!!!");
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
