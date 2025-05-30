package herencias.ejercicio1.parser;

public class ParsearAbogado {
    // crear una lista
    public static java.util.List<herencias.ejercicio1.models.AbogadoHijo>
    generarListaAbogado(java.util.List<String> listaInput) {

        final var listaAbogados = new java.util.ArrayList<herencias.ejercicio1.models.AbogadoHijo>();

        for (var data : listaInput) {
            listaAbogados.add(parsearAbogado(data));
        }

        return listaAbogados;
    }

    private static herencias.ejercicio1.models.AbogadoHijo parsearAbogado(String data) {
        final var array = data.split(",");

        final var nombre = array[0];
        final var apellido = array[1];
        final var edad = Integer.parseInt(array[2]);
        final var casado = Boolean.parseBoolean(array[3]);
        final var notaria = array[4];
        final var juiciosGanados = Integer.parseInt(array[5]);
        final var juiciosAsistidos = Integer.parseInt(array[6]);

        return new herencias.ejercicio1.models.AbogadoHijo(nombre, apellido, edad,
                casado, notaria, juiciosGanados, juiciosAsistidos);
    }
}
