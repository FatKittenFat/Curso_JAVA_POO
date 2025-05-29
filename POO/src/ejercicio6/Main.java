package ejercicio6;

public class Main {
    public static void main(String[] args) {
        final var fileInput = utilities.FileManager.leerFile(new java.io.File("src/ejercicio6/input/productos.csv"));

        final var arrayProductos = ejercicio6.parser.ProductoParser.obtenerArrayProductos(fileInput);

        ordenarArrayProducto(arrayProductos);

        System.out.printf("Array ordenado %s%n", java.util.Arrays.toString(arrayProductos));
    }

    private static void ordenarArrayProducto(ejercicio6.modelos.Producto[] array) {
        final var n = array.length;

        //ordenar
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j].getPrecio() > array[j + 1].getPrecio()) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
