package ejercicio4;

public class Main {
    public static void main(String[] args) {
        final var trabajador1 = new Trabajador("ROSA", "PALACIOS", 25);
        final var trabajador2 = new Trabajador("CARLOS", "FERNANDEZ", 52, "NADIA SERRANO");

        System.out.printf("nombre: %s, apellido; %s , estado civil: %s%n", trabajador1.getNombre(), trabajador1.getApellido(), trabajador1.getEstadoCivil());
        System.out.printf("nombre: %s, apellido; %s , estado civil: %s%n", trabajador2.getNombre(), trabajador2.getApellido(), trabajador2.getEstadoCivil());
    }
}
