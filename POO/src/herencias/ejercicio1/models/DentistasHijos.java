package herencias.ejercicio1.models;

public class DentistasHijos extends PersonaPadre {
    private final String centroDental;
    private final int pacientesFelices;
    private final int pacientesTotales;

    public DentistasHijos(String nombre, String apellido, int edad, boolean casado, String centroDental, int pacientesFelices, int pacientesTotales) {
        super(nombre, apellido, edad, casado);
        this.centroDental = centroDental;
        this.pacientesFelices = pacientesFelices;
        this.pacientesTotales = pacientesTotales;
    }

    @Override
    public String toString() {
        final var json = """
                {
                    nombre: %s
                    apellido: %s
                    edad: %d
                    casado: %b
                    centro dental: %s
                    pacientes felices: %d
                    pacientes totales: %d
                }
                """;
        return String.format(json, nombre, apellido, edad, casado, centroDental, pacientesFelices, pacientesTotales);
    }
}
