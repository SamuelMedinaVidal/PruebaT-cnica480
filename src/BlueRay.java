import java.util.HashMap;

public class BlueRay extends Almacenamiento{
    public BlueRay(String nombre, int capacidad, HashMap<String, Integer> contenido, String marca) {
        super(nombre, capacidad, contenido, marca);
    }

    @Override
    public void girar() {
        System.out.println("Blue Ray girando...");
    }

    @Override
    public void almacenarDatos() {
        System.out.println("Almacenando datos en el Blue Ray mediante codificación...");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo Blue Ray mediante lector Blue Ray...");
    }
}
