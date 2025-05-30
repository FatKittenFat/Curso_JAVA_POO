package herencias.ejercicio1.models;

public class PersonaPadre {
    protected final String nombre;
    protected final String apellido;
    protected final int edad;
    protected final boolean casado;

    public PersonaPadre(String nombre, String apellido, int edad, boolean casado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
    }
}
