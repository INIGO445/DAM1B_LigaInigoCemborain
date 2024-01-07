import java.sql.ClientInfoStatus;

public class Equipo {
    private String nombre;
    private String ciudad;
    private final int numMaxJugadores = 22;
    private Jugador[] ListaJugadores;

    public Equipo(String nomEquipo, String nomCiudad)
    {
        nombre = nomEquipo;
        ciudad = nomCiudad;
        ListaJugadores = new Jugador[numMaxJugadores];
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
    public int getNumJugadores()
    {
        int cuantos = 0;
        for(int posicion = 0;posicion< ListaJugadores.length;posicion++)
        {
            if (ListaJugadores[posicion] != null)
            {
                cuantos ++;
            }
        }
        System.out.println(cuantos);
        return cuantos;
    }
    public void mostrarListaJugadores()
    {
        for (int posicion = 0;posicion < ListaJugadores.length;posicion++)
        {
            String situacion = "";
            if(ListaJugadores[posicion].getLesionado())
            {
                situacion = "SI";
            }
            else
            {
                situacion = "NO";
            }
            System.out.print(ListaJugadores[posicion].getNombre() + ListaJugadores[posicion].getPosicion() + ListaJugadores[posicion].getEdad() + ListaJugadores[posicion].getNacionalidad() + " " + situacion);
        }
    }
    public void adquirirJugador(Jugador jugador)
    {
        for (int posicion = 0;posicion < ListaJugadores.length;posicion++)
        {
            if(ListaJugadores[posicion] == null)
            {
                ListaJugadores[posicion] = jugador;
                break;
            }
        }
    }
    public void venderJugador(String nombreJugador)
    {
        for (int posicion = 0;posicion < ListaJugadores.length;posicion++)
        {
            if (ListaJugadores[posicion].getNombre() == nombreJugador)
            {
                for(int borrar = posicion; borrar < ListaJugadores.length; borrar++)
                {
                    if (borrar < 21)
                    {
                        ListaJugadores[borrar] = ListaJugadores[borrar + 1];
                    }
                    else if(borrar == 21)
                    {
                        ListaJugadores[posicion] = null;
                    }

                }
            }
        }
    }
}


