package herencias.ejercicio2.models;

public class CuadradoHijo extends FiguraPadre {
    private final Double lado;

    // constructor
    public CuadradoHijo(Double lado) {
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }

    private void calcularPerimetro() {
        perimetro = 4 * lado;
    }

    private void calcularArea() {
        area = Math.pow(lado, 2);
    }

    @Override
    public String toString() {
        final var json = """
                {
                    area: %.2f
                    perimetro: %.2f
                    lado: %.2f
                }
                """;
        return String.format(json, area, perimetro, lado);
    }
}