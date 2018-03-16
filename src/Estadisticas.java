public class Estadisticas {
    private String temporada;
    private int codJugador;
    private float puntos_por_partido;
    private float asistencias_por_partido;
    private float tapones_por_partido;
    private float rebotes_por_partido;
    private String nombre;

    public Estadisticas() {
    }

    public Estadisticas(String temporada, int codJugador, float puntos_por_partido, float asistencias_por_partido, float tapones_por_partido, float rebotes_por_partido, String nombre) {
        this.temporada = temporada;
        this.codJugador = codJugador;
        this.puntos_por_partido = puntos_por_partido;
        this.asistencias_por_partido = asistencias_por_partido;
        this.tapones_por_partido = tapones_por_partido;
        this.rebotes_por_partido = rebotes_por_partido;
        this.nombre = nombre;
    }

    public Estadisticas(String nombre, String temporada, float puntos_por_partido, float asistencias_por_partido, float tapones_por_partido, float rebotes_por_partido) {
        this.temporada = temporada;
        this.codJugador = codJugador;
        this.puntos_por_partido = puntos_por_partido;
        this.asistencias_por_partido = asistencias_por_partido;
        this.tapones_por_partido = tapones_por_partido;
        this.rebotes_por_partido = rebotes_por_partido;
        this.nombre = nombre;
    }

    public Estadisticas(String temporada, String nombre, float puntos_por_partido){
        this.temporada = temporada;
        this.nombre = nombre;
        this.puntos_por_partido = puntos_por_partido;
    }



    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public int getCodJugador() {
        return codJugador;
    }

    public void setCodJugador(int codJugador) {
        this.codJugador = codJugador;
    }

    public float getPuntos_por_partido() {
        return puntos_por_partido;
    }

    public void setPuntos_por_partido(float puntos_por_partido) {
        this.puntos_por_partido = puntos_por_partido;
    }

    public float getAsistencias_por_partido() {
        return asistencias_por_partido;
    }

    public void setAsistencias_por_partido(float asistencias_por_partido) {
        this.asistencias_por_partido = asistencias_por_partido;
    }

    public float getTapones_por_partido() {
        return tapones_por_partido;
    }

    public void setTapones_por_partido(float tapones_por_partido) {
        this.tapones_por_partido = tapones_por_partido;
    }

    public float getRebotes_por_partido() {
        return rebotes_por_partido;
    }

    public void setRebotes_por_partido(float rebotes_por_partido) {
        this.rebotes_por_partido = rebotes_por_partido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estadisticas{" +
                "temporada='" + temporada + '\'' +
                ", codJugador=" + codJugador +
                ", puntos_por_partido=" + puntos_por_partido +
                ", asistencias_por_partido=" + asistencias_por_partido +
                ", tapones_por_partido=" + tapones_por_partido +
                ", rebotes_por_partido=" + rebotes_por_partido +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
