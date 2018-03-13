import java.util.Scanner;

public class JugadorController {
    BDController jugadorControler;

    public JugadorController() {
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
        jugadorControler.altaJugador(jugador);
    }
}
