import java.util.HashMap;

public class CD extends Almacenamiento{

    public CD(String nombre, int capacidad, HashMap<String, Integer> contenido, String marca) {
        super(nombre, capacidad, contenido, marca);
    }

    @Override
    public void girar() {
        System.out.println("CD girando...");
    }

    @Override
    public void almacenarDatos() {
        System.out.println("Almacenando datos en el CD mediante láser...");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo CD mediante láser...");
    }
}
