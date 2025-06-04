package herencias.ejercicio2;

public class Main {
    public static void main(String[] args) {
        final var fileCirculo = new java.io.File("src/herencias/ejercicio2/input/circulos.csv");
        final var fileCuadrado = new java.io.File("src/herencias/ejercicio2/input/cuadrados.csv");
        final var fileTriangulo = new java.io.File("src/herencias/ejercicio2/input/triangulos.csv");

        final var listaCirculo = utilities.FileManager.leerFile(fileCirculo);
        final var listaCuadrado = utilities.FileManager.leerFile(fileCuadrado);
        final var listaTriangulo = utilities.FileManager.leerFile(fileTriangulo);

        final var listaParserCirculo = herencias.ejercicio2.parser.ParsearCirculo.generarListaCirculo(listaCirculo);
        final var listaParserCuadrado = herencias.ejercicio2.parser.ParsearCuadrado.generaListaCuadrado(listaCuadrado);
        final var listaParserTriangulo = herencias.ejercicio2.parser.ParsearTriangulo.generarListaTriangulo(listaTriangulo);

        final var random = new java.util.Random();
        final var randomCirculo = utilities.RandomUtilities.generarRandomInt(0, listaCirculo.size() - 1, random);
        final var randomCuadrado = utilities.RandomUtilities.generarRandomInt(0, listaCuadrado.size() - 1, random);
        final var randomTriangulo = utilities.RandomUtilities.generarRandomInt(0, listaTriangulo.size() - 1, random);

        System.out.printf("random circulo: %s%n", listaParserCirculo.get(randomCirculo));
        System.out.printf("random cuadrado: %s%n", listaParserCuadrado.get(randomCuadrado));
        System.out.printf("random triangulo: %s%n", listaParserTriangulo.get(randomTriangulo));
    }
}
