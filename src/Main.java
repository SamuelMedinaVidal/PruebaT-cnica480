import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de Almacenamiento");

        //Solicitar datos del Disco Duro
        DiscoDuro discoDuro = crearDiscoDuro(scanner);

        //Solicitar datos del CD
        CD cd = crearCD(scanner);

        //Solicitar datos del Vinilo
        Vinilo vinilo = crearVinilo(scanner);

        //Solicitar datos del Blue Ray
        BlueRay blueRay = crearBlueRay(scanner);

        //Creación del Frisbee
        Frisbee frisbee = new Frisbee();

        //Creación de la Rueda
        Rueda rueda = new Rueda();

        //Menú para interactuar con los discos
        menu(scanner, discoDuro, cd, vinilo, blueRay, frisbee, rueda);

        scanner.close();
    }

    //Solicitar la creación de un Disco Duro
    public static DiscoDuro crearDiscoDuro(Scanner scanner) {
        System.out.println("Dime el nombre del Disco Duro: ");
        String nombre = scanner.next();
        System.out.println("Dime la capacidad del Disco Duro en MB: ");
        int capacidad = scanner.nextInt();
        System.out.println("Dime la marca del Disco Duro: ");
        String marca = scanner.next();
        HashMap<String, Integer> contenido = new HashMap<>();
        return new DiscoDuro(nombre, capacidad, contenido, marca);
    }

    //Solicitar la creación de un CD
    public static CD crearCD(Scanner scanner) {
        System.out.println("Dime el nombre del CD: ");
        String nombre = scanner.next();
        System.out.println("Dime la capacidad del CD en MB: ");
        int capacidad = scanner.nextInt();
        System.out.println("Dime la marca del CD: ");
        String brand = scanner.next();
        HashMap<String, Integer> contenido = new HashMap<>();
        return new CD(nombre, capacidad, contenido, brand);
    }

    //Solicitar la creación de un Vinilo
    public static Vinilo crearVinilo(Scanner scanner) {
        System.out.println("Dime el nombre del Vinilo: ");
        String nombre = scanner.next();
        System.out.println("Dime la capacidad del Vinilo en MB: ");
        int capacidad = scanner.nextInt();
        System.out.println("Dime la marca del Vinilo:");
        String marca = scanner.next();
        HashMap<String, Integer> contenido = new HashMap<>();
        return new Vinilo(nombre, capacidad, contenido, marca);
    }

    //Solicitar la creación de un Blue Ray
    public static BlueRay crearBlueRay(Scanner scanner) {
        System.out.println("Dime el nombre del BlueRay: ");
        String nombre = scanner.next();
        System.out.println("Dime la capacidad del BlueRay en MB: ");
        int capacidad = scanner.nextInt();
        System.out.println("Dime la marca del BlueRay:");
        String marca = scanner.next();
        HashMap<String, Integer> contenido = new HashMap<>();
        return new BlueRay(nombre, capacidad, contenido, marca);
    }

    //Menú para gestionar el almacenamiento
    public static void menu(Scanner scanner, DiscoDuro discoDuro, CD cd, Vinilo vinilo, BlueRay blueRay, Frisbee frisbee, Rueda rueda) {
        int opcion;
        do {
            System.out.println("\n1. Añadir datos al Disco Duro");
            System.out.println("2. Añadir datos al CD");
            System.out.println("3. Añadir datos al Vinilo");
            System.out.println("4. Añadir datos al BlueRay");
            System.out.println("5. Girar Frisbee");
            System.out.println("6. Girar Rueda");
            System.out.println("7. Mostrar información del Disco Duro");
            System.out.println("8. Mostrar información del CD");
            System.out.println("9. Mostrar información del Vinilo");
            System.out.println("10. Mostrar información del BlueRay");
            System.out.println("11. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    //Añadir datos al Disco Duro
                    almacenarDatosDiscoDuro(scanner, discoDuro);
                    break;
                case 2:
                    //Añadir datos al CD
                    almacenarDatosCD(scanner, cd);
                    break;
                case 3:
                    //Añadir datos al Vinilo
                    almacenarDatosVinilo(scanner, vinilo);
                    break;
                case 4:
                    //Añadir datos al Blue Ray
                    almacenarDatosBlueRay(scanner, blueRay);
                    break;
                case 5:
                    //Girar Frisbee
                    frisbee.girar();
                    break;
                case 6:
                    //Girar Rueda
                    rueda.girar();
                    break;
                case 7:
                    //Mostrar información del Disco Duro
                    discoDuro.reportarInformacion();
                    break;
                case 8:
                    //Mostrar información del CD
                    cd.reportarInformacion();
                    break;
                case 9:
                    //Mostrar información del Vinilo
                    vinilo.reportarInformacion();
                    break;
                case 10:
                    //Mostrar información del BlueRay
                    blueRay.reportarInformacion();
                    break;
                case 11:
                    //Salir
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 5.");
            }
        } while (opcion != 11);
    }

    //Almacenar datos en el Disco Duro
    public static void almacenarDatosDiscoDuro(Scanner scanner, DiscoDuro discoDuro) {
        System.out.println("Dime qué quieres añadir al Disco Duro: ");
        String fichero = scanner.next();
        System.out.println("Dime la capacidad en MB del archivo: ");
        int archivo = scanner.nextInt();
        discoDuro.girar();
        discoDuro.almacenarDatos();
        discoDuro.getContenido().put(fichero, archivo);
    }

    //Almacenar datos en el CD
    public static void almacenarDatosCD(Scanner scanner, CD cd) {
        System.out.println("Dime qué quieres añadir al CD: ");
        String fichero = scanner.next();
        System.out.println("Dime la capacidad en MB del archivo: ");
        int archivo = scanner.nextInt();
        cd.girar();
        cd.almacenarDatos();
        cd.getContenido().put(fichero, archivo);
    }

    //Almacenar datos en el Vinilo
    public static void almacenarDatosVinilo(Scanner scanner, Vinilo vinilo) {
        System.out.println("Dime qué quieres añadir al Vinilo: ");
        String fichero = scanner.next();
        System.out.println("Dime la capacidad en MB del archivo: ");
        int archivo = scanner.nextInt();
        vinilo.girar();
        vinilo.almacenarDatos();
        vinilo.getContenido().put(fichero, archivo);
    }

    //Almacenar datos en el BlueRay
    public static void almacenarDatosBlueRay(Scanner scanner, BlueRay blueRay) {
        System.out.println("Dime qué quieres añadir al vinilo: ");
        String fichero = scanner.next();
        System.out.println("Dime la capacidad en MB del archivo: ");
        int archivo = scanner.nextInt();
        blueRay.girar();
        blueRay.almacenarDatos();
        blueRay.getContenido().put(fichero, archivo);
    }
}
