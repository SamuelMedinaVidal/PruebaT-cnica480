import java.util.HashMap;

public class DiscoDuro extends Almacenamiento{

    public DiscoDuro(String nombre, int capacidad, HashMap<String, Integer> contenido, String marca) {
        super(nombre, capacidad, contenido, marca);
    }

    @Override
    public void girar() {
        System.out.println("Disco duro girando...");
    }

    @Override
    public void almacenarDatos() {
        System.out.println("Almacenando datos en el Disco Duro mediante cabezal magnético...");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo Disco Duro mediante cabezal magnético...");
    }
}
