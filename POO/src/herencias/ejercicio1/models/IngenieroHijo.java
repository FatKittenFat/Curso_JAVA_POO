package herencias.ejercicio1.models;

public class IngenieroHijo extends PersonaPadre {
    private final String constructora;
    private final int edificiosConstruidos;
    private final int edificiosPlanificados;

    public IngenieroHijo(String nombre, String apellido, int edad, boolean casado, String constructora, int edificiosConstruidos, int edificiosPlanificados) {
        super(nombre, apellido, edad, casado);
        this.constructora = constructora;
        this.edificiosConstruidos = edificiosConstruidos;
        this.edificiosPlanificados = edificiosPlanificados;
    }

    @Override
    public String toString() {
        final var json = """
                {
                    nombre: %s
                    apellido: %s
                    edad: %d
                    casado: %b
                    constructora: %s
                    edificios construidos: %s
                    edificios planificados: %s
                }
                """;
        return String.format(json, nombre, apellido, edad, casado, constructora, edificiosConstruidos, edificiosPlanificados);
    }
}
