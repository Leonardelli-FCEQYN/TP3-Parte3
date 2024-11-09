import modelo.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear una instancia de Cliente
        Cliente cliente = new Cliente();

        // Hacer una reserva estándar
        FlightBooking reservaEstandar = cliente.hacerReserva(TipoVuelo.ESTANDAR, 2);
        System.out.println("\nDetalles de la reserva estándar:");
        System.out.println(reservaEstandar);

        // Hacer una reserva premium
        FlightBooking reservaPremium = cliente.hacerReserva(TipoVuelo.PREMIUM, 1);
        System.out.println("\nDetalles de la reserva premium:");
        System.out.println(reservaPremium);
    }
}
