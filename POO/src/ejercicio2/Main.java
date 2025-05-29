package ejercicio2;

public class Main {
    public static void main(String[] args) {
        final var videojuego = new ejercicio2.Videojuego(
                "BLUE PROTOCOL", 2011, 58.99, 45, "TERROR", "XBOX");
        final var videojuego2 = new ejercicio2.Videojuego(
                "VALHEIM", 2015, 49.99, 15, "ACCION", "PLAY STATION");
        final var videojuego3 = new ejercicio2.Videojuego(
                "MARIO BROS", 1998, 69.99, 5, "COMEDIA", "NINTENDO");

//        System.out.printf("Nombre: %s, Genero: %s , Empresa: %s%n", videojuego.getNombre(), videojuego.getGenero(), videojuego.getEmpresa());
//        System.out.printf("Nombre: %s, Genero: %s , Empresa: %s%n", videojuego2.getNombre(), videojuego2.getGenero(), videojuego2.getEmpresa());
//        System.out.printf("Nombre: %s, Genero: %s , Empresa: %s%n", videojuego3.getNombre(), videojuego3.getGenero(), videojuego3.getEmpresa());

        System.out.printf("Videojuego: %s%n", videojuego);
        System.out.printf("Videojuego2: %s%n", videojuego2);
        System.out.printf("Videojuego3: %s%n", videojuego3);
    }

}
