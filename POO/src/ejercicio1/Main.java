//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        final var producto1 = new ejercicio1.Producto("SALMON", 15.42, 35, 2.67, true, 4.4);
//        final var producto2 = new ejercicio1.Producto("JITOMATE", 11.98, 84, 3.4, false, 9.9);
//
//        System.out.printf("nombre: %s, precio %.2f, stock %d%n", producto1.getNombre(), producto1.getPrecio(), producto1.getStock());
//        System.out.printf("nombre: %s, precio %.2f, stock %d%n", producto2.getNombre(), producto2.getPrecio(), producto2.getStock());
//
        final var videojuego = new ejercicio2.Videojuego(
                "BLUE PROTOCOL", 2011, 58.99, 45, "TERROR", "XBOX");
        final var videojuego2 = new ejercicio2.Videojuego(
                "VALHEIM", 2015, 49.99, 15, "ACCION", "PLAY STATION");
        final var videojuego3 = new ejercicio2.Videojuego(
                "MARIO BROS", 1998, 69.99, 5, "COMEDIA", "NINTENDO");

        System.out.printf("Nombre: %s, Genero: %s , Empresa: %s%n", videojuego.getNombre(), videojuego.getGenero(), videojuego.getEmpresa());
        System.out.printf("Nombre: %s, Genero: %s , Empresa: %s%n", videojuego2.getNombre(), videojuego2.getGenero(), videojuego2.getEmpresa());
        System.out.printf("Nombre: %s, Genero: %s , Empresa: %s%n", videojuego3.getNombre(), videojuego3.getGenero(), videojuego3.getEmpresa());
    }
}