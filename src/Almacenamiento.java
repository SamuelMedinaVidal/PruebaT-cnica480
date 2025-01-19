import java.util.HashMap;

public abstract class Almacenamiento implements Girar{

    private String nombre;
    private int capacidad;
    private HashMap<String, Integer> contenido;
    private final String Marca; //Atributo para la marca, sin setter

    public Almacenamiento(String nombre, int capacidad, HashMap<String, Integer> contenido, String marca) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.contenido = contenido;
        this.Marca = marca;
    }

    public abstract void almacenarDatos();

    public abstract void leerDatos();

    public void reportarInformacion() {
        girar();
        leerDatos();
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Capacidad: " + this.capacidad);
        System.out.println("Contenido: " + this.contenido);
        System.out.println("Marca: " + this.Marca);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public HashMap<String, Integer> getContenido() {
        return contenido;
    }

    public void setContenido(HashMap<String, Integer> contenido) {
        this.contenido = contenido;
    }

    public String getMarca() {
        return Marca;
    }
}
