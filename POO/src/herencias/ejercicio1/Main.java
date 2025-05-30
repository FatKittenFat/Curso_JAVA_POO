package herencias.ejercicio1;

public class Main {
    public static void main(String[] args) {

        final var fileAbogado = new java.io.File("src/herencias/ejercicio1/input/abogados.csv");
        final var fileDentista = new java.io.File("src/herencias/ejercicio1/input/dentistas.csv");
        final var fileIngenieros = new java.io.File("src/herencias/ejercicio1/input/ingenieros.csv");

        final var listaAbogado = utilities.FileManager.leerFile(fileAbogado);
        final var listaDentista = utilities.FileManager.leerFile(fileDentista);
        final var listaIngenieros = utilities.FileManager.leerFile(fileIngenieros);

        final var listaParseAbogado = herencias.ejercicio1.parser.ParsearAbogado.generarListaAbogado(listaAbogado);
        final var listaParseDentista = herencias.ejercicio1.parser.ParsearDentista.crearListaDentista(listaDentista);
        final var listaParseIngenieros = herencias.ejercicio1.parser.ParsearIngeniero.crearListaIngeniero(listaIngenieros);

        final var random = new java.util.Random();
        final var randomAbogado = utilities.RandomUtilities.generarRandomInt(0, listaParseAbogado.size() - 1, random);
        final var randomDentista = utilities.RandomUtilities.generarRandomInt(0, listaParseDentista.size() - 1, random);
        final var randomIngeniero = utilities.RandomUtilities.generarRandomInt(0, listaParseIngenieros.size() - 1, random);

        System.out.printf("ingenieros: %s%n", listaIngenieros.get(randomIngeniero));
        System.out.printf("abogado: %s%n", listaParseAbogado.get(randomAbogado));
        System.out.printf("dentista: %s%n", listaParseDentista.get(randomDentista));
    }
}
