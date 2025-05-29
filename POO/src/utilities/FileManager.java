package utilities;

public class FileManager {

    public static java.util.List<String> leerFile(java.io.File file) {
        final var lista = new java.util.ArrayList<String>(); // lista vacia
        try {
            final var scanner = new java.util.Scanner(file);//scaner creado apuntando al archivo
            while (scanner.hasNextLine()) { //itera el archivo
                lista.add(scanner.nextLine()); // rellena la lista con lo que tiene el archivo
            }
            scanner.close(); // cuando ya no tiene lineas cierra el scanner del archivo
        } catch (java.io.FileNotFoundException fileNotFoundException) {
            System.out.println("Error al abrir el archivo");
            System.err.printf("FileNotFoundException: %s%n", fileNotFoundException.getLocalizedMessage());
        }
        return lista; // regresa la lista que leyo
    }

    public static void escribirFile(java.io.File file, java.util.List<String> lista) {
        try {
            final var fileWriter = new java.io.FileWriter(file); // abrir un archivo que lo guarda en file
            for (var linea : lista) {
                final var escribirLinea = String.format("%s%n", linea);
                fileWriter.write(escribirLinea);
            }
            fileWriter.close();
        } catch (java.io.IOException ioException) {
            System.out.println("Error al escribir en el archivo");
            System.err.printf("IOException: %s%n", ioException.getLocalizedMessage());
        }
    }
}
