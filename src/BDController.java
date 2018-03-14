import java.sql.*;

public class BDController {
    private Connection conexion;
    private PreparedStatement cPrepJugadores;

    BDController(){
        try {
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/nba", "root","");
            this.cPrepJugadores = conexion.prepareStatement("SELECT * FROM jugadores");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public void altaJugador(Jugador jugador){
        String insert ="INSERT INTO jugadores VALUES(\'" + jugador.getCodigo() + "\',\'" + jugador.getNombre() + "\',\'" + jugador.getProcedencia() + "\',\'" + jugador.getAltura() + "\',\'" + jugador.getPeso() + "\',\'" + jugador.getPosicion() + "\',\'" + jugador.getNombreEquipo() + "\');";
        try {
            Statement myStatement = this.conexion.createStatement();
            myStatement.executeUpdate(insert);
            myStatement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public void bajaJugador(int codigo){
        String delete ="DELETE FROM jugadores WHERE codigo=" + codigo + ";";
        try {
            System.out.println("Borrando jugador");
            Statement myStatement = this.conexion.createStatement();
            myStatement.executeUpdate(delete);
            myStatement.close();
            System.out.println("Ok");
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
