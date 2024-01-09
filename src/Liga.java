import java.util.Objects;

public class Liga {
    private String pais;
    private final int numMaxEqupos = 20;
    private Equipo[] listadoEquipos;

    public Liga(String ligaPais)
    {
        pais = ligaPais;
        listadoEquipos = new Equipo[numMaxEqupos];
    }
    public void mostrarListadoEquipos()
    {
        for(int equipo = 0;equipo<listadoEquipos.length;equipo++)
        {
            if (listadoEquipos[equipo] != null)
            {
                System.out.println(listadoEquipos[equipo].getNombre() + "\t\t" + listadoEquipos[equipo].getCiudad() + "\t\t" + listadoEquipos[equipo].getNumJugadores());
            }
        }
    }
    public int getNumEquipos()
    {
        int numeros = 0;
        for(int equipo = 0;equipo<listadoEquipos.length;equipo++)
        {
            if(listadoEquipos[equipo] != null)
            {
                numeros ++;
            }
        }
        return numeros;
    }
    public Equipo getEquipo(String nombreEquipo)
    {
        Equipo ElNombre = null;
        for (int nombre = 0;nombre< listadoEquipos.length;nombre++)
        {
            if (listadoEquipos[nombre] != null) {
                if (Objects.equals(listadoEquipos[nombre].getNombre(), nombreEquipo)) {
                    ElNombre = listadoEquipos[nombre];
                    ElNombre.mostrarListaJugadores();
                    break;
                }
            }
        }
        System.out.println(ElNombre);
        return ElNombre;
    }

    public String getPais() {
        return pais;
    }
    public void anadirEquipo(Equipo equipo)
    {
        for (int posicion = 0;posicion < listadoEquipos.length;posicion++)
        {
            if(listadoEquipos[posicion] == null)
            {
                listadoEquipos[posicion] = equipo;
                break;
            }
        }
    }
}
