import java.util.HashMap;

public class Vinilo extends Almacenamiento{
    public Vinilo(String nombre, int capacidad, HashMap<String, Integer> contenido, String marca) {
        super(nombre, capacidad, contenido, marca);
    }

    @Override
    public void girar() {
        System.out.println("Vinilo girando...");
    }

    @Override
    public void almacenarDatos() {
        System.out.println("Almacenando datos en el Vinilo mediante púa...");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo Vinilo mediante púa...");
    }
}
