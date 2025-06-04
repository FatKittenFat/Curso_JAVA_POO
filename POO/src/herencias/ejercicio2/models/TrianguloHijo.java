package herencias.ejercicio2.models;

public class TrianguloHijo extends FiguraPadre {
    private final Double lado1;
    private final Double lado2;
    private final Double lado3;

    public TrianguloHijo(Double lado1, Double lado2, Double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        calcularArea();
        calcularPerimetro();
    }

    private void calcularArea() {
        final var s = (lado1 + lado2 + lado3) / 2;

        area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    private void calcularPerimetro() {
        perimetro = lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
        final var json = """
                {
                    area: %.2f
                    perimetro: %.2f
                    lado1: %.2f
                    lado2: %.2f
                    lado3: %.2f 
                }
                """;
        return String.format(json, area, perimetro, lado1, lado2, lado3);
    }
}
