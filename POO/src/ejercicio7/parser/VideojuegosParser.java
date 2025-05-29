package ejercicio7.parser;

public class VideojuegosParser {
    public static java.util.List<ejercicio7.modelos.Videojuegos> crearListaVideoJuegos(java.util.List<String> listaInput) {
        final var listaVideojuego = new java.util.ArrayList<ejercicio7.modelos.Videojuegos>();
        for (var elemento : listaInput) {
            listaVideojuego.add(parsearVideojuegos(elemento));
        }

        return listaVideojuego;
    }

    private static ejercicio7.modelos.Videojuegos parsearVideojuegos(String data) {
        final var arrayString = data.split(",");

        final var nombre = arrayString[0];
        final var epoca = Integer.parseInt(arrayString[1]);
        final var precio = Double.parseDouble(arrayString[2]);
        final var duracion = Integer.parseInt(arrayString[3]);
        final var genero = ejercicio7.modelos.Videojuegos.Genero.valueOf(arrayString[4]);
        final var empresa = ejercicio7.modelos.Videojuegos.Empresa.valueOf(arrayString[5]);

        return new ejercicio7.modelos.Videojuegos(nombre, epoca, precio, duracion, genero, empresa);
    }
}
