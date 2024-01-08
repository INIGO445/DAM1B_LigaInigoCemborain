import java.util.Objects;

public class Jugador {

    private String nombre;
    private String nacionalidad;
    private int edad;
    private String posicion;
    private boolean lesionado;

    public Jugador(String nomJugador, String nacionalidadJug, int edadJug, String posicionJug)
    {
        nombre = nomJugador;
        nacionalidad = nacionalidadJug;
        edad = edadJug;
        if (Objects.equals(posicionJug, "POR") || Objects.equals(posicionJug, "DEF") || Objects.equals(posicionJug, "CTC") || Objects.equals(posicionJug, "DEL"))
        {
            posicion = posicionJug;
        }
        lesionado = false;
    }

    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public boolean getLesionado() {
        return lesionado;
    }

    public void Lesionarse()
    {
        lesionado = true;
    }
    public void Recuperarse()
    {
        lesionado = false;
    }
}
