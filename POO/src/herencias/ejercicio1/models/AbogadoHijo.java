package herencias.ejercicio1.models;

public class AbogadoHijo extends PersonaPadre {
    private final String notaria;
    private final int juiciosGanados;
    private final int juiciosAsistidos;


    public AbogadoHijo(String nombre, String apellido, int edad, boolean casado, String notaria, int juiciosGanados, int juiciosAsistidos) {
        super(nombre, apellido, edad, casado);
        this.notaria = notaria;
        this.juiciosGanados = juiciosGanados;
        this.juiciosAsistidos = juiciosAsistidos;
    }

    @Override
    public String toString() {
        final var json = """
                {
                    nombre: %s
                    apellido: %s
                    edad: %d
                    casado: %b
                    notaria: %s
                    jucios ganados: %d
                    juicios asistidos: %d
                }
                """;
        return String.format(json, nombre, apellido, edad, casado, notaria, juiciosGanados, juiciosAsistidos);
    }
}
