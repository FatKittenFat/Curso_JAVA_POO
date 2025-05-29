package ejercicio6.parser;


public class ProductoParser {

    public static ejercicio6.modelos.Producto[] obtenerArrayProductos(java.util.List<String> listaInput) {
        final var n = listaInput.size();
        final var arrayProductos = new ejercicio6.modelos.Producto[n];
        for (var i = 0; i < n; i++) {
            arrayProductos[i] = parsearProducto(listaInput.get(i));
        }
        return arrayProductos;
    }

    private static ejercicio6.modelos.Producto parsearProducto(String data) {
        final var arrayString = data.split(",");
        final var nombre = arrayString[0];
        final var precio = Double.parseDouble(arrayString[1]);
        final var stock = Integer.parseInt(arrayString[2]);
        final var peso = Double.parseDouble(arrayString[3]);
        final var perecible = Boolean.parseBoolean(arrayString[4]);
        final var volumen = Double.parseDouble(arrayString[5]);

        return new ejercicio6.modelos.Producto(nombre, precio, stock, peso, perecible, volumen);
    }
}
