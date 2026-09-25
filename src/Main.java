// clase Main: aca esta el menu para usar el arbol de inventario
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // creamos el arbol y el scanner para leer lo que escribe el usuario
        ArbolInventario inventario = new ArbolInventario();
        Scanner sc = new Scanner(System.in);

        int opcion;

        // el menu se repite hasta que el usuario elija salir (opcion 0)
        do {
            // ================== MOSTRAR MENU ==================
            System.out.println("\n===== TREE-STOCK =====");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Buscar producto");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpia el enter que queda pendiente

            // ================== SWITCH DE OPCIONES ==================
            switch (opcion) {

                // ---- registrar producto ----
                case 1:
                    System.out.print("ID del producto: ");
                    int idNuevo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre del producto: ");
                    String nombreNuevo = sc.nextLine();

                    inventario.insertar(idNuevo, nombreNuevo);
                    System.out.println("Producto registrado.");
                    break;

                // ---- mostrar inventario ----
                case 2:
                    System.out.println("\n--- Inventario ordenado por ID ---");
                    inventario.mostrarInorden();
                    break;

                // ---- buscar producto ----
                case 3:
                    System.out.print("ID a buscar: ");
                    int idBuscar = sc.nextInt();

                    if (inventario.buscar(idBuscar)) {
                        System.out.println("El producto SI existe en el inventario.");
                    } else {
                        System.out.println("El producto NO existe en el inventario.");
                    }
                    break;

                // ---- salir ----
                case 0:
                    System.out.println("Saliendo de Tree-Stock...");
                    break;

                // ---- opcion invalida ----
                default:
                    System.out.println("Esa opcion no existe, intenta de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}