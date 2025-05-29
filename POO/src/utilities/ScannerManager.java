package utilities;

public class ScannerManager {
    public static int leerInt(java.util.Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.nextInt();
    }

    public static double leerDouble(java.util.Scanner scanner, String mensaje) {
        System.out.printf("%s:", mensaje);
        return scanner.nextDouble();
    }

    public static String leerString(java.util.Scanner scanner, String mensaje) {
        System.out.printf("%s:", mensaje);
        return scanner.nextLine();
    }

    public static char leerChar(java.util.Scanner scanner, String mensaje) {
        System.out.printf("%s:", mensaje);
        return scanner.next().charAt(0);
    }

    static boolean leerBooleano(java.util.Scanner scanner, String mensaje) {
        System.out.printf("%s:", mensaje);
        return scanner.nextBoolean();
    }
}
