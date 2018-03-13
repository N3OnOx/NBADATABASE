import java.sql.*;

public class BDController {
    private Connection conexion;
    private PreparedStatement cPrepJugadores;

    BDController(){
        try {
            this.conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/nba", "root","");
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
        try {
            Statement myStatement = this.conexion.createStatement();
            String sql = "INSERT into jugadores VALUES (\'"+jugador.getCodigo()+"\',\'"+jugador.getCodigo()+"\',\'"+jugador.getCodigo()+"\',\'"+jugador.getCodigo()+"\',\'"+jugador.getCodigo()+"\',\'"+jugador.getCodigo()+"\',\'"+jugador.getCodigo()+"\');";
            myStatement.executeUpdate(sql);
            myStatement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
