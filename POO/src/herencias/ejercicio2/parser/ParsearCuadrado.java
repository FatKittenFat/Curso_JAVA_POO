package herencias.ejercicio2.parser;

public class ParsearCuadrado extends herencias.ejercicio2.models.FiguraPadre {

    public static java.util.List<herencias.ejercicio2.models.CuadradoHijo> generaListaCuadrado(java.util.List<String> listaInput) {
        final var listaCuadrado = new java.util.ArrayList<herencias.ejercicio2.models.CuadradoHijo>();

        for (var data : listaInput) {
            listaCuadrado.add(parsearCuadrado(data));
        }

        return listaCuadrado;
    }

    private static herencias.ejercicio2.models.CuadradoHijo parsearCuadrado(String data) {
        final var array = data.split(",");

        final var lado = Double.parseDouble(array[0]);

        return new herencias.ejercicio2.models.CuadradoHijo(lado);
    }
}
