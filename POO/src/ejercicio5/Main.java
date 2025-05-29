package ejercicio5;

public class Main {
    public static void main(String[] args) {
        final var colorRojo = new Color("ROJO", "#e74c3c");
        final var colorAzul = new Color("AZUL", "#3498DB");
        final var colorAmarillo = new Color("AMARILLO", "#F7DC6F");

        final var amigo1 = new Amigo("OMAR", "VARGAS", 44, 95.1, true, colorAzul, ejercicio5.Amigo.Profesion.INGENIERO);
        final var amigo2 = new Amigo("SELENA", "RODRIGUEZ", 52, 50.7, true, colorRojo, ejercicio5.Amigo.Profesion.DENTISTA);
        final var amigo3 = new Amigo("EMELINA", "GUTIERREZ", 18, 45.7, false, colorAmarillo, ejercicio5.Amigo.Profesion.ABOGADO);

        System.out.printf("Personas: %s%n %s%n %s%n", amigo1, amigo2, amigo3);
    }
}
