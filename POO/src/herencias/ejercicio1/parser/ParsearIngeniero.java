package herencias.ejercicio1.parser;

public class ParsearIngeniero {

    public static java.util.List<herencias.ejercicio1.models.IngenieroHijo> crearListaIngeniero(java.util.List<String> listaInput) {
        final var listaIngeniero = new java.util.ArrayList<herencias.ejercicio1.models.IngenieroHijo>();

        for (var dato : listaInput) {
            listaIngeniero.add(parsearIngeniero(dato));
        }

        return listaIngeniero;
    }

    private static herencias.ejercicio1.models.IngenieroHijo parsearIngeniero(String data) {
        final var array = data.split(",");

        final var nombre = array[0];
        final var apellido = array[1];
        final var edad = Integer.parseInt(array[2]);
        final var casado = Boolean.parseBoolean(array[3]);
        final var constructora = array[4];
        final var edifConstruidos = Integer.parseInt(array[5]);
        final var edifPlanificados = Integer.parseInt(array[6]);

        return new herencias.ejercicio1.models.IngenieroHijo(nombre, apellido, edad, casado, constructora, edifConstruidos, edifPlanificados);

    }
}
