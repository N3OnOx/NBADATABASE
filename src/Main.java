import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        JugadorController jugadorController = new JugadorController();
        EstadisticasController estadisticasController = new EstadisticasController();
        int opt;
        do {
            mostrarMenu();
            opt = sn.nextInt();
            switch (opt){
                case 1:
                    jugadorController.altaJug();
                    break;
                case 2:
                    jugadorController.bajaJug();
                    break;
                case 3:
                    estadisticasController.consultaEstadisticasJugador();
                    break;
                case 4:
                    estadisticasController.maximosAnotadores10();
                    break;
                case 5:
                    jugadorController.jugadoresPorEquipo();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("Has elegido salir");
                    break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
            }
        }while (opt != 10);
    }
    static void mostrarMenu(){
        System.out.println("1. Alta de jugador");
        System.out.println("2. Baja de jugador");
        System.out.println("3. Consulta de estadisticas de jugador");
        System.out.println("4. Maximos anotadores de la liga");
        System.out.println("5. Consulta listado de jugadores por equipo");
        System.out.println("6. Consulta de los 5 maximos reboteadores de todas las temporadas");
        System.out.println("7. Listado de Jugadores que tengan una media de puntos por partido mayor a 20 en cualquiera de las temporadas");
        System.out.println("8. Listado de todas las estadísticas de todas las temporadas de un jugador en concreto pedido por teclado");
        System.out.println("9. Listado de todos los jugadores de la base de datos con sus estadísticas");
        System.out.println("10. Salir");
    }
}
