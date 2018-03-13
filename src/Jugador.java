public class Jugador {
    private int codigo;
    private String nombre;
    private String procedencia;
    private String altura;
    private int peso;
    private String posicion;
    private String nombreEquipo;

    public Jugador() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", procedencia='" + procedencia + '\'' +
                ", altura='" + altura + '\'' +
                ", peso=" + peso +
                ", posicion='" + posicion + '\'' +
                ", nombreEquipo='" + nombreEquipo + '\'' +
                '}';
    }
}
