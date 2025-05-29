package ejercicio7.modelos;

public class Videojuegos {
    private final String nombre;
    private final int epoca;
    private final double precio;
    private final int duracion;
    private final Genero genero;
    private final Empresa empresa;

    public enum Genero {
        TERROR,
        COMEDIA,
        ACCION,
    }

    public enum Empresa {
        XBOX,
        NINTENDO,
        PLAY_STATION,
    }

    public Videojuegos(String nombre, int epoca, double precio, int duracion,
                       ejercicio7.modelos.Videojuegos.Genero genero,
                       ejercicio7.modelos.Videojuegos.Empresa empresa) {
        this.nombre = nombre;
        this.epoca = epoca;
        this.precio = precio;
        this.duracion = duracion;
        this.genero = genero;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        final var multilineas = """ 
                {
                    nombre: %s
                    epoca: %d
                    precio: %.2f
                    duracion: %d
                    genero: %s
                    empresa: %s
                }
                """;
        return String.format(multilineas, nombre, epoca, precio, duracion, genero, empresa);
    }

    public ejercicio7.modelos.Videojuegos.Empresa getEmpresa() {
        return empresa;
    }

    public ejercicio7.modelos.Videojuegos.Genero getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }
}
