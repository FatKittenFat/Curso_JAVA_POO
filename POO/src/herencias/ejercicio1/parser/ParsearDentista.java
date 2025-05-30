package herencias.ejercicio1.parser;

public class ParsearDentista {
    public static java.util.List<herencias.ejercicio1.models.DentistasHijos> crearListaDentista(java.util.List<String> listaInput) {
        final var listaDentista = new java.util.ArrayList<herencias.ejercicio1.models.DentistasHijos>();

        for (var data : listaInput) {
            listaDentista.add(parsearDentistas(data));
        }

        return listaDentista;
    }

    private static herencias.ejercicio1.models.DentistasHijos parsearDentistas(String data) {
        final var array = data.split(",");

        final var nombre = array[0];
        final var apellido = array[1];
        final var edad = Integer.parseInt(array[2]);
        final var casado = Boolean.parseBoolean(array[3]);
        final var centroDental = array[4];
        final var pacientesFelices = Integer.parseInt(array[5]);
        final var pacientesTotales = Integer.parseInt(array[6]);

        return new herencias.ejercicio1.models.DentistasHijos(nombre, apellido, edad, casado, centroDental, pacientesFelices, pacientesTotales);
    }

}
