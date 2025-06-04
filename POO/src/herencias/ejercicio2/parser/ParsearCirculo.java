package herencias.ejercicio2.parser;


public class ParsearCirculo extends herencias.ejercicio2.models.FiguraPadre {

    public static java.util.List<herencias.ejercicio2.models.CirculoHijo> generarListaCirculo(java.util.List<String> listaInput) {
        final var listaCirculo = new java.util.ArrayList<herencias.ejercicio2.models.CirculoHijo>();

        for (var data : listaInput) {
            listaCirculo.add(parsearCirculo(data));
        }

        return listaCirculo;
    }

    private static herencias.ejercicio2.models.CirculoHijo parsearCirculo(String data) {
        final var array = data.split(",");

        final var radio = Double.parseDouble(array[0]);

        return new herencias.ejercicio2.models.CirculoHijo(radio);
    }
}
