package utilities;/*
Metodos:
    estructura:
        static tipoDatoRetorno nombreMetodo (tipoDato1 parametro 1, tipoDato2, parametro2,...tipoDaton parametron)

        Parametros: - si no hay la estructura va: static tipoDatoRetorno nombreParametro()
                    - si el parametro esta en gris este no se usa y se debe conciderar tomarlo o borrarlo

    cuerpo de metodo:
        desarrollo en base al encabezado
        al final se debe retornar el tipo de dato especificado
        en void no se pone return
        solo se pone en tipo de dato
        se colocan al nivel de main dentro de la clase no dentro de main
        si el metodo esta gris no se usa
        se pueden colocar variables/datos locales adentro del metodo
        el metodo se llama dentro del main de la clase donde se encuentra.
        existen clases que no tienen main y solo metodos, se usan para llamarlos en otras clases
 */

public class RandomUtilities {
    public static int generarRandomInt(int min, int max, java.util.Random random) {
        return random.nextInt(max - min + 1) + min;
    }

    public static double generarRandomDouble(int min, int max, java.util.Random random) {
        return (max - min) * random.nextDouble() + min;
    }

    public static double calcularFuerza(double masa, double aceleracion) {
        return masa * aceleracion;
    }

    public static void imprimirResultado(double masa, double aceleracion, double fuerza) {
        System.out.printf("Para una masa de %.4f y aceleracion de %.4f tenemos una fuerza de %.4f.", masa, aceleracion, fuerza);
    }

    public static double calcularVelocidadFinal(double vi, double a, double t) {
        return vi + a * t;
    }

    public static void imprimirVelocidadFinal(double vi, double a, double t, double vf) {
        System.out.printf("%n %nPara una velocidad inicial de %.3f, una aceleracion de %.3f y un tiempo de %,3f. Se tiene una velocidad final de %.3f"
                , vi, a, t, vf);
    }

    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    public static void imprimirHipotenusa(double cateto1, double cateto2, double hipotenusa) {
        System.out.printf("%n %nPara los catetos %.3f y %.3f tenemos una hipotenusa de %.3f.", cateto1, cateto2, hipotenusa);
    }

    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    public static void imprimirAreaPerimetro(double radio, double area, double perimetro) {
        System.out.printf("%n %nPara un radio de %.3f se tiene un perimetro d %.3f y un area de %,3f", radio, perimetro, area);
    }

    public static int[] generarRandomArrayInt(int n, int min, int max, java.util.Random random) {
        final var array = new int[n]; // declaracion de Array.Array
        for (var i = 0; i < n; i++) {
            array[i] = generarRandomInt(min, max, random);
        }
        return array;
    }

    public static double[] generarRandomArrayDouble(int n, int min, int max, java.util.Random random) {
        final var array = new double[n];
        for (var i = 0; i < n; i++) {
            array[i] = generarRandomDouble(min, max, random);
        }
        return array;
    }

    public static java.util.List<Integer> generarRandomIntLista(int n, int min, int max, java.util.Random random) {
        final var listaAleatoria = new java.util.ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            listaAleatoria.add(generarRandomInt(min, max, random));
        }
        return listaAleatoria;
    }

    public static java.util.List<Double> generarRandomDoubleLista(int n, int min, int max, java.util.Random random) {
        final var listaAleatoria = new java.util.ArrayList<Double>();
        for (int i = 0; i < n; i++) {
            listaAleatoria.add(generarRandomDouble(min, max, random));
        }
        return listaAleatoria;
    }
}
