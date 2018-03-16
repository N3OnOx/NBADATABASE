import java.util.Scanner;

public class JugadorController {
    BDController jugadorControler;

    public JugadorController() {
        this.jugadorControler = new BDController();
    }

    public BDController getJugadorControler() {
        return jugadorControler;
    }

    public void setJugadorControler(BDController jugadorControler) {
        this.jugadorControler = jugadorControler;
    }

    @Override
    public String toString() {
        return "JugadorController{" +
                "jugadorControler=" + jugadorControler +
                '}';
    }

    public void altaJug(){
        Scanner sc = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        Jugador jugador = new Jugador();
        System.out.println("Dime el codigo: ");
        jugador.setCodigo(sn.nextInt());
        System.out.println("Dime el nombre: ");
        jugador.setNombre(sc.nextLine());
        System.out.println("Dime la procedencia: ");
        jugador.setProcedencia(sc.nextLine());
        System.out.println("Dime la altura: ");
        jugador.setAltura(sc.nextLine());
        System.out.println("Dime el peso: ");
        jugador.setPeso(sn.nextInt());
        System.out.println("Dime la posicion: ");
        jugador.setPosicion(sc.nextLine());
        System.out.println("Dime el nombre del equipo: ");
        jugador.setNombreEquipo(sc.nextLine());
        this.jugadorControler.altaJugador(jugador);
    }

    public void bajaJug(){
        Scanner sn = new Scanner(System.in);
        int codigo = 0;
        System.out.println("Dime el codigo del jugador a eliminar: ");
        codigo = sn.nextInt();
        this.jugadorControler.bajaJugador(codigo);

    }

    public void jugadoresPorEquipo(){
        Scanner sc = new Scanner(System.in);
        String equipo = "";
        System.out.println("Dime el nombre de un equipo");
        equipo = sc.nextLine();
        for (Jugador jug : this.jugadorControler.jugadoresPorEquipo(equipo)){
           System.out.println(jug.toString());
        }
    }
}
