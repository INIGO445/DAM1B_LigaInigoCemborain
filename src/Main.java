import java.nio.file.WatchService;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Liga miLiga;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el país de la liga:");
        String pais = teclado.nextLine();
        miLiga = new Liga(pais);
        int opcion = 0;
        while (opcion != 6) {
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
            else if (opcion == 2)
            {
                insertarJugador();
            }
            else if (opcion == 3)
            {
                VerLiga();
            }
            else if (opcion == 4)
            {
                verJugadores();
            }
            else if (opcion == 5)
            {
                venderJugador();
            }
            else if (opcion == 6)
            {
                break;
            }
            else
            {
                System.out.println("Error, esta opcion no esta en la lista, Volviendo al menu...");
            }
        }
    }
    public static void insertarEquipo()
    {
        if(miLiga.getNumEquipos() >= 20)
        {
            System.out.println("La liga está llena.");
        }
        else {
            Scanner equipo = new Scanner(System.in);
            System.out.println("Inserte el Nombre del equipo");
            String nombre = equipo.nextLine();
            System.out.println("Inserte la ciudad del equipo");
            String ciudad = equipo.nextLine();
            System.out.println("Creando equipo…");
            Equipo miEquipo = new Equipo(nombre, ciudad);
            System.out.println("Insertando equipo…");
            miLiga.anadirEquipo(miEquipo);
            System.out.println("Equipo " + nombre + " insertado");
        }
    }
    public static void insertarJugador()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique el nombre del equipo donde quiere insertar el jugador:");
        String elEquipo = teclado.nextLine();
        Equipo miEquipo = miLiga.getEquipo(elEquipo);
        if(miEquipo.getNombre() != elEquipo)
        {
            System.out.println("El equipo indicado no existe.");
        }
        else if (miEquipo.getNumJugadores() >= 20)
        {
            System.out.println("El equipo está lleno.");
        }
        else
        {
            System.out.println("Indique el nombre del jugador:");
            String jugador = teclado.nextLine();
            System.out.println("Indique la nacionalidad del jugador:");
            String nacionalidad = teclado.nextLine();
            System.out.println("Indique la edad del jugador:");
            int edad = teclado.nextInt();
            System.out.println("Indique la posición del jugador:");
            String poscion = teclado.nextLine();
            while (poscion != "POR" || poscion != "DEF" || poscion != "CTC" || poscion != "DEL")
            {
                System.out.println("Posición no valida");
                System.out.println("Inserte la posición del jugador:");
                poscion = teclado.nextLine();
            }
            Jugador miJugador = new Jugador(jugador, nacionalidad, edad, poscion);
            miEquipo.adquirirJugador(miJugador);
        }
    }
    public static void VerLiga()
    {
        System.out.println("**********COMPOSICIÓN DE LA LIGA*************************");
        System.out.println("Equipo\t\tCiudad\t\tNumero jugadores");
        miLiga.mostrarListadoEquipos();
    }
    public static void verJugadores()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique el equipo que quiere visualizar:");
        String equipo = teclado.nextLine();
        Equipo miEquipo = miLiga.getEquipo(equipo);
        System.out.println(miEquipo);
    }
    public static void venderJugador()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el nombre del equipo donde quiere vender el jugador:");
        String equipo = teclado.nextLine();
        Equipo miEquipo = miLiga.getEquipo(equipo);
        if(miEquipo != null)
        {
            System.out.println("El equipo indicado no existe.");
        }
        System.out.println("Inserte el nombre del jugador:");
        String nombre = teclado.nextLine();
        if (nombre == null)
        {
            System.out.println("El jugador no existe.");
        }
        else
        {
            Equipo elEquipo = miLiga.getEquipo(equipo);
            System.out.println("Vendiendo jugador…");
            elEquipo.venderJugador(nombre);
            System.out.println("Jugador vendido.");
        }
    }
}