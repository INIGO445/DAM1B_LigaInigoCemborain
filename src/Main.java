import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Liga miLiga = new Liga("España");
        System.out.println("MENU DE LA LIGA DE" + miLiga.getPais());
        System.out.println("1-  Insertar Equipo");
        System.out.println("2-  Insertar Jugador");
        System.out.println("3-  Ver equipos de la liga");
        System.out.println("4-  Ver jugadores de un equipo");
        System.out.println("5-  Vender jugador");
        System.out.println("6-  Salir");
        int opcion = teclado.nextInt();
        if(opcion == 1)
        {
            insertarEquipo();
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
        System.out.println("Insertando equipo…");
        Equipo miEquipo = new Equipo(nombre, ciudad);
        System.out.println("Equipo " + nombre + " insertado");
        if ()
    }
}