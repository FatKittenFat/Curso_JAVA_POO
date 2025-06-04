package herencias.ejercicio2.parser;

public class ParsearTriangulo extends herencias.ejercicio2.models.FiguraPadre {

    public static java.util.List<herencias.ejercicio2.models.TrianguloHijo> generarListaTriangulo(java.util.List<String> listaInput) {
        final var listaTriangulo = new java.util.ArrayList<herencias.ejercicio2.models.TrianguloHijo>();

        for (var data : listaInput) {
            listaTriangulo.add(parsearTriangulo(data));
        }

        return listaTriangulo;
    }

    private static herencias.ejercicio2.models.TrianguloHijo parsearTriangulo(String data) {
        final var array = data.split(",");

        final var lado1 = Double.parseDouble(array[0]);
        final var lado2 = Double.parseDouble(array[1]);
        final var lado3 = Double.parseDouble(array[2]);

        return new herencias.ejercicio2.models.TrianguloHijo(lado1, lado2, lado3);
    }

}
