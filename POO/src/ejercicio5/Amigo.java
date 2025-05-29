package ejercicio5;

public class Amigo {
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final double peso;
    private final boolean casado;
    private final Color color;
    private final Profesion profesion;

    public Amigo(String nombre, String apellido, int edad, double peso, boolean casado, ejercicio5.Color color, ejercicio5.Amigo.Profesion profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.casado = casado;
        this.color = color;
        this.profesion = profesion;
    }

    public enum Profesion {
        INGENIERO,
        DENTISTA,
        ABOGADO,
    }

    @Override
    public String toString() {
        final var multilineas = """
                {
                     nombre: %s
                     apellido: %s
                     edad: %d
                     peso: %.2f
                     casado: %b
                     color: %s
                     profesion: %s                
                }
                """;
        return String.format(multilineas, nombre, apellido, edad, peso, casado, color, profesion);
    }
}
