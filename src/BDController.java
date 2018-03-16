import java.sql.*;
import java.util.ArrayList;

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

    public ArrayList<Estadisticas> consultaEstJug(int codigo){
        String sql ="SELECT Nombre, temporada, Puntos_por_partido, Asistencias_por_partido, Tapones_por_partido, Rebotes_por_partido FROM estadisticas INNER JOIN jugadores  ON estadisticas.jugador = jugadores.codigo WHERE codigo = "+codigo+";";
        ArrayList<Estadisticas> estadisticas = new ArrayList<Estadisticas>();
        try {
            System.out.println("Buscando jugador");
            Statement myStatement = this.conexion.createStatement();
            ResultSet rs = myStatement.executeQuery(sql);
            while (rs.next()){
                estadisticas.add(new Estadisticas(rs.getString("Nombre"),rs.getString("temporada"),rs.getFloat("Puntos_por_partido"),rs.getFloat("Asistencias_por_partido"), rs.getFloat("Tapones_por_partido"),rs.getFloat("Rebotes_por_partido")));
            }
            myStatement.close();
            System.out.println("Ok");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return estadisticas;
    }

    public ArrayList<Estadisticas> maximosAnotadores(String temporada){
        String sql ="select temporada, Nombre, Puntos_por_partido from estadisticas INNER JOIN jugadores ON estadisticas.jugador = jugadores.codigo where temporada =  \'"+temporada+"\' order by Puntos_por_partido desc limit 10;";
        ArrayList<Estadisticas> estadisticas = new ArrayList<>();
        try {
            System.out.println("Buscando maximos anotadores");
            Statement myStatement = this.conexion.createStatement();
            ResultSet rs = myStatement.executeQuery(sql);
            while (rs.next()){
                estadisticas.add(new Estadisticas(rs.getString("temporada"),rs.getString("Nombre"),rs.getFloat("Puntos_por_partido")));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return estadisticas;
    }
}
