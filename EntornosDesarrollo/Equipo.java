package EntornosDesarrollo;

/**
 * Clase equipo
 *
 * Encargada de recoger los equipos de la aplicacion
 *
 * @author Víctor Infantes Guerra
 * @version 1.0
 */

public class Equipo {
    private String nombre;
    private String sede;
    private String campo;
    /**
     * Array con los objetos jugadores del equipo
     */
    private Jugador[] jugadores;

    public Equipo() {
    }

    public Equipo(String nombre, String sede, String campo, String Jugador) {
        this.nombre = nombre;
        this.sede = sede;
        this.campo = campo;
        this.jugadores = jugadores;
    }

    /**
     * Crea tantos jugadores como se indica con los datos vacios
     *
     * @param numJugadores numero de jugadores a crear
     */
    public void crearJugadores (int numJugadores) {
        for (int i = 0; i < numJugadores; i++) {
            Jugador nuevojugador = new Jugador();
            jugadores[i] = nuevojugador;
        }
        System.out.println("Jugadores añadidos");
    }

    /**
     * Devuelve la posicion del jugador indicado tras buscarlo en el array jugadores
     *
     * @param jugador jugador a buscar
     * @return cadena con la posicion del jugador
     */
    public String consultarPosicion (Jugador jugador) {
        //TODO: Imprementar mas tarde
        return "Sin posicion";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", sede='" + sede + '\'' +
                ", campo='" + campo + '\'' +
                ", jugadores='" + jugadores + '\'' +
                '}';
    }
}
