package ejercicio3;

public class Vector2D {
    // atributos
    private final String nombre;
    private final double x;
    private final double y;
    private final double modulo;

    //metodo para calcular el modulo
    private double calcularModulo() { // se declara sin static porque su valos sera distinto para cada uno y pertenece a un objeto
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    // se declara el constructor
    public Vector2D(String nombre, double x, double y) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.modulo = calcularModulo();
    }

    //metodo suma de vectores este si es estatico porque es igual para todos los objetos
    public static Vector2D calcularSuma(String nombre, Vector2D vector1, Vector2D vector2) {
        final var x = vector1.x + vector2.x;
        final var y = vector1.y + vector2.y;

        return new ejercicio3.Vector2D(nombre, x, y);
    }

    public double getModulo() {
        return modulo;
    }

    public String getNombre() {
        return nombre;
    }
}
