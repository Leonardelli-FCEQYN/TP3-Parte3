package modelo;

public class Cliente {
    public FlightBooking hacerReserva(TipoVuelo tipoVuelo, int cantAsientos) {
        Director director = new Director();
        FlightBookingBuilder builder = new FlightBookingBuilder();

        switch (tipoVuelo) {
            case ESTANDAR:
                director.construirReservaEstandar(builder, cantAsientos);
                return builder.obtenerResultado();
        
            case PREMIUM:
                director.construirReservaPremium(builder, cantAsientos);
                return builder.obtenerResultado();
            
            default:
                throw new IllegalArgumentException("Tipo de vuelo no soportado: " + tipoVuelo);
        }
    }
}
