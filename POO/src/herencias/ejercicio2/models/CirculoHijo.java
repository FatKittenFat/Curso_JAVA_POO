package herencias.ejercicio2.models;

public class CirculoHijo extends FiguraPadre {
    private final double radio;

    // constructor
    public CirculoHijo(double radio) {
        this.radio = radio;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public String toString() {
        final var json = """
                {
                    area: %.2f
                    perimetro: %.2f
                    radio: %.2f
                }
                """;
        return String.format(json, area, perimetro, radio);
    }

    private void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
    }

    private void calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }
}
