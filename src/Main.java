import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el país de la liga:");
        String pais = teclado.nextLine();
        Liga miLiga = new Liga(pais);
        int opcion = 1;
        while (opcion !=6) {
            System.out.println("MENU DE LA LIGA DE" + miLiga.getPais());
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
        System.out.println("Inserte el Nombre del equipo");
        Scanner equipo = new Scanner(System.in);
        String nombre = equipo.nextLine();
        System.out.println("Inserte la ciudad del equipo");
        String ciudad = equipo.nextLine();
        System.out.println("Creando equipo…");
        Equipo miEquipo = new Equipo(nombre, ciudad);
        System.out.println("Insertando equipo…");
        miLiga.anadirEquipo(miEquipo);
        System.out.println("Equipo " + nombre + " insertado");

    }
    public static void insertarJugador()
    {
        Scanner nombre = new Scanner(System.in);
        System.out.println("Indique el nombre del equipo donde quiere insertar el jugador:");


    }
    public static void VerLiga()
    {

    }
    public static void verJugadores()
    {

    }
    public static void venderJugador()
    {

    }
}