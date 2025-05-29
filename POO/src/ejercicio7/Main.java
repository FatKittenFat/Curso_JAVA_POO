package ejercicio7;

public class Main {
    public static void main(String[] args) {
        final var listaInput = utilities.FileManager.leerFile(new java.io.File("src/ejercicio7/input/videojuegos.csv"));
        final var listaVJ = ejercicio7.parser.VideojuegosParser.crearListaVideoJuegos(listaInput);
        final var listaXbox = filtrarListaXbox(listaVJ);

        System.out.printf("La lista es %s%n", listaXbox);

    }

    private static java.util.List<ejercicio7.modelos.Videojuegos> filtrarListaXbox(java.util.List<ejercicio7.modelos.Videojuegos> listaTotal) {
        final var listaXbox = new java.util.ArrayList<ejercicio7.modelos.Videojuegos>();
        for (var vj : listaTotal) {
            if (vj.getEmpresa().equals(ejercicio7.modelos.Videojuegos.Empresa.XBOX)) {
                listaXbox.add(vj);
            }
        }
        return listaXbox;
    }
}
