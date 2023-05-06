import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public static ArrayList<Producto> listaproductos = new ArrayList<Producto>();

    public static void main(String[] args) {
        int op;
        do {
            op = menu();
            fun_operaciones(op);
            System.out.println("Desea realizar otra operación:SI(1) ");
            op = scan.nextInt();
        } while (op == 1);

    }

    public static int menu() {
        int respuesta;
        do {
            System.out.println("REGISTRE EL PRODUCTO");
            System.out.println("1: Registre los datos del producto");
            System.out.println("2: Mostrar productos en stock");
            System.out.println("3: Mostrar productos con Iva");
            System.out.println("4: Mostrar productos con precio mayores a 100 y menos a 200");
            System.out.println("Elija la operacion: ");
            respuesta = scan.nextInt();
        } while (respuesta < 1 || respuesta > 6);
        return respuesta;
    }

    public static void fun_operaciones(int op) {
        switch (op) {
            case 1 -> {
                String cod, nom, stock, estado;
                boolean iva;
                float price;
                scan.nextLine();
                System.out.println("Registro de producto");
                System.out.println("Ingrese el codigo: ");
                cod = scan.nextLine();
                System.out.println("Ingrese el nombre: ");
                nom = scan.nextLine();
                System.out.println("Ingrese el precio: ");
                price = scan.nextFloat();
                System.out.println("Ingrese si aplica Iva: (true = si | false = no");
                iva = scan.nextBoolean();
                scan.nextLine();
                System.out.println("Ingrese el stock: ");
                stock = scan.nextLine();
                System.out.println("Ingrese el estado: (activo o inactivo)");
                estado = scan.nextLine();
                Producto obj = new Producto(cod, nom, price, iva, stock, estado);
                listaproductos.add(obj);
            }
            case 2 ->
            {
                System.out.println("Productos en stock");
                prodactivos();
            }
            case 3 ->
            {
                System.out.println("Productos con Iva");
                iva();
            }
            case 4 ->
            {
                System.out.println("Productos con precio mayores a 100 y menores a 200");
                listarxprecios();
            }
            case 5 ->
            {
                System.out.println("Mostrar todos los productos registrados");
            }
        }
    }

    public static void iva() {
        for (int i = 0; i < listaproductos.size(); i++) {
            if (Objects.equals(listaproductos.get(i).getAplicaIva(), "true")) {
                listaproductos.get(i).mostrarProducto();
            }
        }
    }
    public static void fun_listar() {
        for (Producto listaproducto : listaproductos) {
            listaproducto.mostrarProducto();
            System.out.println(" ");
        }
    }

    public static void prodactivos() {
        for (int i = 0; i < listaproductos.size(); i++) {
            if (Objects.equals(listaproductos.get(i).getEstado(), "activo") || Objects.equals(listaproductos.get(i).getEstado(), "a") || Objects.equals(listaproductos.get(i).getEstado(), "A") ){
                listaproductos.get(i).mostrarProducto();

            }
        }
    }
    public static void listarxprecios() {
        for (int i = 0;  i < listaproductos.size(); i++) {
            if (listaproductos.get(i).getPrecioU()>100 && listaproductos.get(i).getPrecioU()<200) {
                listaproductos.get(i).mostrarProducto();
            }

        }
    }
}