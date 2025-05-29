package ejercicio2;

public class Videojuego {
    private final String nombre;
    private final int epoca;
    private final double precio;
    private final int duracion;
    private final String genero;
    private final String empresa;

    public Videojuego(String nombre, int epoca, double precio, int duracion, String genero, String empresa) {
        this.nombre = nombre;
        this.epoca = epoca;
        this.precio = precio;
        this.duracion = duracion;
        this.genero = genero;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        final var multilinea = """ 
                {
                    nombre: %s
                    epoca: %d
                    precio: %.2f
                    duracion: %d
                    genero: %s
                    empresa: %s
                }
                """;
        return String.format(multilinea, nombre, epoca, precio, duracion, genero, empresa);
    }

    public String getGenero() {
        return genero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getNombre() {
        return nombre;
    }
}
