import java.nio.file.WatchService;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Liga[] miLiga;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el país de la liga:");
        String pais = teclado.nextLine();
        Liga miLiga = new Liga(pais);
        int opcion = 1;
        while (opcion !=6) {
            System.out.println("MENU DE LA LIGA DE " + miLiga.getPais());
            System.out.println("1-  Insertar Equipo");
            System.out.println("2-  Insertar Jugador");
            System.out.println("3-  Ver equipos de la liga");
            System.out.println("4-  Ver jugadores de un equipo");
            System.out.println("5-  Vender jugador");
            System.out.println("6-  Salir");
            opcion = teclado.nextInt();
            if (opcion == 1)
            {
                insertarEquipo();
            }
            if (opcion == 2)
            {
                insertarJugador();
            }
            if (opcion == 3)
            {
                VerLiga();
            }
            if (opcion == 4)
            {
                verJugadores();
            }
            if (opcion == 5)
            {
                venderJugador();
            }
            if (opcion == 6)
            {
                break;
            }
            if (opcion < 1 || opcion > 6)
            {
                System.out.println("Error, esta opcion no esta en la lista, Volviendo al menu...");
            }
        }
    }
    public static void insertarEquipo()
    {
        Scanner equipo = new Scanner(System.in);
        System.out.println("Inserte el Nombre del equipo");
        String nombre = equipo.nextLine();
        System.out.println("Inserte la ciudad del equipo");
        String ciudad = equipo.nextLine();
        System.out.println("Creando equipo…");
        Equipo miEquipo = new Equipo(nombre, ciudad);
        System.out.println("Insertando equipo…");
        for (int posicion = 0;posicion<miLiga.length;posicion++)
        {
            if (miLiga[posicion] != null)
            {
                miLiga[posicion].anadirEquipo(miEquipo);
            }
        }
        System.out.println("Equipo " + nombre + " insertado");

    }
    public static void insertarJugador()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique el nombre del equipo donde quiere insertar el jugador:");
        String nombre = teclado.nextLine();


    }
    public static void VerLiga()
    {
        System.out.println("**********COMPOSICIÓN DE LA LIGA*************************");
        System.out.println("Equipo\t\tCiudad\t\tNumero jugadores");
        //miLiga.mostrarListadoEquipos();
    }
    public static void verJugadores()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique el equipo que quiere visualizar:");
        String equipo = teclado.nextLine();
        System.out.println("Indique el nombre del jugador:");
        String jugador = teclado.nextLine();
        System.out.println("Indique la nacionalidad del jugador:");
        String nacionalidad = teclado.nextLine();
        System.out.println("Indique la edad del jugador:");
        int edad = teclado.nextInt();
        System.out.println("Indique la posición del jugador:");
        String poscion = teclado.nextLine();
    }
    public static void venderJugador()
    {

    }
}