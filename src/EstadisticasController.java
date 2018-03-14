import java.util.Scanner;

public class EstadisticasController {
    BDController estadisticasController;

    public EstadisticasController() {
        this.estadisticasController = new BDController();
    }

    public BDController getEstadisticasController() {
        return estadisticasController;
    }

    public void setEstadisticasController(BDController estadisticasController) {
        this.estadisticasController = estadisticasController;
    }

    public void consultaEstadisticasJugador(){
        Scanner sn = new Scanner(System.in);
        int codigo = 0;
        System.out.println("Dime el codigo del jugador: ");
        codigo = sn.nextInt();
        for (Estadisticas est : this.estadisticasController.consultaEstJug(codigo)){
            System.out.println("Nombre: "+est.getNombre()+" Temporada: "+est.getTemporada()+" PPP: "+est.getPuntos_por_partido()+" APP: "+est.getAsistencias_por_partido()+" TPP: "+est.getTapones_por_partido()+ " RPP: "+est.getRebotes_por_partido());
        }
    }
}
